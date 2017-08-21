package org.msn.test.assignment.players;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.msn.test.assignment.players.config.ApplicationConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ApplicationConfig.class, Application.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PlayersControllerIT {

    @Value("${local.server.port}")
    private int port;

    @Before
    public void setUp() throws Exception {
        RestAssured.port = port;
    }

    @Test
    public void testGetPlayers() throws Exception {

        Response response = given().get("/api/players");

        System.out.println(response.getBody().asString());

        response.then().statusCode(200).body("$", hasSize(2));
    }

    @Test
    public void testGetPlayerByIdSuccess() throws Exception {

        Response response = given().get("/api/player/" + 1);

        System.out.println(response.getBody().asString());

        response.then().statusCode(200).body("playerId", isA(Integer.class)).body("playerId", is(1));

    }

    @Test
    public void testGetPlayerByIdNotFound() throws Exception {

        Response response = given().get("/api/player/" + 123);

        System.out.println(response.getBody().asString());

        response.then().statusCode(404).body(containsString("NOT FOUND"));
    }
}

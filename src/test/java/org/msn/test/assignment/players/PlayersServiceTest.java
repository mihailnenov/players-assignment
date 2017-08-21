package org.msn.test.assignment.players;

import org.junit.Before;
import org.junit.Test;
import org.msn.test.assignment.players.exception.NotFoundException;
import org.msn.test.assignment.players.model.Player;
import org.msn.test.assignment.players.service.PlayersService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlayersServiceTest {

    private PlayersService playersService;

    private List<Player> players = Arrays.asList(new Player(1L), new Player(2L));

    @Before
    public void setUp() {
        playersService = new PlayersService(players);
    }

    @Test
    public void testPlayers() throws Exception {

        List<Player> result = playersService.getPlayers();

        assertNotNull(result);
        assertEquals(result.size(), players.size());
        assertEquals(new Player(1L), result.get(0));
        assertEquals(new Player(2L), result.get(1));
    }

    @Test
    public void testPlayerByIdSuccess() throws Exception {

        Player player = playersService.getPlayer(1L);

        assertNotNull(player);
        assertEquals(new Player(1L), player);
    }

    @Test(expected = NotFoundException.class)
    public void testPlayerByIdError() throws Exception {
        playersService.getPlayer(123L);
    }
}

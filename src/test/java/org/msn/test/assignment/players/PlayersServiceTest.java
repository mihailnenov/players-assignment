package org.msn.test.assignment.players;

import org.junit.Before;
import org.junit.Test;
import org.msn.test.assignment.players.exception.NotFoundException;
import org.msn.test.assignment.players.model.PlayerDetails;
import org.msn.test.assignment.players.model.PlayerStatistics;
import org.msn.test.assignment.players.service.PlayersService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlayersServiceTest {

    private PlayersService playersService;

    private List<PlayerDetails> players = Arrays.asList(new PlayerDetails(1L), new PlayerDetails(2L));

    @Before
    public void setUp() {
        playersService = new PlayersService(players);
    }

    @Test
    public void testPlayers() throws Exception {

        List<PlayerStatistics> result = playersService.getPlayers();

        assertNotNull(result);
        assertEquals(result.size(), players.size());
        assertEquals(new PlayerStatistics(1L), result.get(0));
        assertEquals(new PlayerStatistics(2L), result.get(1));
    }

    @Test
    public void testPlayerByIdSuccess() throws Exception {

        PlayerDetails player = playersService.getPlayer(1L);

        assertNotNull(player);
        assertEquals(new PlayerDetails(1L), player);
    }

    @Test(expected = NotFoundException.class)
    public void testPlayerByIdError() throws Exception {
        playersService.getPlayer(123L);
    }
}

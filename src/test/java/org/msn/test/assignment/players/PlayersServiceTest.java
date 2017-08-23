package org.msn.test.assignment.players;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.msn.test.assignment.players.exception.NotFoundException;
import org.msn.test.assignment.players.model.PlayerDetails;
import org.msn.test.assignment.players.model.PlayerStatistics;
import org.msn.test.assignment.players.repository.PlayersRepository;
import org.msn.test.assignment.players.service.PlayersService;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class PlayersServiceTest {

    private PlayersService playersService;

    @Mock
    private PlayersRepository players;

    private PlayerDetails player1 = new PlayerDetails(1L);
    private PlayerDetails player2 = new PlayerDetails(2L);

    @Before
    public void setUp() {

        Mockito.when(players.findAll()).thenReturn(Arrays.asList(player1, player2));
        Mockito.when(players.findByPlayerId(1L)).thenReturn(Optional.of(player1));
        Mockito.when(players.findByPlayerId(2L)).thenReturn(Optional.of(player2));
        Mockito.when(players.findByPlayerId(123L)).thenReturn(Optional.empty());

        playersService = new PlayersService(players);
    }

    @Test
    public void testPlayers() throws Exception {

        List<PlayerStatistics> result = playersService.getPlayers();

        assertNotNull(result);
        assertEquals(result.size(), players.findAll().size());

        assertEquals(new PlayerStatistics(1L), result.get(0));
        assertEquals(new PlayerStatistics(2L), result.get(1));
    }

    @Test
    public void testPlayerByIdSuccess() throws Exception {

        PlayerDetails player1Found = playersService.getPlayer(1L);

        assertNotNull(player1Found);
        assertEquals(player1, player1Found);

        PlayerDetails player2Found = playersService.getPlayer(2L);

        assertNotNull(player2Found);
        assertEquals(player2, player2Found);
    }

    @Test(expected = NotFoundException.class)
    public void testPlayerByIdError() throws Exception {
        playersService.getPlayer(123L);
    }
}

package org.msn.test.assignment.players;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.msn.test.assignment.players.api.PlayersController;
import org.msn.test.assignment.players.exception.NotFoundException;
import org.msn.test.assignment.players.model.Player;
import org.msn.test.assignment.players.service.PlayersService;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class PlayersControllerTest {

    private PlayersController controller;

    @Mock
    private PlayersService playersService;

    @Before
    public void setUp() throws Exception {
        controller = new PlayersController(playersService);
    }

    @Test
    public void testPlayersListSuccess() throws Exception {

        Mockito.when(playersService.getPlayers()).thenReturn(Arrays.asList(new Player(111L), new Player(222L)));

        List<Player> result = controller.playersList();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(111L, (long) result.get(0).getPlayerId());
        assertEquals(222L, (long) result.get(1).getPlayerId());
    }

    @Test(expected = RuntimeException.class)
    public void testPlayersListError() throws Exception {

        Mockito.when(playersService.getPlayers()).thenThrow(new RuntimeException());

        controller.playersList();
    }

    @Test
    public void testPlayerByIdSuccess() throws Exception {

        Mockito.when(playersService.getPlayer(Mockito.anyLong())).thenReturn(new Player(123L));

        Player player = controller.playerById(1L);

        assertNotNull(player);
        assertEquals(123L, (long) player.getPlayerId());
    }

    @Test(expected = NotFoundException.class)
    public void testPlayerByIdError() throws Exception {

        Mockito.when(playersService.getPlayer(Mockito.anyLong())).thenThrow(new NotFoundException("Not found!"));

        controller.playerById(1L);
    }
}

package org.msn.test.assignment.players.service;

import org.msn.test.assignment.players.exception.NotFoundException;
import org.msn.test.assignment.players.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

@Service
public class PlayersService {

    private List<Player> players;

    public PlayersService(@Autowired List<Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Player getPlayer(Long playerId) {

        return players.stream().filter(p -> p.getPlayerId().equals(playerId)).findFirst()
                .orElseThrow(() -> new NotFoundException("NOT FOUND: Can't find player with id = " + playerId));
    }
}

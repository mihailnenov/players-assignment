package org.msn.test.assignment.players.service;

import org.msn.test.assignment.players.exception.NotFoundException;
import org.msn.test.assignment.players.model.PlayerDetails;
import org.msn.test.assignment.players.model.PlayerStatistics;
import org.msn.test.assignment.players.util.PlayerConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayersService {

    private List<PlayerDetails> players;

    public PlayersService(@Autowired List<PlayerDetails> players) {
        this.players = players;
    }

    public List<PlayerStatistics> getPlayers() {
        return players.stream().map(PlayerConvertor::playerStatisticsFromPlayerDetails).collect(Collectors.toList());
    }

    public PlayerDetails getPlayer(Long playerId) {

        return players.stream().filter(p -> p.getPlayerId().equals(playerId)).findFirst()
                .orElseThrow(() -> new NotFoundException("NOT FOUND: Can't find player with id = " + playerId));
    }
}

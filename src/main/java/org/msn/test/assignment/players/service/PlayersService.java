package org.msn.test.assignment.players.service;

import org.msn.test.assignment.players.exception.NotFoundException;
import org.msn.test.assignment.players.model.PlayerDetails;
import org.msn.test.assignment.players.model.PlayerStatistics;
import org.msn.test.assignment.players.repository.PlayersRepository;
import org.msn.test.assignment.players.util.PlayerConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PlayersService {

    private PlayersRepository players;

    public PlayersService(@Autowired PlayersRepository players) {
        this.players = players;
    }

    public List<PlayerStatistics> getPlayers() {
        return players.findAll().stream().map(PlayerConvertor::playerStatisticsFromPlayerDetails)
                .collect(Collectors.toList());
    }

    public PlayerDetails getPlayer(Long playerId) {

        return players.findByPlayerId(playerId)
                .orElseThrow(() -> new NotFoundException("NOT FOUND: Can't find player with id = " + playerId));
    }
}

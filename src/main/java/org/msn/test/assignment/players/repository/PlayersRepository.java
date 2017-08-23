package org.msn.test.assignment.players.repository;

import org.msn.test.assignment.players.model.PlayerDetails;

import java.util.List;
import java.util.Optional;

public interface PlayersRepository {

    List<PlayerDetails> findAll();

    Optional<PlayerDetails> findByPlayerId(Long playerId);
}

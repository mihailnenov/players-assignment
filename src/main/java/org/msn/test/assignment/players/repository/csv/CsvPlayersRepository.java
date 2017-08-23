package org.msn.test.assignment.players.repository.csv;

import org.msn.test.assignment.players.model.PlayerDetails;
import org.msn.test.assignment.players.repository.PlayersRepository;
import org.msn.test.assignment.players.util.DataLoader;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class CsvPlayersRepository implements PlayersRepository, InitializingBean {

    private final String dataFile;

    public CsvPlayersRepository(@Value("${data.file.name}") String dataFile) {
        this.dataFile = dataFile;
    }

    private List<PlayerDetails> players;

    @Override
    public List<PlayerDetails> findAll() {
        return players;
    }

    @Override
    public Optional<PlayerDetails> findByPlayerId(Long playerId) {
        return players.stream().filter(p -> p.getPlayerId().equals(playerId)).findFirst();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        players = Collections.unmodifiableList(DataLoader.load(dataFile));
    }
}

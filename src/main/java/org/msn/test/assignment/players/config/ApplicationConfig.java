package org.msn.test.assignment.players.config;

import org.msn.test.assignment.players.model.PlayerDetails;
import org.msn.test.assignment.players.util.DataLoader;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.util.List;

@Configuration
public class ApplicationConfig {

    @Value("${data.file.name}")
    private String dataFile;

    @Bean
    public List<PlayerDetails> createListOfPayers() throws IOException {

        return DataLoader.load(dataFile);
    }
}

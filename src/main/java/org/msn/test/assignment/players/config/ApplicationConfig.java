package org.msn.test.assignment.players.config;

import net.sf.jsefa.csv.CsvIOFactory;
import net.sf.jsefa.csv.config.CsvConfiguration;
import org.msn.test.assignment.players.model.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ApplicationConfig {

    @Bean
    public List<Player> createListOfPayers() {

        CsvIOFactory.createFactory(Player.class).createDeserializer();

        return new ArrayList<Player>() {
            {
                add(new Player(1l));
                add(new Player(2l));
            }
        };
    }
}

package org.msn.test.assignment.players.util;


import net.sf.jsefa.common.lowlevel.filter.HeaderAndFooterFilter;
import net.sf.jsefa.csv.CsvDeserializer;
import net.sf.jsefa.csv.CsvIOFactory;
import net.sf.jsefa.csv.config.CsvConfiguration;
import org.msn.test.assignment.players.model.PlayerDetails;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    private DataLoader() {
        // To prevent instantiation of this utility class
    }

    public static List<PlayerDetails> load(String file) throws IOException {

        CsvConfiguration config = new CsvConfiguration();
        config.setLineFilter(new HeaderAndFooterFilter(1, false, true));
        config.setFieldDelimiter(',');

        CsvDeserializer deserializer = CsvIOFactory.createFactory(config, PlayerDetails.class).createDeserializer();

        List<PlayerDetails> result = new ArrayList<>();

        deserializer.open(new InputStreamReader(new ClassPathResource(file).getInputStream()));

        while (deserializer.hasNext()) {
            result.add(deserializer.next());
        }

        deserializer.close(true);

        return result;
    }
}

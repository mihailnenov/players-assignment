package org.msn.test.assignment.players.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;

public class JsonBigDecimalSerializer extends JsonSerializer<BigDecimal> {

    @Override
    public void serialize(BigDecimal value, JsonGenerator generator, SerializerProvider provider)
            throws IOException {

        generator.writeString(value.setScale(5, BigDecimal.ROUND_HALF_EVEN).toPlainString());
    }
}

package br.com.oracle_certificatons.ocp.javaee7.batch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class UppercaseProcessorTest {

    @Test
    void processaItem() {
        assertEquals("JAVA", new UppercaseProcessor().processItem(" java "));
    }

    @Test
    void readerUsaPropriedadeEDevolveNullNoFim() {
        WordReader reader = new WordReader();
        reader.words = "a,b";
        reader.open(null);
        assertEquals("a", reader.readItem());
        assertEquals("b", reader.readItem());
        assertNull(reader.readItem());
    }
}

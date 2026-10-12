package br.com.oracle_certificatons.ocp.javaee7.soap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.bind.JAXBContext;
import org.junit.jupiter.api.Test;

class JaxbRoundTripTest {

    @Test
    void marshalEUnmarshal() throws Exception {
        JAXBContext ctx = JAXBContext.newInstance(BookXml.class);
        BookXml book = new BookXml("978-1430246268", "Beginning Java EE 7", 49.9f);
        book.setInternalNote("não deve ir para o XML");

        StringWriter xml = new StringWriter();
        ctx.createMarshaller().marshal(book, xml);

        assertTrue(xml.toString().contains("<book isbn=\"978-1430246268\">"));
        assertTrue(xml.toString().contains("<book-title>Beginning Java EE 7</book-title>"));
        assertFalse(xml.toString().contains("internalNote"));

        BookXml back = (BookXml) ctx.createUnmarshaller().unmarshal(new StringReader(xml.toString()));
        assertEquals("Beginning Java EE 7", back.getTitle());
        assertNull(back.getInternalNote());
    }
}

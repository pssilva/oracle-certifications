package br.com.oracle_certificatons.ocp.javaee7.websocket;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

class ChatMessageCodecTest {

    @Test
    void encodeDecodeIdaEVolta() {
        String wire = new ChatMessageCodec.TextEncoder().encode(new ChatMessage("ana", "oi|tudo bem?"));
        ChatMessage back = new ChatMessageCodec.TextDecoder().decode(wire);
        assertEquals("ana", back.getAuthor());
        assertEquals("oi|tudo bem?", back.getText());
    }

    @Test
    void naoDecodificaSemAutor() {
        assertFalse(new ChatMessageCodec.TextDecoder().willDecode("|sem autor"));
    }
}

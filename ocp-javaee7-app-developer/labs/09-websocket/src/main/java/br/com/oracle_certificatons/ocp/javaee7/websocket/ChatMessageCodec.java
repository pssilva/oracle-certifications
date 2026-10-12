package br.com.oracle_certificatons.ocp.javaee7.websocket;

import javax.websocket.Decoder;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

/** Formato de fio simples "autor|texto" para focar no contrato Encoder/Decoder. */
public final class ChatMessageCodec {

    private ChatMessageCodec() {
    }

    public static class TextEncoder implements Encoder.Text<ChatMessage> {
        @Override
        public String encode(ChatMessage m) {
            return m.getAuthor() + "|" + m.getText();
        }

        @Override
        public void init(EndpointConfig config) {
        }

        @Override
        public void destroy() {
        }
    }

    public static class TextDecoder implements Decoder.Text<ChatMessage> {
        @Override
        public ChatMessage decode(String s) {
            int i = s.indexOf('|');
            return new ChatMessage(s.substring(0, i), s.substring(i + 1));
        }

        @Override
        public boolean willDecode(String s) {
            return s != null && s.indexOf('|') > 0;
        }

        @Override
        public void init(EndpointConfig config) {
        }

        @Override
        public void destroy() {
        }
    }
}

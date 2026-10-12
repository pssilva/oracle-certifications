package br.com.oracle_certificatons.ocp.javaee7.websocket;

import java.io.IOException;
import javax.websocket.CloseReason;
import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/chat",
        encoders = ChatMessageCodec.TextEncoder.class,
        decoders = ChatMessageCodec.TextDecoder.class)
public class ChatEndpoint {

    @OnOpen
    public void open(Session session) {
        System.out.printf("[chat] open %s (endpoint %d)%n", session.getId(), System.identityHashCode(this));
    }

    @OnMessage
    public void message(ChatMessage message, Session session) throws IOException, EncodeException {
        for (Session peer : session.getOpenSessions()) {
            peer.getBasicRemote().sendObject(message);
        }
    }

    @OnError
    public void error(Session session, Throwable t) {
        System.out.println("[chat] erro: " + t);
    }

    @OnClose
    public void close(Session session, CloseReason reason) {
        System.out.println("[chat] close " + session.getId() + " " + reason.getCloseCode());
    }
}

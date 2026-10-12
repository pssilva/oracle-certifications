package br.com.oracle_certificatons.ocp.javaee7.websocket;

public class ChatMessage {

    private final String author;
    private final String text;

    public ChatMessage(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthor() { return author; }
    public String getText() { return text; }
}

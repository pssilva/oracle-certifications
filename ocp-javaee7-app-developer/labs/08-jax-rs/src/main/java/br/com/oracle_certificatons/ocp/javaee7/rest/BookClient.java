package br.com.oracle_certificatons.ocp.javaee7.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

/** Cliente JAX-RS 2.0. Execute com o WAR implantado e a implementação (Jersey) no classpath. */
public final class BookClient {

    private BookClient() {
    }

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        try {
            String json = client.target("http://localhost:8080/08-jax-rs/api")
                    .path("books/{id}").resolveTemplate("id", 1)
                    .request(MediaType.APPLICATION_JSON)
                    .get(String.class);
            System.out.println(json);
        } finally {
            client.close();
        }
    }
}

package br.com.oracle_certificatons.ocp.javaee7.rest;

import java.net.URI;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/** Recurso por requisição (padrão): o estado compartilhado precisa ser estático/externo. */
@Path("books")
@Produces(MediaType.APPLICATION_JSON)
public class BookResource {

    static final Map<Long, String> BOOKS = new ConcurrentHashMap<>();
    static final AtomicLong SEQ = new AtomicLong();

    static {
        BOOKS.put(SEQ.incrementAndGet(), "Beginning Java EE 7");
    }

    @GET
    public Response list(@QueryParam("limit") @DefaultValue("10") int limit) {
        return Response.ok(Json.createObjectBuilder().add("total", BOOKS.size()).add("limit", limit).build()).build();
    }

    @GET
    @Path("{id}")
    public Response find(@PathParam("id") long id) {
        String title = BOOKS.get(id);
        if (title == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(toJson(id, title)).build();
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    public Response create(String title) {
        long id = SEQ.incrementAndGet();
        BOOKS.put(id, title);
        return Response.created(URI.create("books/" + id)).entity(toJson(id, title)).build();
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") long id) { // void => 204 No Content
        BOOKS.remove(id);
    }

    static JsonObject toJson(long id, String title) {
        return Json.createObjectBuilder().add("id", id).add("title", title).build();
    }
}

package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@Path("/")
public class ExampleResource {

    static Map<String, String> data = new HashMap<>();
    @Path("/{name}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello(@PathParam("name") String name) {
        return data.get(name);
    }

    @Path("/{name}")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void setData(String strData, @PathParam("name") String name){
        data.put(name,strData);
    }

    @Path("/{name}")
    @DELETE
    public void clear(@PathParam("name") String name){
        data.remove(name);
    }
}
package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public class ExampleResource {

    String data= "{ \"Data\": \"Empty\"}";
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return data;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void setData(String str){
        data = str;
    }
    @DELETE
    public void clear(){
        data = "{ \"Data\": \"Empty\"}";
    }
}
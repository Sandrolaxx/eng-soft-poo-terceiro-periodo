package com.fag;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/v1/payment")
public class GreetingResource {
    
    @GET
    @Path("/token")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Acordaaaaa!!!";
    }
}

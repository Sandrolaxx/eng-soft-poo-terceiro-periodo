package com.fag;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/payment-api/v1")
public class GreetingResource {

    @GET
    @Path("/testget")
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        return "Sou metodo Get";
    }

    @GET
    @Path("/testpost")
    @Produces(MediaType.TEXT_PLAIN)
    public String post() {
        return "Sou metodo Post";

    }
}

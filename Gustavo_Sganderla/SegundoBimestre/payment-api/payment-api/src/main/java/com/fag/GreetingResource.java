package com.fag;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.dto.TokenDTO;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/payment")
public class GreetingResource {

    @Inject
    @RestClient
    RestClient rest;

    @GET
    @Path("/token")
    @Produces(MediaType.APPLICATION_JSON)
    public TokenDTO hello() {
        Form form = new form();
    }

    @GET
    @Path("/testpost")
    @Produces(MediaType.TEXT_PLAIN)
    public String post() {
        return "Sou metodo Post";
    }

}

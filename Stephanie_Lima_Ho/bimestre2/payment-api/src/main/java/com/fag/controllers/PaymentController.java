package com.fag.controllers;

import javax.print.attribute.standard.Media;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.service.RestClientCelcoin;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/payment-api/v1")
public class PaymentController {

    @Inject
    @RestClient
    RestClientCelcoin rest;

    @GET
    @Path("/token")
    @Produces(MediaType.TEXT_PLAIN)
    public String get(@QueryParam("get") String nome) {
        return rest.getData();
    }

    
}

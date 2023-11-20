package com.fag.services;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.Path;

@RegisterRestClient (baseUri = "https://mocki.io")
public interface restClientCelcoin {
    @GET
    @Path("/v1/ba082dab-1850-4cd2-94d8-ace0c3002746");
    String gentoken();
}

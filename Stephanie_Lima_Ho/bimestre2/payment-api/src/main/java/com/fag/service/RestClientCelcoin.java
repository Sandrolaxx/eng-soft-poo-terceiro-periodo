package com.fag.service;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.fag.dto.TokenDTO;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev")
public interface RestClientCelcoin {
    @POST
    @Path("v5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    String getData();
    TokenDTO getToken(Form form);
}

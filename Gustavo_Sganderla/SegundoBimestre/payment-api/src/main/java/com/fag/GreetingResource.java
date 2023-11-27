package com.fag;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.dto.ConsultBankslip;
import com.fag.dto.TokenDTO;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;

@Path("/v1/payment")
public class GreetingResource {

    @Inject
    @RestClient
    RestClientCelcoin rest;

    @GET
    @Path("/token")
    @Produces(MediaType.APPLICATION_JSON)
    public TokenDTO getToken() {
        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        return rest.genToken(form);
    }

    @POST
    @Path("/consult")
    public String consult(ConsultBankslip payload) {
        TokenDTO token = getToken();

        return rest.consult("Bearer " + token.getAccesToken(), payload);
    }

    @POST
    @Path("/make")
    public String hanlePayment() {
        return "";
    }
}
//Entrarão na minha casa e destelharão meu telhado, tmj Sandrolax
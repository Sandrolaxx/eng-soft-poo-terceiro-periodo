package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Form;

@RegisterRestClient(baseUri = "https://sandbox.openfinance.celcoin.dev/")
public interface MyRemoteService {

    @POST
    @Path("/V5/token")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    //sandbox.openfinance.celcoin.dev/v5/token
    Token getToken(Form form);
}

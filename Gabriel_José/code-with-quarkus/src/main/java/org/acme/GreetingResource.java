package org.acme;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Form;

@Path("/api")
public class GreetingResource {

    @Inject
    @RestClient
    MyRemoteService restClient;

    @GET
    @Path("/token")
    @Produces(MediaType.APPLICATION_JSON)
    //localhost:8080/api/token
    public Token hello() {

        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");



            return restClient.getToken(form);
    }
}

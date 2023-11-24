package com.fag.controller;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.controller.services.MyRemoteService;
import com.fag.dto.ConsultaBoletoDTO;
import com.fag.dto.TokenDTO;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api")
public class GreetingResource {

    @Inject
    @RestClient
    MyRemoteService restClient;

    @GET
    @Path("/token")
    @Produces(MediaType.APPLICATION_JSON)
    public Response hello(){

        return Response.ok(getToken()).build();
    }

    public TokenDTO getToken(){
        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        TokenDTO token = restClient.getToken(form);

        return token;

    }

    @POST
    @Path("/consult")
    @Produces(MediaType.APPLICATION_JSON)
    public Response consult(ConsultaBoletoDTO dto){


        String response = restClient.consult("Bearer " + getToken().getAccessToken(), dto);//17:06

        return Response.ok(response).build();
        
    }

    @POST
    @Path("/payment")
    @Produces(MediaType.APPLICATION_JSON)
    public Response payment(ConsultaBoletoDTO dto){


        String response = restClient.payment("Bearer " + getToken().getAccessToken(), dto);//17:06

        return Response.ok(response).build();
        
    }


    

    
}

//http://localhost:8080/api/testeget
//http://localhost:8080/payment-api/v1/teste?name=gabriel
package com.fag.controllers;

import java.util.UUID;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.dto.ConsultResponseDTO;
import com.fag.dto.ConsultaBoletoDTO;

import com.fag.dto.PaymentResponseDTO;
import com.fag.dto.TokenDTO;
import com.fag.model.Payment;
import com.fag.model.Token;
import com.fag.services.RestClientCelcoin;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/v1")
public class PaymentController {

    @Inject
    @RestClient
    RestClientCelcoin rest;


    
    @GET
    @Path("/token")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response get(){

        TokenDTO dto = getToken();
        Token entity = new Token();

        entity.setToken(dto.getAcessToken());
        entity.persist();

       return Response.ok().build();
    }
    
    public TokenDTO getToken(){
        
        Form form = new Form();

        form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
        form.param("grant_type", "client_credentials");
        form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

        TokenDTO token =  rest.getToken(form);
       
        return token;
    }

    @POST
    @Path("/consult")
    @Produces(MediaType.APPLICATION_JSON)
    public Response consult(ConsultaBoletoDTO dto){
        
        ConsultResponseDTO response = rest.consult("Bearer " + getToken().getAcessToken(),dto);

        return Response.ok(response).build();

    }


    @POST
    @Path("/payment")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response payment(ConsultaBoletoDTO dto){
        
        PaymentResponseDTO response = rest.payment("Bearer " + getToken().getAcessToken(),dto);
        Payment entity = new Payment();

        entity.setId(UUID.randomUUID());
        entity.setAmmout(dto.getBill().getValue());
        entity.setDigitable(dto.getData().getDigitable());
        entity.setReceipt(response.getReceipt().getReceiptfomatted());

        entity.persist();

        return Response.ok(response).build();

    }
}

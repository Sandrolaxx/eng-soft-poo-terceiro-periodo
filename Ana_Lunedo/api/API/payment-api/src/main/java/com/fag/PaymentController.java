package com.fag;

import java.util.UUID;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import com.fag.Dto.ConsultResponseDTO;
import com.fag.Dto.ConsultarBoletoDTO;
import com.fag.Dto.PaymentResponseDTO;
import com.fag.Dto.TokenDTO;
import com.fag.Model.Payment;
import com.fag.Model.Token;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Form;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/v1/payment")
public class PaymentController {

    @Inject
    @RestClient
    RestClientCelcoin rest;

    public TokenDTO getToken(){
    Form form = new Form();

    form.param("client_id", "41b44ab9a56440.teste.celcoinapi.v5");
    form.param("grant_type", "client_credentials");
    form.param("client_secret", "e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3");

    TokenDTO token = rest.getToken(form);

    return token;
    }


    @GET
    @Path("/token")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response hello(){
        TokenDTO Dto = getToken();
        Token entity =  new Token();

        entity.setToken(Dto.getAccessToken());
        entity.persist();

        return Response.ok().build();
    }

    @POST
    @Path("/consult")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response consult(ConsultarBoletoDTO Dto){
        
    ConsultResponseDTO response = rest.consult("bearer " + getToken().getAccessToken(), Dto);
    return Response.ok(response).build();  
    }

    @POST
    @Path("/payment")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response payment(ConsultarBoletoDTO Dto){
    PaymentResponseDTO response = rest.payment("bearer " + getToken().getAccessToken(), Dto);
    Payment entity = new Payment();

    entity.setId(UUID.randomUUID());
    entity.setAmount(Dto.getBill().getValue());
    entity.setDigitable(Dto.getData().getDigitable());
    entity.setReceipt(response.getReceipt().getReceiptformatted());

    entity.persist();

    return Response.ok().entity(response).build();  
    }

   
}  
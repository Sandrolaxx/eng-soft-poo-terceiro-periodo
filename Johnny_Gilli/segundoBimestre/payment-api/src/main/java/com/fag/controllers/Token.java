package com.fag.controllers;

import jakarta.json.bind.annotation.JsonbProperty;
//Fiz assistindo a aula mas uso o TOkenDTO;
public class Token {
    
    @JsonbProperty("access_token")
    private String accessToken;

    public String getAccessToken(){
        return accessToken;
    }

    public void setAccessToken(String accessToken){
        this.accessToken=accessToken;
    }
}

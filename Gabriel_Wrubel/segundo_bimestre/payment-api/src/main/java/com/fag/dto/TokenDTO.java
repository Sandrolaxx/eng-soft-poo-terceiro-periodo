package com.fag.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class TokenDTO {
    
    @JsonbProperty("access_token")
    private String acessToken;

    public String getAcessToken() {
        return acessToken;
    }

    public void setAcessToken(String acessToken) {
        this.acessToken = acessToken;
    }

    
}

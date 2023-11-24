package com.fag.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class TokenDTO {

    @JsonbProperty("access_token")
    private String accesToken;

    @JsonbProperty("expires_in")
    private String expiresIn;

    @JsonbProperty("token_type")
    private String tokenType;

    public String getAccesToken() {
        return accesToken;
    }

    public void setAccesToken(String accesToken) {
        this.accesToken = accesToken;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

}

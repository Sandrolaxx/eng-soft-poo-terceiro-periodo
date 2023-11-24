package com.fag.dto;

import jakarta.json.bind.annotation.JsonbProperty;

public class TokenDTO {
    
@JsonbProperty("access_token")
private String accessToken;

@JsonbProperty("expires_in")
private String expiresIn;

@JsonbProperty("token_type")
private String tokenType;

public String getAccessToken() {
    return accessToken;
}

public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
}



}

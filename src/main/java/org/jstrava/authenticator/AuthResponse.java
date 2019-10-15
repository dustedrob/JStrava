package org.jstrava.authenticator;


import org.jstrava.entities.Athlete;

public class AuthResponse {
    String access_token;
    String refresh_token;
    Long expires_at;
    Athlete athlete;

    public String getAccess_token() { return access_token; }
    public void setAccess_token(String token) { this.access_token = token; }

    public String getRefresh_token() { return refresh_token; }
    public void setRefresh_token(String token) { this.refresh_token = token; }

    public Long getExpires_at() { return expires_at; }
    public void setExpires_at(Long exp) { this.expires_at = exp; }

    public Athlete getAthlete() { return athlete; }
    public void setAthlete() { this.athlete = athlete; }
}
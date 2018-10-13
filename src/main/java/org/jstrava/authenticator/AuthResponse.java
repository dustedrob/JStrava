package org.jstrava.authenticator;


import org.jstrava.entities.Athlete;

public class AuthResponse {
    String access_token;
    Athlete athlete;

    public String getAccess_token() { return access_token; }
    public void setAccess_token(String token) { this.access_token = token; }

    public Athlete getAthlete() { return athlete; }
    public void setAthlete() { this.athlete = athlete; }
}
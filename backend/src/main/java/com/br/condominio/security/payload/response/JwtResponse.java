package com.br.condominio.security.payload.response;

import lombok.Getter;

import java.util.List;

import com.br.condominio.security.services.UserDetailsImpl;

@Getter
public class JwtResponse {

    private final String token;

    private final String type = "Bearer";

    private final Long id;

    private final String username;

    private final String email;

    private final List<String> roles;

    public JwtResponse(String accessToken, UserDetailsImpl user, List<String> roles) {
        this.token = accessToken;
        this.id = user.getId();
        this.username = user.getUsername();
        this.email = user.getUsername();
        this.roles = roles;
    }
}

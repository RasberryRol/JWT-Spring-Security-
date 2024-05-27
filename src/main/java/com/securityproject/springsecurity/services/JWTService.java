package com.securityproject.springsecurity.services;

import org.springframework.security.core.userdetails.UserDetails;

public interface JWTService {

    String extractUserName(String token);
    String generatedToken(UserDetails userDetails);
    boolean isTokenValid(String token, UserDetails userDetails);
}

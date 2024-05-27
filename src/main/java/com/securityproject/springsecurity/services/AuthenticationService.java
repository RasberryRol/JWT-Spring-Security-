package com.securityproject.springsecurity.services;

import com.securityproject.springsecurity.dto.SignUpRequest;
import com.securityproject.springsecurity.entities.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
}

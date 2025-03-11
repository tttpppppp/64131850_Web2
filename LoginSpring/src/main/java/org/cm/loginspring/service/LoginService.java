package org.cm.loginspring.service;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginService {
    public boolean login(String email, String password) {
        return email.equals("admin@gmail.com") && password.equals("admin");
    }
}

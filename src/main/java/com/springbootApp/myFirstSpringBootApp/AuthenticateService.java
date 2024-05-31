package com.springbootApp.myFirstSpringBootApp;

import org.springframework.stereotype.Service;

@Service
public class AuthenticateService {
    public boolean authenticate(String username , String password)
    {
        Boolean isValiduser=username.equalsIgnoreCase("name");
        Boolean isValidpassword=password.equalsIgnoreCase("password");
        return isValiduser && isValidpassword;
    }
}

package com.springbootApp.myFirstSpringBootApp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import java.util.function.Function;

@Configuration
public class SpringSecurityConfiguration {
@Bean
//    InMemoryUserDetailsManager;
//    InMemoryUserDetailsManager(UserDetails... users)
    public InMemoryUserDetailsManager createUserDetailsManager()
        {

            UserDetails userDetails1 = CreateNewUser("Umer", "dummy");
            UserDetails userDetails2 = CreateNewUser("Rabia", "dummy");
            return new InMemoryUserDetailsManager(userDetails1,userDetails2);
        }

    private UserDetails CreateNewUser(String UserName, String password) {
        Function<String,String> passwordEncoder=input->passwordEncoder().encode(input);
        UserDetails userDetails =User
               .builder()
               .passwordEncoder(passwordEncoder)
                .username(UserName)
                .password(password)
                .roles("USER","ADMIN")
                .build();
        return userDetails;
    }

    @Bean
    public PasswordEncoder passwordEncoder()
        {
         return new BCryptPasswordEncoder();
        }

}

package com.example.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.dto.SignupRequest;

@RestController
public class AuthController {
    @PostMapping("/signup")
    String signUp(@RequestBody SignupRequest sd){
        System.out.println("\n\t signup DATA : "+sd.toString());
        return "signup sucess -> : { \n\t name :"+sd.getName()+"\n\t email : "+sd.getEmail()+"\n}";

    }

    
}

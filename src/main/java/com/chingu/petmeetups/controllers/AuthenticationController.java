package com.chingu.petmeetups.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthenticationController {
    @GetMapping("/login")
    @ResponseBody
    public String ShowLoginForm(){
        return "this will be log in page";
    }
}



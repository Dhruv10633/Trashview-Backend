package com.trashview.backend.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller responsible for sending response when we enter URL
@RestController
public class WelcomeController {

    @Value("${app.welcome.message}")
    private String welcomeMessage;

    @GetMapping
    public String getWelcomeMessage() {
        return welcomeMessage;
    }
}

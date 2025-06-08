package com.exploretech.explorers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class FirstController {

    @GetMapping("/first")
    public String sendSuccessMessage(){
        return "you are receiving message from first method of controller..";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}

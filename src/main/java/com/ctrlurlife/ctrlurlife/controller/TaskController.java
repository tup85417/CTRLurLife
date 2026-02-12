package com.ctrlurlife.ctrlurlife.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/")
    public String home() {
        return "CTRLurLife application is running!";
    }
}

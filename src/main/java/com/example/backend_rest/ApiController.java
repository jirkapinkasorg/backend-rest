package com.example.backend_rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/call")
    public String call() {
        return "api call from backend rest";
    }

}

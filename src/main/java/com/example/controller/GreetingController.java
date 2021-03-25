package com.example.controller;

import com.example.dto.GreetingResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GreetingController {

    @GetMapping(value = "/greeting")
    public GreetingResponse getGreeting(@RequestParam String name){
        return GreetingResponse.builder().greeting("welcome "+name).build();
    }
}

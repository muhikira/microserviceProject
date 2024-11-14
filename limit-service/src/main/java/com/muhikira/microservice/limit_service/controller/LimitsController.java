package com.muhikira.microservice.limit_service.controller;

import com.muhikira.microservice.limit_service.Configuration;
import com.muhikira.microservice.limit_service.Limits;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimts( ) {
        return new Limits (configuration.getMinimum(),
                configuration.getMaximum());

    }
}

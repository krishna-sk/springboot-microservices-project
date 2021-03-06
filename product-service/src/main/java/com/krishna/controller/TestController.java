package com.krishna.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RefreshScope
public class TestController {

    @Value("${test.name}")
    private String name;

    @Value("${my.app}")
    private String commonProperty;

    @GetMapping("/name")
    public String name() {
        return name;
    }

    @GetMapping("/commonProperty")
    public String commonProperty() {
        return commonProperty;
    }
}
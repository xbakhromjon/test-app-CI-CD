package com.example.testapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public String getSay() {
        return "Hi";
    }
}

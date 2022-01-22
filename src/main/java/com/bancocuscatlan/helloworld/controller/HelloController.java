package com.bancocuscatlan.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {


    @GetMapping("hola")
    public String hola() {
        return "Hola Mundo";
    }
}

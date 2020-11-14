package com.fmi.cloud.lucian.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContainerMicroService {

    @GetMapping("/")
    public static String helloWorldContainer() {
        return "Hello! We're demonstrating how cool a container is!";
    }

}

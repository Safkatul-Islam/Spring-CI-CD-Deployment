package org.deployment.springbootclouddeployment.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello CI/CD and Cloud Deployment";
    }

    @GetMapping("/new")
    public String newMethod() {
        return "This is a new method";
    }

    @GetMapping("/cloud")
    public String fromCloud() {
        return "Hello from AWS EC2";
    }
}

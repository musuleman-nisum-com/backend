package com.devops.backend.controller;

import com.devops.backend.model.HelloWorld;
import com.devops.backend.service.HelloWorldService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("helloworld")
public class HelloWorldController {

    HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @PostMapping("/{name}")
    HelloWorld save(@PathVariable String name) {
        return helloWorldService.save(name);
    }

    @GetMapping
    List<HelloWorld> getAll() {
        return helloWorldService.getAll();
    }
}

package com.devops.backend.service;

import com.devops.backend.model.HelloWorld;
import com.devops.backend.repositery.HelloWorldRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    HelloWorldRepository helloWorldRepository;

    public HelloWorldService(HelloWorldRepository helloWorldRepository) {
        this.helloWorldRepository = helloWorldRepository;
    }

    public HelloWorld save(String name) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setName(name);

        return helloWorldRepository.save(helloWorld);
    }

    public List<HelloWorld> getAll() {
        return helloWorldRepository.findAll();
    }
}

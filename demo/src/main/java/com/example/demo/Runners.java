package com.example.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class Runners implements ApplicationRunner {
    @Override
    @PreDestroy
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("***************Loading logic from dB to catch Memory ");
    }
}

package com.example.demo;

import org.springframework.boot.CommandLineRunner;

import javax.annotation.PostConstruct;

public class CatchManager implements CommandLineRunner {
    @Override
    @PostConstruct
    public void run(String... args) throws Exception {
        System.out.println("*********************Loading static data from Db to Catch memory ");
    }
}

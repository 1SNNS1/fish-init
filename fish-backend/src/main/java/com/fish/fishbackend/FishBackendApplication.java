package com.fish.fishbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fish")
public class FishBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FishBackendApplication.class, args);
    }

}

package com.fish.fishfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.fish")
public class FishFrontendApplication {

    public static void main(String[] args) {
        SpringApplication.run(FishFrontendApplication.class, args);
    }

}

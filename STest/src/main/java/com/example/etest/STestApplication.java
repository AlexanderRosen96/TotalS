package com.example.etest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class STestApplication {

    public static void main(String[] args) {
        SpringApplication.run(STestApplication.class, args);
    }

}

package com.example.etest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ETestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ETestApplication.class, args);
    }

}

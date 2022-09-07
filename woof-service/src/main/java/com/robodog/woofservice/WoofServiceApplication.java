package com.robodog.woofservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WoofServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WoofServiceApplication.class, args);
    }

}
package com.robodog.RoboDog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RoboDogApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoboDogApplication.class, args);
	}

}

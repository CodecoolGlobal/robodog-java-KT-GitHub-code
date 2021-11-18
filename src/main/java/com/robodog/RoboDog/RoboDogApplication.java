package com.robodog.RoboDog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoboDogApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/robodog");
		SpringApplication.run(RoboDogApplication.class, args);
	}

}

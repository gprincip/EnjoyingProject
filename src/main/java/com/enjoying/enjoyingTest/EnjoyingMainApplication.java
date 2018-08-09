package com.enjoying.enjoyingTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.enjoying.controller")
public class EnjoyingMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnjoyingMainApplication.class, args);
	}
}

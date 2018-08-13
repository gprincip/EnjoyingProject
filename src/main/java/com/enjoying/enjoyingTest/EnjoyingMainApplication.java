package com.enjoying.enjoyingTest;

import org.hibernate.Hibernate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.enjoying")
@EnableJpaRepositories("com.enjoying.jpa")
@EntityScan("com.enjoying.model")
public class EnjoyingMainApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnjoyingMainApplication.class, args);
	}
}

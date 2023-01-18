package com.innoventes.test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.innoventes.test.app.Repository")
public class InnotentesSpringbootTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(InnotentesSpringbootTestApplication.class, args);
	}

}

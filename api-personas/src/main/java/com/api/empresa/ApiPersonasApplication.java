package com.api.empresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.api.empresa.Entity")
public class ApiPersonasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPersonasApplication.class, args);
	}

}

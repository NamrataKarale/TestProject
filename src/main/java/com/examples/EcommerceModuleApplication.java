package com.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:config.xml")
public class EcommerceModuleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceModuleApplication.class, args);
	}

}

package com.bugunneyesem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
public class BugunNeYesemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugunNeYesemApplication.class, args);
	}

}

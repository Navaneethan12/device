package com.app.locationNavigation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LocationNavigationApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationNavigationApplication.class, args);
		System.out.println("Application Running Successfully");
	}

}

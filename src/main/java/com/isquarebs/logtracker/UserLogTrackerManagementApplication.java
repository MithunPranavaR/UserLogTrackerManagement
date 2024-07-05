package com.isquarebs.logtracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.isquarebs.logtracker.*")
@ComponentScan(basePackages = {"com.isquarebs"})
public class UserLogTrackerManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserLogTrackerManagementApplication.class, args);
	}

}

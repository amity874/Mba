package com.Amit.MovieBookingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

/**
 * Main class of the springBoot
 */
@SpringBootApplication
public class MovieBookingAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(MovieBookingAppApplication.class, args);
		System.out.println("hello");
	}
}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Hotel;

@SpringBootApplication
public class HotelInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelInfoServiceApplication.class, args);
	}
	
	@Bean
	public Hotel Sagar() {
		
		return new Hotel(121, "Krishna Sagar", "Bangalore");
	}
	
	@Bean
	public Hotel Gongura() {
		
		return new Hotel(122, "Gongura Restaurant", "Madanapalle");
	}
	
	@Bean
	public Hotel Swaad() {
		
		return new Hotel(123, "Swaad Restaurant", "Rayachoti");
	}

}

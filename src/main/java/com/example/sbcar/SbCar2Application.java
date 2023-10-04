package com.example.sbcar;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.sbcar.model.Car;
import com.example.sbcar.model.Owner;
import com.example.sbcar.repository.CarRepository;
import com.example.sbcar.repository.OwnerRepository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class SbCar2Application implements CommandLineRunner {

	@Autowired
	private CarRepository repository;

	@Autowired
	OwnerRepository oRepository;

	public static void main(String[] args) {

		SpringApplication.run(SbCar2Application.class, args);
	}

	@Configuration
	public class CorsConfig implements WebMvcConfigurer {
		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/api/**")
					.allowedOrigins("http://localhost:3000")
					.allowedMethods("GET", "POST", "PUT", "DELETE").allowedHeaders("*");
		}
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 = new Owner("Papa Faly", "Diagne");
		Owner owner2 = new Owner("Khady", "Diagne");
		oRepository.saveAll(Arrays.asList(owner1, owner2));

		Car car1 = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000, owner1);
		Car car2 = new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000, owner1);
		Car car3 = new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000, owner2);
		repository.saveAll(Arrays.asList(car1, car2, car3));
	}

}

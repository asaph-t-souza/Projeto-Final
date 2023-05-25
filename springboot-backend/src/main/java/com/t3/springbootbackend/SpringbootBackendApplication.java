package com.t3.springbootbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.t3.springbootbackend.entity.User;
import com.t3.springbootbackend.repository.LocationRepository;
import com.t3.springbootbackend.repository.ReviewRepository;
import com.t3.springbootbackend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepository, LocationRepository locationRepository, ReviewRepository reviewRepository){
		return args -> {
			System.out.println("INICIO");

			User user = new User();

			System.out.println("FIM");
		};
	}


}

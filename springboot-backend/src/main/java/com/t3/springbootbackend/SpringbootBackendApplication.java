package com.t3.springbootbackend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.t3.springbootbackend.entity.Location;
import com.t3.springbootbackend.entity.Review;
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


			
			User user = new User(
				"user1", 
				"senha1", 
				"ROLE_USER", 
				"user@email.com", 
				"user", 
				"name"
			);
			user = userRepository.save(user);



			Location location = new Location(
				"location1", 
				"12345123", 
				"Brasil", 
				"Minas Gerais", 
				"Araguari", 
				"Bairro", 
				"Rua", 
				"Predio", 
				85, 
				"Restaurante", 
				0, 
				"Restaurante Mexicano"
			);
			location = locationRepository.save(location);



			Review review = new Review();
			review.setComment("MUITO BOM, ADOREI");
			review.setReviewScore(0);
			review.setUser(userRepository.findById(user.getId()).get());
			review.setLocation(locationRepository.findById(location.getId()).get());
			review = reviewRepository.save(review);



			System.out.println("Review");
			System.out.println(reviewRepository.findById(review.getId()).get().toString());



			System.out.println("FIM");
		};
	}


}

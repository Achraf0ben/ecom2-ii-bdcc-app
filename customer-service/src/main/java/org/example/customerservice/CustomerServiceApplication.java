package org.example.customerservice;

import org.example.customerservice.entities.Customer;
import org.example.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.save(Customer.builder()
					.name("Med")
					.email("med@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("Imane")
					.email("Imane@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("Khalid")
					.email("Achraf@gmail.com")
					.build());

			customerRepository.findAll().forEach(c -> {
				System.out.println("------------------");
				System.out.println(c.getId());
				System.out.println(c.getEmail());
				System.out.println(c.getName());
				System.out.println("------------------");
			});
		};
	}
}

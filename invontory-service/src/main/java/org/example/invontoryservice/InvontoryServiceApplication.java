package org.example.invontoryservice;

import org.example.invontoryservice.entities.Products;
import org.example.invontoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InvontoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvontoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
      return args -> {
        productRepository.save(Products .builder()
                        .id(UUID.randomUUID().toString())
                        .name("Computer")
                        .price(5666)
                        .quantity(41)
                .build());

          productRepository.save(Products.builder()
                  .id(UUID.randomUUID().toString())
                  .name("Printer")
                  .price(8596)
                  .quantity(11)
                  .build());

          productRepository.save(Products.builder()
                  .id(UUID.randomUUID().toString())
                  .name("Smartphone")
                  .price(6332)
                  .quantity(222)
                  .build());

          //Si je veux afficher les info

          productRepository.findAll().forEach(p ->{
              System.out.println(p.toString());
          });

      };
    }

}



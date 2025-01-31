package org.example.customerservice.repository;

import org.example.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
//spring data rest demande a spring de demarrer automatiquement un webservice restfull qui permet d'acceder a toutes les methode de cette interface
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

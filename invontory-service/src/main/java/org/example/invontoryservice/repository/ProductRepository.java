package org.example.invontoryservice.repository;

import org.example.invontoryservice.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Products, String> {
}

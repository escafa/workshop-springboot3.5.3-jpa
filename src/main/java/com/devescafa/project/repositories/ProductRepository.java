package com.devescafa.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devescafa.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

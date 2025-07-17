package com.devescafa.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devescafa.project.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

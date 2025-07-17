package com.devescafa.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devescafa.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

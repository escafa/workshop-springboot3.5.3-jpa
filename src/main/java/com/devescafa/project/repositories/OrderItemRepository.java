package com.devescafa.project.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.devescafa.project.entities.OrderItem;
import com.devescafa.project.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	


}

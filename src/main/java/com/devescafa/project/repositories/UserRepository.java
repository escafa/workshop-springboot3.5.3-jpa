package com.devescafa.project.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.devescafa.project.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	


}

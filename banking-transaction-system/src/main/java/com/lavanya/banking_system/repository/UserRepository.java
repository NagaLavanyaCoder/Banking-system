package com.lavanya.banking_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lavanya.banking_system.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}

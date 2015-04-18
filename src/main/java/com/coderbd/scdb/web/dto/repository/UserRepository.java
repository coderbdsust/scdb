package com.coderbd.scdb.web.dto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderbd.scdb.web.dto.User;

public interface UserRepository extends JpaRepository<User, String>{
	
	public User findByEmail(String email);
	public User findByUserId(int userId);
	public List<User> findAll();
	
}

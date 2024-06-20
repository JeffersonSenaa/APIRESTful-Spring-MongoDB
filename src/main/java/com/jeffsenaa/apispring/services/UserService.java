package com.jeffsenaa.apispring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeffsenaa.apispring.domain.User;
import com.jeffsenaa.apispring.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return findAll();
	}
}

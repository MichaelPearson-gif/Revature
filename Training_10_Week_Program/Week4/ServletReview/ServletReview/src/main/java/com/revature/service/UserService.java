package com.revature.service;

import java.util.List;

import com.revature.model.User;
import com.revature.repository.UserRepository;
import com.revature.repository.UserRepositoryImpl;

public class UserService {

	private UserRepository cardRepository;
	
	public UserService() {
		this.cardRepository = new UserRepositoryImpl();
	}
	
	public List<User> findAll(){
		return this.cardRepository.findAll();
	}
	
	public boolean isValidUser(String username, String password) {
		List<User> users = this.findAll();
		
		for(User u : users) {
			if(u.getName().equals(username) && u.getPassword().equals(password)) {
				return true;
			}
		}
		
		return false;
	}
}

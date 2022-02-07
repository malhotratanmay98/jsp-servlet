package com.model.service;

import java.util.Optional;

import com.model.persistance.user.User;

public interface UserService {
	public void addUser(User user);
	public Optional<User> getUser(String username, String password);	
}

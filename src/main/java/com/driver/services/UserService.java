package com.driver.services;


import com.driver.repository.User;

public interface UserService {

	void deleteUser(Integer userId);
	User updatePassword(Integer userId, String password);
	void register(String name, String phoneNumber, String password);
}

package com.sprintrest.restinitilizer.services;

import com.sprintrest.restinitilizer.entity.User;

import java.util.List;

public interface UserServices {
	List<User> getAllUsers();
	User getSingleUser(int id);

	void addNewUser(User user);
}

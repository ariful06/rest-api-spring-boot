package com.sprintrest.restinitilizer.services;

import com.sprintrest.restinitilizer.entity.User;

import java.util.List;

public interface UserServices {
	List<User> login(String userName , String password);
	User getSingleUser(int id);

	void addNewUser(User user);
}

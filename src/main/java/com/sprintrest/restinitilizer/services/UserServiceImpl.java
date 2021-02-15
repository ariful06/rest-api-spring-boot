package com.sprintrest.restinitilizer.services;

import org.springframework.stereotype.Service;

import com.sprintrest.restinitilizer.entity.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class UserServiceImpl implements UserServices  {

	List<User> user = new ArrayList<>(Arrays.asList(
			new User(1,"Ariful Haque","******",true),
			new User(2,"Mahbubul Haque","******",true),
			new User(3,"Fazlul Haque","******",true),
			new User(4,"Fatema Begum","******",true),
			new User(5,"Mila Haque","******",true))
	);

	
	@Override
	public List<User> getAllUsers() {
		return  user;
	}

	@Override
	public User getSingleUser(int id) {
		return  user.stream().filter(u -> u.getUserId() == id).findFirst().get();
	}

	@Override
	public void addNewUser(User user) {
		this.user.add(user);
		System.out.println("Okay");
	}

}

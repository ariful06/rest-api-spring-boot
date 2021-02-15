package com.sprintrest.restinitilizer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sprintrest.restinitilizer.entity.User;
import com.sprintrest.restinitilizer.services.UserServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MyController {

	@Autowired
	private UserServices userService;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable int id){
		return userService.getSingleUser(id);
	}

	@RequestMapping(method = RequestMethod.POST,value = "/user")
	public void addNewUser(@RequestBody User user){
		userService.addNewUser(user);
	}
}

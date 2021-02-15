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
	
	@GetMapping("/hello")
	public List<User> firstApi() {
		return userService.login("Arifuk","alsdf");
	}
	
	@PostMapping("/login")
	public User login() {
	User user = new User();
		this.userService.login("Ariful Haque", "anna");
		return user;
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

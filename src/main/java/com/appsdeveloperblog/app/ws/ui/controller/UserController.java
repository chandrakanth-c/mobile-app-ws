package com.appsdeveloperblog.app.ws.ui.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;

@RestController
@RequestMapping("/users")
public class UserController {	
	
	@GetMapping
	public String getUser(@RequestParam(value="page",defaultValue = "1") int page,@RequestParam(value="limit",defaultValue="50") int limit) {
		return "get user was called with page = "+page+" and limit "+limit;
	}
	
	@GetMapping(path = "/{userId}")
	public UserRest getUser(@PathVariable String userId) {
		UserRest user=new UserRest();
		user.setFirstName("chandrakanth");
		user.setLastName("chittappa");
		user.setEmail("c.c@gmail.com");
		user.setUserid("1");
		return user;
	}
	
	@PostMapping
	public String createUser() {
		return "create user was called";
	}
	
	@PutMapping
	public String updateUser() {
		return "update user was called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user was called";
	}
}

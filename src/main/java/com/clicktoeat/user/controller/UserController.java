package com.clicktoeat.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clicktoeat.user.dto.UserRegisterDTO;
import com.clicktoeat.user.model.NewUser;
import com.clicktoeat.user.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	IUserService userService;

	@PostMapping
	public String registerUser(@RequestBody UserRegisterDTO user) {
           return userService.registerUser(user);
	}
}

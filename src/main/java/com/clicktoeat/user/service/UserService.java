package com.clicktoeat.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clicktoeat.user.dto.UserRegisterDTO;
import com.clicktoeat.user.model.NewUser;
import com.clicktoeat.user.repository.UserRepository;

@Service
public class UserService implements IUserService{
	@Autowired
	UserRepository userRepo;

	@Override
	public String registerUser(UserRegisterDTO userDto) {
		NewUser user = new NewUser();
		user.setAddress(userDto.getAddress());
		user.setEmailId(userDto.getEmailId());
		user.setPassword(userDto.getPassword());
		user.setPhoneNum(userDto.getPhoneNum());
		user.setUserName(userDto.getUserName());
		userRepo.save(user);
		return "user registered successfully";
	}
	


}

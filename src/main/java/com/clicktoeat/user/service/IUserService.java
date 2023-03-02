package com.clicktoeat.user.service;

import com.clicktoeat.user.dto.UserRegisterDTO;
import com.clicktoeat.user.model.NewUser;

public interface IUserService {
	
	String registerUser(UserRegisterDTO user);

}

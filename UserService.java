package com.spring.makerSharksIncService;
import com.spring.makerSharksIncUserEntity.*;
//This is the Service Interface for registration and fetching of user's details
public interface UserService {
	void register(User user);
	User find(String username);
}

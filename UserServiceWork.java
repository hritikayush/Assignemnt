package com.spring.makerSharksIncService;
import com.spring.makerSharksIncUserEntity.*;
import com.spring.makerSharksIncService.*;
import com.spring.makerSharksIncRepo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//This is the implementable service(interface) Class where we are autowiring our UserRepo class to save our register a user and 
//fetching his/her details using find()
@Service
public class UserServiceWork {
	@Autowired
	private UserRepo userRepo;
	
	public void register(User user) {
		userRepo.saveUser(user);
	}
	
	public User finUser(String username) {
		return userRepo.find(username);
	}
}

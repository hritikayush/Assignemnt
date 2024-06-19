package com.spring.makerSharksIncRepo;
import com.spring.makerSharksIncUserEntity.*;
import org.springframework.stereotype.Repository;
import java.util.*;
//This is the User repository class where we are saving a registered user into our HashMap Data Structure and also finding a 
//particular registered user using the find() function
@Repository
public class UserRepo {
	private final Map<String,User> map=new HashMap<>();
	
	public void saveUser(User user) {
		map.put(user.getUsername(), user);
	}
	
	public User find(String username) {
		return map.get(username);
	}
}

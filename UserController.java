package com.spring.makerSharksIncController;
import com.spring.makerSharksIncRepo.*;
import com.spring.makerSharksIncService.*;
import com.spring.makerSharksIncUserEntity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
//This is the primary Controller Class
@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	// This is the Post method which is registering a user 
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody User user){
		try {
            userService.register(user);
            return ResponseEntity.ok("User registered successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("User registration failed: " + e.getMessage());
        }
	}
	//This is the GET method which is fetching a particular registered user info
	@GetMapping("/fetch")
    public ResponseEntity<?> find(@RequestParam String username) {
        User user = userService.find(username);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(404).body("User not found.");
        }
    }
}

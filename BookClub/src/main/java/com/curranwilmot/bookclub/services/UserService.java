package com.curranwilmot.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.curranwilmot.bookclub.models.LoginUser;
import com.curranwilmot.bookclub.models.User;
import com.curranwilmot.bookclub.repositories.UserRepository;
    

    
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    // TO-DO: Write register and login methods!
    public User register(User newUser, BindingResult result) {
        // TO-DO: Additional validations!
    	// TO-DO - Reject values or register if no errors:
        Optional<User> optionalUser = userRepository.findByEmail(newUser.getEmail());
    	if(optionalUser.isPresent()) {
    		result.rejectValue("email", "Exists", "This Email is already being used!");
    		return null;
    	}
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    		result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
    		return null;
    	}
    	if(result.hasErrors()) {
    		return null;
    	}
    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashed);
    	return userRepository.save(newUser);
    	
        // Reject if email is taken (present in database)
        // Reject if password doesn't match confirmation
        
        // Return null if result has errors
    
        // Hash and set password, save user to database
    }
    public User login(LoginUser newLogin, BindingResult result) {
        // TO-DO: Additional validations!
    	// TO-DO - Reject values:
    	Optional<User> optionalUser = userRepository.findByEmail(newLogin.getEmail());
    	if(!optionalUser.isPresent()) {
    		result.rejectValue("email", "Does not exist", "This email does not exist");
    		return null;
    	}
    	User user = optionalUser.get();
    	if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
    	    result.rejectValue("password", "Matches", "Invalid Password!");
    	    return null;
    	}
    	if(result.hasErrors()) {
    		return null;
    	}
    	
    	return user;

    	// Find user in the DB by email
        // Reject if NOT present
        
        // Reject if BCrypt password match fails
    
        // Return null if result has errors
        // Otherwise, return the user object
        
    }
    public User findUser(Long id) {
	    Optional<User> optionalUser = userRepository.findById(id);
	    if(optionalUser.isPresent()) {
	        return optionalUser.get();
	    } else {
	        return null;
	    }
	}
}

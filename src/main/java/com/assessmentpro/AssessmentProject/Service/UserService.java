package com.assessmentpro.AssessmentProject.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assessmentpro.AssessmentProject.Model.Users;
import com.assessmentpro.AssessmentProject.Repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;
@Service
public class UserService {
	 private final UserRepository userRepository;

	    public UserService(UserRepository userRepository) {
	        this.userRepository = userRepository;
	    }

	    public Users createUser(Users user) {
	        // Perform any necessary validation or business logic
	        // Save the user entity in the database
	        return userRepository.save(user);
	    }

	    public Users getUserById(Long id) {
	        return userRepository.findById(id)
	                .orElseThrow(() -> new EntityNotFoundException("User not found"));
	    }


	    public Users updateUser(Long id, Users updatedUser) {
	        Users user = getUserById(id);
	        // Perform any necessary validation or business logic
	        // Update the user entity with the new values
	        user.setUsername(updatedUser.getUsername());
	        user.setPassword(updatedUser.getPassword());
	        user.setEmail(updatedUser.getEmail());
	        user.setAdmin(updatedUser.isAdmin());
	        return userRepository.save(user);
	    }

	    public void deleteUser(Long id) {
	        Users user = getUserById(id);
	        // Perform any necessary validation or business logic
	        userRepository.delete(user);
	    }

	    public List<Users> getAllUsers() {
	        return userRepository.findAll();
	    }
}

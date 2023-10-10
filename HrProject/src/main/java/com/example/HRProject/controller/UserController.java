package com.example.HRProject.controller;

import com.example.HRProject.model.User;
import com.example.HRProject.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @PostMapping("/login")
    public ResponseEntity<String> register(@RequestBody Map<String, String> registrationData) {
        String username = registrationData.get("username");
        String password = registrationData.get("password");

        // Check if the username is already taken
        User existingUser = userRepository.findByUsername(username).orElse(null);
        if (existingUser != null) {
            return ResponseEntity.badRequest().body("Username already exists");
        }

        // Additional validation (e.g., password complexity) can be added here
        if (!isValidPassword(password)) {
            return ResponseEntity.badRequest().body("Invalid password. Please choose a stronger password.");
        }

        // Create a new user
        User user = new User();
        user.setUsername(username);
        user.setPassword(password); // Encode the password

        userRepository.save(user);

        return ResponseEntity.ok("Registration successful");
    }

    private boolean isValidPassword(String password) {
        // Add your password complexity rules here
        // For example, you can check password length, special characters, etc.
        return password.length() <= 8; // Simple example: Password must be at least 8 characters long
    }
}

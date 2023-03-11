package com.example.Marketplace.services;

import com.example.Marketplace.entities.User;
import com.example.Marketplace.enums.Role;
import com.example.Marketplace.repositories.InterestRepository;
import com.example.Marketplace.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class UserService {

    @Autowired
    InterestRepository interestRepository;

    @Autowired
    UserRepository userRepository;

    public User createUser(Role role, String firstName, String lastName, String email) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        userRepository.save(user);
        return user;
    }
}

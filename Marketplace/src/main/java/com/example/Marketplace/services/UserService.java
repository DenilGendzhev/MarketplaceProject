package com.example.Marketplace.services;

import com.example.Marketplace.repositories.InterestRepository;
import com.example.Marketplace.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class UserService {

    @Autowired
    InterestRepository interestRepository;

    @Autowired
    UserRepository userRepository;
}

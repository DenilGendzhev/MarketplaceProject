package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Interest;
import com.example.Marketplace.entities.User;
import com.example.Marketplace.repositories.InterestRepository;
import com.example.Marketplace.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    InterestRepository interestRepository;

    @GetMapping("create-user")
    private String createUser(Model model) {
        User user = new User();
        model.addAttribute("student", user);
        Iterable<User> users = userRepository.findAll();
        //Interest interest= new Interest();
        //model.addAttribute("interests", interest); still problems here//
        //Iterable<Interest> interests = interestRepository.findAll();
        return "sign-in-user";
    }
    @PostMapping("create-user")
    private String saveUser(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "sign-in-student";
        }
        userRepository.save(user);
        //return "redirect:/student-events";
        return "redirect:/all-users";

    }
}

package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Admin;
import com.example.Marketplace.entities.Interest;
import com.example.Marketplace.entities.User;
import com.example.Marketplace.repositories.InterestRepository;
import com.example.Marketplace.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    InterestRepository interestRepository;

    @GetMapping("/sign-in")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "sign-in-user";
    }

    @PostMapping("/sign-in")
    public String processRegistrationForm(@ModelAttribute("user") User user) {
        userRepository.save(user);
        return "";
    }

    @GetMapping("/see-ads")
    public String showAdsToUser(Model model) {
        model.addAttribute("user", new User());
        return "ads-results"; //tuka ne e mnogo vqrno, dali trqbva nov html za vsichki obqvi
    }

}

package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Ad;
import com.example.Marketplace.entities.Interest;
import com.example.Marketplace.entities.User;
import com.example.Marketplace.repositories.InterestRepository;
import com.example.Marketplace.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    @GetMapping("/profile")
    public String showUserProfile(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "user-profile";
    }

    @GetMapping("/edit-profile")
    public String showEditProfileForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "edit-user-profile";
    }


}

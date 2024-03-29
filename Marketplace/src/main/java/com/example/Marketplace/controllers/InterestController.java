package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Interest;
import com.example.Marketplace.repositories.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/interests")
public class InterestController {
    @Autowired InterestRepository interestRepository;

    @GetMapping("/add")
       public String addInterest(Model model) {
        model.addAttribute("interest", new Interest());
        return "user-interests";
    }
    @PostMapping("/add")
        public String createInterest(@ModelAttribute ("interest") Interest interest, Model model){
        interestRepository.save(interest);
        model.addAttribute("interests", interestRepository.findAll());
        return "user-interest-result";
    }
}

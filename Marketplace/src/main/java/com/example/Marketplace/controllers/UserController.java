package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Interest;
import com.example.Marketplace.entities.User;
import com.example.Marketplace.repositories.InterestRepository;
import com.example.Marketplace.repositories.UserRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


public class UserController {
    @GetMapping("create-user")
    private String createUser(Model model) {
        User user = new User();
        model.addAttribute("user",user);
        //Iterable<Interest> interests = InterestRepository.findAll(); // tuka izliza grehska idk why myb shtoto nqmame nikakvi?? lmao
        //model.addAttribute("interests", interests);
        return "sign-in-user";
    }
    @PostMapping("create-user")
    private String saveUser(@Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "sign-in-user";
        }
        //userRepository.save(user); // i tuka, v ludogorie hacka 'user' e s malka bulkva lol
        return "redirect:/student-events"; // tuka go ostavih prosto za da ne e v greshka
        //return "redirect:/event/all-events-student";

    }
}

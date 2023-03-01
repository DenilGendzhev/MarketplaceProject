package com.example.Marketplace.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
    @GetMapping("/marketplace")
    public String chooseRole(Model model){
        return "home";
    }

}

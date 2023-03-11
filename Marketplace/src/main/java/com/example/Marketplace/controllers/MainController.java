package com.example.Marketplace.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.management.relation.Role;

@Controller
@RequestMapping(path = "/marketplace")
public class MainController {
    @GetMapping("/role")
    public String chooseRole(Model model, Role role) {
        model.addAttribute("role", role);
        return "home";
    }

    @PostMapping("/role")
    public String register(@RequestParam("role") String role) {
        return "sign-in-user";
    }
}

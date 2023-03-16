package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Admin;
import com.example.Marketplace.entities.Filter;
import com.example.Marketplace.repositories.AdminRepository;
import com.example.Marketplace.repositories.FilterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    FilterRepository filterRepository;

    @Autowired
    AdminRepository adminRepository;

    private final List<Filter> filters = new ArrayList<>();

    @GetMapping("/sign-in")
    public String showRegistrationForm(Model model) {
        model.addAttribute("admin", new Admin());
        return "sign-in-admin";
    }

    @PostMapping("/sign-in")
    public String processRegistrationForm(@ModelAttribute("admin") Admin admin) {
        adminRepository.save(admin);
        return "redirect:/admin/filters/add";
    }
}
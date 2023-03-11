package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Admin;
import com.example.Marketplace.entities.OrgManager;
import com.example.Marketplace.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(path = "/marketplace")
public class MainController {
    @GetMapping("/role")
    public String chooseRole(Model model) {
        model.addAttribute("role");
        return "home";
    }

    @PostMapping("/role")
    public String register(@RequestParam("role") String role) {
        if (role.equals("admin")) {
            return "redirect:/admin";
        } else if (role.equals("organization-manager")) {
            return "redirect:/organization-manager";
        } else {
            return "redirect:/user";
        }
    }

    @GetMapping("/admin")
    public String signInAdmin(Model model) {
        model.addAttribute("admin", new Admin());
        return "sign-in-admin";
    }

    @GetMapping("/organization-manager")
    public String signInOrgManager(Model model) {
        model.addAttribute("orgManager", new OrgManager());
        return "sign-in-org-manager";
    }

    @GetMapping("/user")
    public String signInUser(Model model) {
        model.addAttribute("user", new User());
        return "sign-in-user";
    }
}

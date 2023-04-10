package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Ad;
import com.example.Marketplace.entities.OrgManager;
import com.example.Marketplace.repositories.AdRepository;
import com.example.Marketplace.repositories.OrgManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/org-manager")
public class OrgManagerController {

    @Autowired
    OrgManagerRepository orgManagerRepository;
    AdRepository adRepository;

    @GetMapping("/sign-in")
    public String showRegistrationForm(Model model) {
        model.addAttribute("orgManager", new OrgManager());
        return "sign-in-org-manager";
    }

    @PostMapping("/sign-in")
    public String processRegistrationForm(@ModelAttribute("orgManager") OrgManager orgManager) {
        orgManagerRepository.save(orgManager);
        return "redirect:/org-manager/ads/add";
    }

    @GetMapping("/your-events")
    private String showYourEvents(OrgManager organization, Model model){
        model.addAttribute("organization", organization);
        Iterable<Ad> events = adRepository.findAll();
        model.addAttribute("events", events);
        return "organization-events";
    }
}

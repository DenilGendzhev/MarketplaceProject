package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Ad;
import com.example.Marketplace.entities.Filter;
import com.example.Marketplace.repositories.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/org-manager/ads")
public class AdController {

    @Autowired
    AdRepository adRepository;

    @GetMapping("/add")
    public String addAd(Model model) {
        model.addAttribute("ad", new Ad());
        return "org-manager-ads";
    }

    @PostMapping("/add")
    public String createAd(@ModelAttribute("ad") Ad ad, Model model) {
        adRepository.save(ad);
        model.addAttribute("ad", adRepository.findAll());
        return "ads-result";
    }
}

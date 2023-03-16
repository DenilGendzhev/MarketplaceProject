package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Filter;
import com.example.Marketplace.repositories.FilterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin/filters")
public class FilterController {

    @Autowired
    FilterRepository filterRepository;

    @GetMapping("/add")
    public String addFilter(Model model) {
        model.addAttribute("filter", new Filter());
        return "admin-filters";
    }

    @PostMapping("/add")
    public String createFilter(@ModelAttribute("filter") Filter filter, Model model) {
        filterRepository.save(filter);
        model.addAttribute("filters", filterRepository.findAll());
        return "filters-result";
    }
}


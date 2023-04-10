package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Admin;
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
    public String saveFilter(@ModelAttribute("filter") Filter formFilter, Model model) {
        filterRepository.save(formFilter);
        model.addAttribute("filters", filterRepository.findAll());
        return "filters-result";
    }

    @GetMapping("/all-filters")
    public String showAllFilters(Admin admin, Model model)  {
        model.addAttribute("admin", admin);
        Iterable<Filter> filters = filterRepository.findAll();
        model.addAttribute("filters", filters);
        return "all-filters";
    }
}


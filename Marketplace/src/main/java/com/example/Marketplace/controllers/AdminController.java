package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Filter;
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

    private final List<Filter> filters = new ArrayList<>();

    @GetMapping("/filters")
    public String addFilter(Model model) {
        Filter filter = new Filter();
        model.addAttribute("filters", filter);
        filterRepository.save(filter);
        return "admin-filters";
    }

    @PostMapping("/filters")
    public @ResponseBody Iterable<Filter> showFilters() {
        return filterRepository.findAll();
    }
}

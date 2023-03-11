package com.example.Marketplace.controllers;

import com.example.Marketplace.entities.Filter;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final List<Filter> filters = new ArrayList<>();

    @PostMapping("/filters")
    public void createFilter(@RequestBody Filter filter) {
        filters.add(filter);
    }

    @GetMapping("/filters")
    public @ResponseBody Iterable<Filter> getAllFilters() {
        return filters;
    }
}

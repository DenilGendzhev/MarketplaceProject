package com.example.Marketplace.services;

import com.example.Marketplace.entities.Filter;
import com.example.Marketplace.repositories.FilterRepository;

import javax.persistence.EntityNotFoundException;

public class FilterService {
    private final FilterRepository filterRepository;


    public FilterService(FilterRepository filterRepository) {
        this.filterRepository = filterRepository;
    }


    public Filter createFilter(Filter filter) {
        return filterRepository.save(filter);
    }

    public Filter updateFilter(Long id, Filter filter) {
        Filter existingFilter = filterRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Filter not found"));
        existingFilter.setId(filter.getId());
        return existingFilter;
    }
}

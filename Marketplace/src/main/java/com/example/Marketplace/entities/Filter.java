package com.example.Marketplace.entities;

import org.springframework.context.annotation.FilterType;

import javax.persistence.*;
import java.util.List;

@Entity
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private boolean mandatory;

    private FilterType type;

    @OneToMany(mappedBy = "filter")
    private List<FilterValue> values;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public FilterType getType() {
        return type;
    }

    public void setType(FilterType type) {
        this.type = type;
    }

    public List<FilterValue> getValues() {
        return values;
    }

    public void setValues(List<FilterValue> values) {
        this.values = values;
    }
}




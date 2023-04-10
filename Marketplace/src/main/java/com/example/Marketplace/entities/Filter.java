package com.example.Marketplace.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Filter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String value;
    private boolean mandatory;
    @OneToMany(mappedBy = "filter")
    private Set<FilterValue> values;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Set<FilterValue> getValues() {
        return values;
    }

    public void setValues(Set<FilterValue> values) {
        this.values = values;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }
}





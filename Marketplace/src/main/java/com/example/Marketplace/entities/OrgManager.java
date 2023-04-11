package com.example.Marketplace.entities;

import com.example.Marketplace.enums.Role;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table (name="orgmanager")
public class OrgManager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    @Email
    private String email;
    private String password;

    private Role role ;
    private int adID;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public int getAdID() {
        return adID;
    }
    public void setAdID(int adID) {
        this.adID = adID;
    }
}

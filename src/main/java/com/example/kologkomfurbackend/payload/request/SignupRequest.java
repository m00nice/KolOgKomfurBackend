package com.example.kologkomfurbackend.payload.request;

import java.util.Set;



public class SignupRequest {

    private String username;


    private String email;

    private Set<String> role;


    private String password;
    private String firstName;
    private String lastName;
    private int ilveDiscount;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIlveDiscount() {
        return ilveDiscount;
    }

    public void setIlveDiscount(int ilveDiscount) {
        this.ilveDiscount = ilveDiscount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Set<String> getRole() {
        return this.role;
    }

    public void setRole(Set<String> role) {
        this.role = role;
    }
}
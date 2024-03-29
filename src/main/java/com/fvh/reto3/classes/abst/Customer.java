/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvh.reto3.classes.abst;

/**
 *
 * @author fercho
 */
public abstract class Customer {
    private long id;
    private String address;
    private String phone;
    private String email;
    private String typeCustomer;

    // Constructor
    public Customer(long id, String address, String phone, String email, String typeCustomer) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.typeCustomer = typeCustomer;
    }
    
    // Getters
    // *****************************
    public long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }
    
    // Setters
    // *****************************
    public void setId(long id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
        
    public abstract String getDescription();
    public abstract String [] getSpecifications();
    public abstract void setSpecifications(String [] specifications);
    
    
}

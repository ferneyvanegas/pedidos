/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvh.reto3.classes;

import com.fvh.reto3.classes.abst.Customer;

/**
 *
 * @author fercho
 */
public class Company extends Customer {
    private String registeredName;
    private String nit;
    
    // Constructor

    public Company(String registeredName, String nit, long id, String address, String phone, String email, String typeCustomer) {
        super(id, address, phone, email, typeCustomer);
        this.registeredName = registeredName;
        this.nit = nit;
    }
    
    // Getters

    public String getRegisteredName() {
        return registeredName;
    }

    public String getNit() {
        return nit;
    }
    
    // Setters

    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    @Override
    public String getDescription(){
        return this.getId() + ": Empresa " + this.getRegisteredName();
    }
    
    @Override
    public String [] getSpecifications(){
        String [] specifications = new String [2];
        specifications[0] = this.getRegisteredName();
        specifications[1] = this.getNit();
        return specifications;
    }
    
    @Override
    public void setSpecifications(String [] specifications){
        this.setRegisteredName(specifications[0]);
        this.setNit(specifications[1]);
    }
    
    
}

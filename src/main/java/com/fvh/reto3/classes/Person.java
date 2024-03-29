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
public class Person extends Customer {
    private String document;
    private String firstName;
    private String secondName;
    private String firstSurname;
    private String secondSurname;

    // Constructor

    public Person(String document, String firstName, String secondName, String firstSurname, String secondSurname, long id, String address, String phone, String email, String typeCustomer) {
        super(id, address, phone, email, typeCustomer);
        this.document = document;
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstSurname = firstSurname;
        this.secondSurname = secondSurname;
    }
    
    //Getters

    public String getDocument() {
        return document;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstSurname() {
        return firstSurname;
    }

    public String getSecondSurname() {
        return secondSurname;
    }
    
    // Setters

    public void setDocument(String document) {
        this.document = document;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }
    
    @Override
    public String getDescription(){
        return this.getId() + ": " + this.getFirstName() + " " + this.getSecondName() + " " + this.getFirstSurname() + " " + this.getSecondSurname();
    }
    
    @Override
    public String [] getSpecifications(){
        String [] specifications = new String [5];
        specifications[0] = this.getDocument();
        specifications[1] = this.getFirstName();
        specifications[2] = this.getSecondName();
        specifications[3] = this.getFirstSurname();
        specifications[4] = this.getSecondSurname();
        return specifications;
    }
    
    @Override
    public void setSpecifications(String [] specifications){
        this.setDocument(specifications[0]);
        this.setFirstName(specifications[1]);
        this.setSecondName(specifications[2]);
        this.setFirstSurname(specifications[3]);
        this.setSecondSurname(specifications[4]);
    }
}

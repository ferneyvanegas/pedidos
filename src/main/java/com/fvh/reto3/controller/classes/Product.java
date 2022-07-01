/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvh.reto3.controller.classes;

import com.fvh.reto3.controller.enums.Dealer;

/**
 *
 * @author fercho
 */
public class Product {
    private long id;
    private String name;
    private Dealer dealer;

    public Product(long id, String name, Dealer dealer) {
        this.id = id;
        this.name = name;
        this.dealer = dealer;
    }
    
    // Getters

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Dealer getDealer() {
        return dealer;
    }
    
    public String getDescription(){
        return this.getId() + ": " + this.getName() + " || Conseguir con: " + this.getDealer().toString();
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }
    
}

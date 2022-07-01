package com.fvh.reto3.model;

import com.fvh.reto3.classes.abst.Customer;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fercho
 */
public class CustomerModel {
    public boolean create(Customer customer, String type){
        return true;
    }
    
    public boolean update(long id){
        return true;
    }
    
    public boolean delete(long id){
        return true;
    }
    
    public boolean find(long id){
        return true;
    }
    
    public boolean find(String name){
        return true;
    }
}

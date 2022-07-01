/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvh.reto3.controller;

import com.fvh.reto3.classes.abst.Customer;
import com.fvh.reto3.classes.Person;
import com.fvh.reto3.classes.Company;
import com.fvh.reto3.model.CustomerModel;

/**
 *
 * @author fercho
 */
public class CustomerController {
    private CustomerModel customerModel;

    public CustomerController() {
        this.customerModel = new CustomerModel();
    }
    
    public boolean addCustomer(){
        try{
            Person customer = new Person("123", "José", "Genaro", "Vanegas"
                                        , "Hernández", 1, "Dirección", "123456"
                                        , "email@email.com" , "Natural");
            this.customerModel.create(customer, customer.getTypeCustomer());
            return true;
        
        }
        catch(Exception e){
            return false;
        }  
    }
    
    public boolean editCustomer(Customer customer){
        try{
            this.customerModel.update(customer.getId());
            return true;
        
        }
        catch(Exception e){
            return false;
        }  
    }
    
    public boolean delCustomer(Customer customer){
        try{
            this.customerModel.delete(customer.getId());
            return true;
        
        }
        catch(Exception e){
            return false;
        }  
    }
    
    public boolean searchCustomer(long id){
        try{
            this.customerModel.find(id);
            return true;
        
        }
        catch(Exception e){
            return false;
        }  
    }
    
    public boolean searchCustomer(String name){
        try{
            this.customerModel.find(name);
            return true;
        
        }
        catch(Exception e){
            return false;
        }  
    }
    
    
}

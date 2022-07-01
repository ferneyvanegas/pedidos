/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvh.reto3.classes;

import java.util.Date;

import com.fvh.reto3.classes.abst.Customer;
import com.fvh.reto3.classes.ShoppingCar;

/**
 *
 * @author fercho
 */
public class Payment {
    private long id;
    private Date paymentDate;
    private double paymentValue;
    private ShoppingCar shoppingCar;
    private Customer owner;
    
    // Constructor

    public Payment(long id, Date paymentDate, double paymentValue, ShoppingCar shoppingCar, Customer owner) {
        this.id = id;
        this.paymentDate = paymentDate;
        this.paymentValue = paymentValue;
        this.shoppingCar = shoppingCar;
        this.owner = owner;
    }
    
    // Getters 

    public long getId() {
        return id;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public double getPaymentValue() {
        return paymentValue;
    }

    public ShoppingCar getShoppingCar() {
        return shoppingCar;
    }

    public Customer getOwner() {
        return owner;
    }

    // Setters

    public void setId(long id) {
        this.id = id;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setPaymentValue(double paymentValue) {
        this.paymentValue = paymentValue;
    }

    public void setShoppingCar(ShoppingCar shoppingCar) {
        this.shoppingCar = shoppingCar;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
    
    
    
}

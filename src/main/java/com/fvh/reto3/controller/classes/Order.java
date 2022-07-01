/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvh.reto3.controller.classes;

import java.util.Date;
import java.util.ArrayList;

import com.fvh.reto3.controller.classes.abst.Customer;
import com.fvh.reto3.controller.classes.Payment;
import com.fvh.reto3.controller.classes.ProductLine;
/**
 *
 * @author fercho
 */
public class Order {
    private long id;
    private Date makingDate;
    private boolean status;
    private double total;
    private Customer customer;
    private Payment payment;
    private ArrayList<ProductLine> productLines;
    
    // Constructor

    public Order(long id, Date makingDate, boolean status, double total, Customer customer, Payment payment, ArrayList<ProductLine> productLines) {
        this.id = id;
        this.makingDate = makingDate;
        this.status = status;
        this.total = total;
        this.customer = customer;
        this.payment = payment;
        this.productLines = productLines;
    }
    
}

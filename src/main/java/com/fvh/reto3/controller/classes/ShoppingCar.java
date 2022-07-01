/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvh.reto3.controller.classes;

import java.util.Date;
import java.util.ArrayList;

import com.fvh.reto3.controller.classes.ProductLine;
import com.fvh.reto3.controller.classes.abst.Customer;

/**
 *
 * @author fercho
 */
public class ShoppingCar {
    private Date creationDate;
    private Customer owner;
    private ArrayList<ProductLine> productLines;
    
    // Constructor

    public ShoppingCar(Date creationDate, Customer owner) {
        this.creationDate = creationDate;
        this.owner = owner;
    }
    
    // Getters

    public Date getCreationDate() {
        return creationDate;
    }

    public Customer getOwner() {
        return owner;
    }

    public ArrayList<ProductLine> getProductLines() {
        return productLines;
    }
    
    // Setters

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public void setProductLines(ArrayList<ProductLine> productLines) {
        this.productLines = productLines;
    }
    
    public boolean validateTime(){
        // TODO: Validar si el carro aún es válido ó nop
        return true;
    }
    
    public void addProductLine(int cant, double value, ProductLine productLine){
        if(this.validateTime()){
            this.productLines.add(productLine);
        }
        else
            System.out.println("No se puede agregar el producto, porque el carro ya no está disponible");
    }
}

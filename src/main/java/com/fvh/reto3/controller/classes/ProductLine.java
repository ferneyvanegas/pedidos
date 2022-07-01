/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvh.reto3.controller.classes;

import com.fvh.reto3.controller.classes.Product;
import com.fvh.reto3.controller.classes.ShoppingCar;

/**
 *
 * @author fercho
 */
public class ProductLine {
    private int cant;
    private double value;

    public ProductLine(int cant, double value, ShoppingCar shoppinCar, Product product) {
        this.cant = cant;
        this.value = value;
    }
    
    
}

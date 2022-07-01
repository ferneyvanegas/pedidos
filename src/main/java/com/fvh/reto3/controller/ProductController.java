/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvh.reto3.controller;

import com.fvh.reto3.classes.Product;
import com.fvh.reto3.model.ProductModel;
import com.fvh.reto3.classes.enums.Dealer;

/**
 *
 * @author fercho
 */
public class ProductController {
    private ProductModel productModel;

    public ProductController() {
        this.productModel = new ProductModel();
    }
    
    public boolean addProduct(){
        try{
            Product product = new Product(1, "Impresora" , Dealer.LEXMARK);
            this.productModel.create(product);
            return true;
        
        }
        catch(Exception e){
            return false;
        }  
    }
    
    public boolean editProduct(Product product){
        try{
            this.productModel.update(product.getId());
            return true;
        
        }
        catch(Exception e){
            return false;
        }  
    }
    
    public boolean delProduct(Product product){
        try{
            this.productModel.delete(product.getId());
            return true;
        
        }
        catch(Exception e){
            return false;
        }  
    }
    
    public boolean searchProduct(long id){
        try{
            this.productModel.find(id);
            return true;
        
        }
        catch(Exception e){
            return false;
        }  
    }
    
    public boolean searchProduct(String name){
        try{
            this.productModel.find(name);
            return true;
        
        }
        catch(Exception e){
            return false;
        }  
    }
    
    
    
    
}

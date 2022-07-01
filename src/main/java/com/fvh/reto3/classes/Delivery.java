/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fvh.reto3.classes;

import java.util.Date;

import com.fvh.reto3.classes.enums.DeliverCompany;
import com.fvh.reto3.classes.Order;
import com.fvh.reto3.classes.Payment;

/**
 *
 * @author fercho
 */
public class Delivery {
    private long id;
    private String billingAddress;
    private boolean finishDelivery;
    private Date sendDate;
    private DeliverCompany deliverCompany;
    private Order order;
    private Payment paymentValue;
    
    // Constructor

    public Delivery(long id, String billingAddress, boolean finishDelivery, Date sendDate, DeliverCompany deliverCompany, Order order, Payment paymentValue) {
        this.id = id;
        this.billingAddress = billingAddress;
        this.finishDelivery = finishDelivery;
        this.sendDate = sendDate;
        this.deliverCompany = deliverCompany;
        this.order = order;
        this.paymentValue = paymentValue;
    }
    
}

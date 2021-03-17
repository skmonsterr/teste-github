/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author SkM
 */
public class Order {
    
    private Date date;
    private Product product;
    
    
    
    // CONSTRUCTOR
    
      public Order(Date date, Product product) {
        super();
        this.date = date;
        this.product = product;
    }

    // GETTERS & SETTERS
      
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    // FUNCTIONS   
}

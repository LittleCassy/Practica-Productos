/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.model;

/**
 *
 * @author Casandra McJack
 */
public class ProductModel {
    private String productName;
    private float price;
    private int category;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public ProductModel(String productName, float price, int category) {
        this.productName = productName;
        this.price = (float)(Math.round(price * 100.0) / 100.0);
        this.category = category;
    }
    
    
}

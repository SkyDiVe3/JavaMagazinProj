package com.step.product;


import java.time.LocalDate;

public class Product {
    private String productName;
    private int inPrice;
    private int outPrice;
    private LocalDate expiryDate;
    private String description;
    private int stock;

//  Getters  ---------------------------------------------------------------------------------

    public String getProductName() {
        return productName;
    }

    public int getInPrice() {
        return inPrice;
    }

    public int getOutPrice() {
        return outPrice;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }

//  Setters  ---------------------------------------------------------------------------------

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setInPrice(int inPrice) {
        this.inPrice = inPrice;
    }

    public void setOutPrice(int outPrice) {
        this.outPrice = outPrice;
    }

    public void setExpiryDate(LocalDate productionDate, int valability) {
        this.expiryDate = productionDate.plusDays(valability) ;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}

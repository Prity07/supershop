package com.company.shopno;

public class Product {
    private int id;
    private String productName;
    private double price;
    private double size;

    public Product(int id, String productName, double price, double size){
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getSize() {
        return size;
    }
}

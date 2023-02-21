package com.company.shopno;

import java.util.ArrayList;

public class Basket {
    private int id;
    private int numberOfProduct;
    private ArrayList<Product> products;
    private Customer customer;

    public Basket(int id, Customer customer ){
        this.id = id;
        this.products = new ArrayList<Product>();
        this.customer = customer;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public int getNumberOfProduct() {
        return this.products.size();
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double calculateBill(){
        double sum = 0;
        for (int i = 0; i < this.products.size(); i++) {
            Product myProduct = this.products.get(i);
            sum = sum + myProduct.getPrice();
        }
        return sum;
    }

    public void showProducts(){
        for (Product product : this.products) {
            System.out.println("-----------------------------------");
            System.out.println("Product ID: " + product.getId());
            System.out.println("Product name: " + product.getProductName());
            System.out.println("Product price: " + product.getPrice() + " BDT");
            System.out.println("Product size: " + product.getSize());
        }
    }
}

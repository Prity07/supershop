package com.company.meena_Bazar;

import java.util.ArrayList;

public class Basket {
    private int id;
    private int numberOfProduct;
    private ArrayList<Product> products;
    private Customer customer;

    public Basket(int id, Customer customer){
        this.id = id;
        this.products= new ArrayList<Product>();
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void addProduct(Product product) {
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
        double sum =0;
        for(int i=0; i<this.products.size();i++){
            Product myProduct = this.products.get(i);
            sum = sum + myProduct.getPrice();
        }
        return sum;
    }

    public void showProduct(){
        for(Product a : this.products){
            System.out.println("-----------------");
            System.out.println("Product ID: " + a.getId());
            System.out.println("Product Name: " + a.getName());
            System.out.println("Product Size: " + a.getSize());
            System.out.println("Product Price: " + a.getPrice());
        }
    }
}


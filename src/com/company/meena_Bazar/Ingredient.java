package com.company.meena_Bazar;

public class Ingredient {
    private int id;
    private String name;
    private String size;
    private double price;

    public Ingredient(int id, String name, String size, double price){
        this.id = id;
        this.name = name;
        this.size = size;
        this.price = price;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSize(){
        return size;
    }
    public double getPrice(){
        return price;
    }
}

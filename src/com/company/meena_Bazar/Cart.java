package com.company.meena_Bazar;

import java.util.ArrayList;

public class Cart {
    private int id;
    private int numberOfIngredient;
    private ArrayList<Ingredient> ingredients;

    public Cart(int id, int numberOfIngredient){
        this.id = id;
        this.numberOfIngredient = numberOfIngredient;
        this.ingredients= new ArrayList<Ingredient>();

    }
}


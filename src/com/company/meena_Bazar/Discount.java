package com.company.meena_Bazar;

public class Discount implements IDiscount {
    private int discountedAmount;

    public Discount(int discountedAmount){
        this.discountedAmount = discountedAmount;
    }
    @Override
    public double calculateRegularDiscount() {
        return this.discountedAmount;
    }
}

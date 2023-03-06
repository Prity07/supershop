package com.company.shopno;

public class Discount implements IDiscount{
    private int discountedAmount;

    public Discount(int discountedAmount) {

        this.discountedAmount = discountedAmount; // 200
    }

    @Override
    public double calculateRegularDiscount() {

        return this.discountedAmount; // 200
    }
}

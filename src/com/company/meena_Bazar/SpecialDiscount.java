package com.company.meena_Bazar;

public class SpecialDiscount extends Discount {


    public SpecialDiscount(int discountedAmount) {
        super(discountedAmount);
    }

    public double calculateDiscount(Customer customer){
        if (customer instanceof LoyalCustomer){
            double regularDiscount = this.calculateRegularDiscount(); //20
            double specialDiscount = ((LoyalCustomer) customer).getRewardPoint();//1000
            double totalDiscount = regularDiscount+ specialDiscount;//1020
            return totalDiscount;
        }
        else {
            return 0;
        }
    }
}

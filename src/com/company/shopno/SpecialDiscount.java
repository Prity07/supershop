package com.company.shopno;

public class SpecialDiscount extends Discount{
    public SpecialDiscount(int discountedAmount) {
        super(discountedAmount); // 200
    }

    public double calculateDiscount(Customer customer){
        if (customer instanceof LoyalCustomer){
            double regularDiscount = this.calculateRegularDiscount(); // 200
            double specialDiscount = ((LoyalCustomer) customer).getRewardPoint() / 100; // 10
            double totalDiscount  =  regularDiscount + specialDiscount; // 210
            return totalDiscount; // 210
        }
        else{
            return 0;
        }
    }

}

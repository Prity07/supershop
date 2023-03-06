package com.company.Beauty_Salon;

import java.util.Date;

public class TestDiscountRate {
    public static void main(String[] args) {
        Customer c1 = new Customer("Maruf");
        c1.setMember(true);
        c1.setMemberType("Silver");

        Date currentDate = new Date();
        Visit v1 = new Visit(c1, currentDate);
        v1.setProductExpense(200);
        v1.setServiceExpense(500);

        System.out.println("Customer Name: " + v1.getName());
        System.out.println("Total Expense: " + v1.getTotalExpense());

        double totalProductExpense = v1.getProductExpense();
        double totalServiceExpense = v1.getServiceExpense();
        double totalBill = totalProductExpense + totalServiceExpense;
        if (v1.getCustomer().getMemberType() == "Premium") {
            double productDiscount =
                    totalProductExpense * DiscountRate.getProductDiscountRate("Premium");
            double serviceDiscount = totalServiceExpense * DiscountRate.getServiceDiscountRate("Premium");
            totalBill = totalBill - productDiscount - serviceDiscount;
        }
        else if (v1.getCustomer().getMemberType() == "Gold") {
            double productDiscount =
                    totalProductExpense * DiscountRate.getProductDiscountRate("Gold");
            double serviceDiscount = totalServiceExpense * DiscountRate.getServiceDiscountRate("Gold");
            totalBill = totalBill - productDiscount - serviceDiscount;
        }
        else if (v1.getCustomer().getMemberType() == "Silver") {
            double productDiscount =
                    totalProductExpense * DiscountRate.getProductDiscountRate("Silver");
            double serviceDiscount = totalServiceExpense * DiscountRate.getServiceDiscountRate("Silver");
            totalBill = totalBill - productDiscount - serviceDiscount;
        }

        System.out.println("Total Bill: " + totalBill);


    }
}

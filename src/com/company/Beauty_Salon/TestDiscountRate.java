package com.company.Beauty_Salon;

public class TestDiscountRate {
    public static void main(String[] args) {
        Customer c1 = new Customer("Maruf");

        boolean result= c1.isMember();
        if(result == true){
            System.out.println("Customer has Membership Card");
        }
        else {
            System.out.println("Customer do not have any Membership Card");
        }


        DiscountRate d1= new DiscountRate();


       //c1.setMember(true);
        c1.setMemberType("Gold Member");
    }
}

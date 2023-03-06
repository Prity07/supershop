package com.company.OopExercises;

public class TestAccount1 {
    public static void main(String[] args) {

        Customer1 customer1 = new Customer1(10,"Bilal Hossen", 'M');
        System.out.println(customer1);

        Account1 acc1 = new Account1(201,customer1,500);

        System.out.println(acc1);

        System.out.println("--------------");
        System.out.println(acc1.deposit(500));

        System.out.println("____________");
        System.out.println(acc1.withdraw(200));

        System.out.println("-------------");
        System.out.println(acc1.withdraw(1200));
    }
}

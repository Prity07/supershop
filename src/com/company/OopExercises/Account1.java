package com.company.OopExercises;

public class Account1 {
    private int id;
    private Customer1 customer1;
    private double balance = 0;

    public Account1 (int id, Customer1 customer1,double balance){
        this.id = id;
        this.customer1 = customer1;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer1 getCustomer1() {
        return customer1;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public  String getCustomerName(){
        String customerName = this.customer1.getName();
        return customerName;
    }
    public Account1 deposit(double amount){
        balance = balance+amount;
        return this;
    }
    public Account1 withdraw (double amount){
        if(balance >= amount){
            balance = balance-amount;
        }
        else{
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "id=" + id +
                ", customer1=" + customer1 +
                ", balance=" + balance +
                '}';
    }
}

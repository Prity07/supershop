package com.company.Beauty_Salon;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date){
        this.date = date;
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getName(){
        return this.customer.getName();
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }
    public double getTotalExpense(){
        double totalExpense = this.productExpense + this.serviceExpense;
        return totalExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}

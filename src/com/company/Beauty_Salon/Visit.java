package com.company.Beauty_Salon;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date, Customer customer){
        this.date = date;
        this.customer = new Customer(name);
    }
    public String getName(){
        return this.customer.getName();
    }

    public double getProductExpense() {
        if(customer.isMember()){

        }
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
        double totalExpense = getServiceExpense()+getProductExpense();
        return totalExpense;
    }
}
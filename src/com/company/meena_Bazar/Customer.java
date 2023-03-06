package com.company.meena_Bazar;

public class Customer {
    private int id;
    private String name;
    private String dob;
    private Branch branch;

    public Customer(int id, String name, String dob, Branch branch){
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public Branch getBranch() {
        return branch;
    }
}

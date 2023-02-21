package com.company.shopno;

public class Customer {
    private int id;
    private String name;
    private String dateOfBirth;
    private Branch branch;

    public Customer(int id, String name, String dateOfBirth, Branch branch) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.branch = branch;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public Branch getBranch() {
        return branch;
    }
}



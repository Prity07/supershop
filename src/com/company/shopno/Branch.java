package com.company.shopno;

public class Branch {
        private int id;
        private String branchName;
        private Manager manager;

    public Branch(int id, String branchName, Manager manager) {
        this.id = id;
        this.branchName = branchName;
        this.manager= manager;
    }

    public int getId() {
        return id;
    }
    public String getBranchName(){
        return branchName;
    }

    public Manager getManager() {
        return manager;
    }
}



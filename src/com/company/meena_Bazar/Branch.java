package com.company.meena_Bazar;

public class Branch {
    private int id;
    private String branchName;

    public Branch(int id, String branchName){
        this.id = id;
        this.branchName = branchName;
    }

    public int getId() {
        return id;
    }

    public String getBranchName() {
        return branchName;
    }
}

package com.company.meena_Bazar;

public class Manager extends Employee{
    private String positionName;

    public Manager(String positionName, double salary, Branch branch, int id, String name, String dob, String gender, String bloodGroup, String phoneNumber, String city) {
        super(salary, branch, id, name, dob, gender, bloodGroup, phoneNumber, city);
        this.positionName = positionName;
    }

    public String getPositionName(){
        return positionName;
    }
    public void setPositionName(){
        this.positionName = positionName;
    }
}

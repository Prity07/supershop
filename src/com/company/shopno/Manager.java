package com.company.shopno;

public class Manager extends Employee{

    private String positionName;

    public Manager(double salary, Branch branch, int id, String name,
                   String dob, String gender, String bloodGroup, String phoneNumber, String city) {
        super(salary, branch, id, name, dob, gender, bloodGroup, phoneNumber, city);
    }

    public void setPositionName(String positionName) {

        this.positionName = positionName;
    }

    public String getPositionName() {

        return positionName;
    }
}

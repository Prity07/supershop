package com.company.shopno;

public class Manager {
    private Integer id;
    private String managerName;
    private int salary;

    public Manager(int id, String managerName, int salary){
        this.id = id;
        this.managerName = managerName;
        this.salary= salary;
    }

    public int getId() {
        return id;
    }
    public String getManagerName() {
        return managerName;
    }
    public int getSalary() {
        return salary;
    }
}

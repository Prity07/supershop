package com.company.meena_Bazar;

public class Employee extends Person {

    private static int employeeId = 6000;
    private double salary;
    private Branch branch;

    public Employee(double salary, Branch branch,int id, String name, String dob, String gender, String bloodGroup, String phoneNumber, String city) {
        super(id, name, dob, gender, bloodGroup, phoneNumber, city);
        employeeId = employeeId + 1;
        this.salary = salary;
        this.branch = branch;
    }

    public static int getEmployeeId() {
        return employeeId;
    }
    public static void setEmployeeId(int employeeId){
        Employee.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
         this.salary = salary;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}

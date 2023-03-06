package com.company.OopExercises;

public class TestEmployee {
    public static void main (String[]args){
        Employee employee1 = new Employee(5001,"Maruf ","Hossen",50000);

        System.out.println("Employee ID: " + employee1.getId());
        System.out.println("Employee First Name: " + employee1.getFirstName());
        System.out.println("Employee Last Name: " + employee1.getLastName());
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Salary: " + employee1.getSalary());
        System.out.println("Annual Salary: " + employee1.getAnnualSalary());
        System.out.println("New Salary: " + employee1.raiseSalary(10));
    }

}

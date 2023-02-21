package com.company.school;

public class Student {
    private String name;
    private int roll;
    private String gender;
    private String bloodGroup;
    private double height;
    private String dob;
    private int section;
    private String schoolName;
    private String classTeacher;

    public Student(String name, int roll, String gender, String dob){
        this.name = name;
        this.roll = roll;
        this.gender = gender;
        this.dob = dob;
    }

    public String getBloodGroup(){
        return this.bloodGroup;
    }

    public void setBloodGroup(String bloodGrp){
        this.bloodGroup = bloodGrp;
    }

}

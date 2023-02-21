package com.company.school;

public class Teacher {
    private String name;
    private int age;
    private int id;
    private String subject;

    public Teacher (String name, int age, int id, String subject){
        this.name=name;
        this.age=age;
        this.id=id;
        this.subject=subject;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getId(){
        return  this.id;
    }
    public String getSubject(){
        return this.subject;
    }

    public void setName(String n) {
        this.name= n;
    }
    public void setAge (int a){
        this.age =a;
    }
    public int setId (int b){
        this.id=b+1;
        return b;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

}

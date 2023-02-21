package com.company.school;


interface Test1{
    int a = 100;
    void display();
}

interface Test2{
    int b= 200;
    void show();
        }

public class InterfaceExample implements Test1,Test2 {

    public void display() {

        System.out.println(a);
    }
    public void show(){
        System.out.println(b);
    }

    public static void main(String[] args) {

        InterfaceExample ie = new InterfaceExample();
        ie.display();
        ie.show();
    }
}

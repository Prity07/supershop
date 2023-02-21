package com.company.school;

public class Animal {

    // Initialize by reference:
    String color;
    int age;

    // Initialize by method:
    public void initObj(String A, int C) {
        color = A;
        age = C;
    }
    public void display (){
        System.out.println(color + " " + age);
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public static void main(String[] args) {
        System.out.println("1");
        Animal tommy = new Animal();
        tommy.eat();
        tommy.run();
        tommy.color = "black";
        tommy.age = 40;
        System.out.println(tommy.color + " " + tommy.age);


        tommy.initObj("blue",100);
        tommy.display();
    }

    public void run() {
        System.out.println("I am running");
    }
}

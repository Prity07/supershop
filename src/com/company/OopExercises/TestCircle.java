package com.company.OopExercises;

public class TestCircle {
    public static void main (String [] args){

        Circle c1 = new Circle(2.2,"pink");
c1.setColour("blue");

        System.out.println("Area is: " + c1.getArea());
        System.out.println("Circumference is : " + c1.getCircumference());
        System.out.println("Colour: " + c1.getColour());
    }
}

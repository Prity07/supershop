package com.company.OopExercises;

public class TestRectangle {
    public static void main (String[]args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(1,20);

        System.out.println(r1.getArea());

        r2.setLength(5.6f);
        r2.setWidth(7.8f);
        System.out.println("Area is: " + r2.getArea());
        System.out.println("Perimeter is: " + r2.getPerimeter());
    }
}

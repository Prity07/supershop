package com.company.OopExercises;

public class Circle {
    private double radius = 1;
    private String colour = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = radius * radius * (Math.PI);
        return area;
    }

    public double getCircumference() {
        double circumference = 2 * radius * Math.PI;
        return circumference;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                ']';
    }
}

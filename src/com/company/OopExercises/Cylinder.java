package com.company.OopExercises;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder(double height, double radius, String colour) {
        super(radius, colour);
        this.height = height;
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }
    public Cylinder(){
        super();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        double volume = Math.PI*(getRadius()*getRadius())*height;
        return volume;
    }
}

package com.company.OopExercises;

public class Rectangle {
    private float length = 1.0f;
    private float width = 5.0f;

    public Rectangle(){
    }
    public Rectangle(float length, float width){
        this.length= length;
        this.width = width;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        double area = length*width;
        return area;
    }
    public double getPerimeter(){
        double perimeter = (length+width)*2;
        return perimeter;
    }

}

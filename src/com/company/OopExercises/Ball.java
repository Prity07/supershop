package com.company.OopExercises;

public class Ball {
    private float X;
    private float Y;
    private int radius;
    private float XDelta;
    private float YDelta;

    public Ball(float X, float Y, int radius, float XDelta, float YDelta){
        this.X= X;
        this.Y = Y;
        this.radius = radius;
        this.XDelta = XDelta;
        this.YDelta = YDelta;
    }
    public float getX() {
        return X;
    }

    public void setX(float X) {
        this.X = X;
    }

    public float getY() {
        return Y;
    }

    public void setY(float Y) {
        this.Y = Y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return XDelta;
    }

    public void setXDelta(float XDelta) {
        this.XDelta = XDelta;
    }

    public float getYDelta() {
        return YDelta;
    }

    public void setYDelta(float YDelta) {
        this.YDelta = YDelta;
    }
    public void move(){
        X+= XDelta;
        Y+= YDelta;
    }
    public void reflectHorizontal(){
        XDelta = -XDelta;
    }
    public void reflectVertical(){
        YDelta = -YDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" +
                "X=" + X +
                ", Y=" + Y +
                ", XDelta=" + XDelta +
                ", YDelta=" + YDelta +
                '}';
    }
}

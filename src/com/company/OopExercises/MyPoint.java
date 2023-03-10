package com.company.OopExercises;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){
    }
    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int [] xy = {x,y};
        return xy ;
    }
    public void setXY(int x, int y){
         this.x = x;
         this.y = y;
    }

    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

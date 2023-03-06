package com.company.OopExercises;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime(){
    }
    public MyTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public MyTime nextSecond(){
        if (second == 59){
            second=0;
        }
        else{
            second = second + 1;
        }
        return this;
    }

    public MyTime nextMinute(){
        if (minute == 59){
            minute=0;
        }
        else {
            minute = minute + 1;
        }
        return this;
    }

    public MyTime nextHour(){
        if (hour == 23) {
            hour=0;
        }
        else{
            hour = hour + 1;
        }
        return this;
    }

    public MyTime previousSecond(){
        if(second == 0){
            second = 59;
        }
        else{
            second = second -1;
        }
        return this;
    }
    public MyTime previousMinute(){
        if(minute == 0){
            minute = 59;
        }
        else{
            minute = minute -1;
        }
        return this;
    }
    public MyTime previousHour(){
        if(hour == 0){
            hour = 23;
        }
        else{
            hour = hour-1;
        }
        return this;
    }

    @Override
    public String toString() {
        return this.hour + "h:"
                + this.minute + "m:"
                + this.second
                + "s";
    }
}

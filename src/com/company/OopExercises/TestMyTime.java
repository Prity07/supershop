package com.company.OopExercises;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime m1 = new MyTime(0,59,20);

        System.out.println(m1);

        System.out.println(m1.nextHour().getHour());
        System.out.println(m1.getMinute());
        System.out.println(m1.nextMinute().nextMinute().getMinute());

        System.out.println("-------------");
        System.out.println(m1.previousHour().previousHour().getHour());
    }
}

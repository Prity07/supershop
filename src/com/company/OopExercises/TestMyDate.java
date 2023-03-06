package com.company.OopExercises;

public class TestMyDate {
    public static void main(String[] args) {

        MyDate d1 = new MyDate(2000,12,15);

        boolean leapYear = d1.isLeapYear(2008);
        if(leapYear == true){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
        System.out.println("-----------");

        boolean validDate = d1.isValidDate(2020,10,15);
        if(validDate == true){
            System.out.println("The date is valid.");

        }
        else{
            System.out.println("The date is invalid");
        }
        System.out.println(d1);

    }
}

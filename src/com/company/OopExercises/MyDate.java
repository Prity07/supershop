package com.company.OopExercises;

import java.util.Arrays;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public String[] MONTHS = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep",
    "Oct","Nov","Dec"};
    public String[]DAYS = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public int[] DAYSINMONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setDate(int year, int month, int day){
        this.year = year;
        this.month= month;
        this.day = day;
    }

    public boolean isLeapYear(int year){
        if((year%4 ==0 && year%100 !=0)||(year%400 ==0)){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isValidDate (int year, int month, int day){
        if(year>= 1 && year <= 9999){
            if(month>=1 && month<=12 ){
                int totalDays = DAYSINMONTHS[month-1];
                if(day>=1 && day<= totalDays){
                    if(month == 2 && isLeapYear(year) == true){
                        System.out.println("Total days = 29 days.");
                    }
                    else{
                        System.out.println("Total days = " + totalDays + " days.");
                    }

                    return true;
                }
            }
        }
        return false;
    }

//    public int getDayOfWeek(int year, int month, int day){
//
//    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", MONTHS=" + Arrays.toString(MONTHS) +
                ", DAYS=" + Arrays.toString(DAYS) +
                ", DAYSINMONTHS=" + Arrays.toString(DAYSINMONTHS) +
                '}';
    }

    //    public boolean isValidDate(int year, String month, int day) {
//        if (year >= 1 && year <= 9999) {
//            for (int i = 0; i < MONTHS.length; i++) {
//                if (month == MONTHS[i]) {
//                    if (day >= 1 && day <= 31) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }

}

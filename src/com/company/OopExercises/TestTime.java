package com.company.OopExercises;

public class TestTime {
    public static void main (String[]args){
        Time time = new Time(2,45,50);
        time.setTime(3,50,58);
        System.out.println(time);
        System.out.println(time.getHour()+ "h :" +time.getMinute()+ "m :" +time.getSecond() + "s");

        System.out.println(time.nextSecond());
        System.out.println(time.getHour()+ "h :" +time.getMinute()+ "m :" +time.getSecond() + "s");


        System.out.println(time.previousSecond());
        System.out.println(time.getHour()+ "h :" +time.getMinute()+ "m :" +time.getSecond()+ "s");
                System.out.println("----------------");

        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);  // toString()

        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // toString()

        // Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());


        // Test previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());

        University university = new University(1, "Oxford");
        System.out.println(university.getClass());
        System.out.println("ID: " + university.getId());
        System.out.println("name: " + university.getName());
        University univeristy2 = university.changeUniversityName("Cambridge");
        System.out.println("ID: " + univeristy2.getId());
        System.out.println("name: " + univeristy2.getName());
        System.out.println(univeristy2.changeUniversityName("MIT").changeUniversityName("Harvard"));;
        System.out.println(university.toString());

        // Murgir dim tmi
    }
}

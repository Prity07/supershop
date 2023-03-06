package com.company.OopExercises;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Nazmun","Bailey road");
        System.out.println(p1);

        Student s1 = new Student("Maruf","Jatrabari","BSC",2022,1000);
        System.out.println(s1);

        Staff s2 = new Staff("Ameena","Dhaka","VNS",500);
        System.out.println(s2);
    }
}

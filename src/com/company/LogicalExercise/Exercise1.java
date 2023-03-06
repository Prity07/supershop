package com.company.LogicalExercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Number1: ");
        int a = scanner.nextInt();

        System.out.println("Enter Number2: ");
        int b = scanner.nextInt();

        System.out.println("Enter Number3: ");
        int c = scanner.nextInt();

        System.out.println("Enter Name: ");
        String name = scanner.next();
        System.out.println("I am: " + name);

        int add =  a + b + c;
        System.out.println(add);

        int number = highestNumber(a,b,c);
        System.out.println("Highest Number is: " + number);
    }

    public static int highestNumber(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else {
            return c;
        }

    }
}

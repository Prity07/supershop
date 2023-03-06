package com.company.LogicalExercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        addition();

    }

    public static void addition() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i=1; i<=10; i++){
            System.out.println("Enter a Number: ");
           int a = scanner.nextInt();
            System.out.println("The input Number is: " + a);
            sum = sum + a;
            System.out.println("The total sum is: " + sum );

        }
    }
}

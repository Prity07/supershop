package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

//        String gender = "Female";
//        if (gender.equals("Female")) {
//
//        } else if (gender.equals("Male")) {
//
//        } else if (gender.equals("Prefer_not_to_say")) {
//
//        } else {
//
//        }
//
//        switch (gender) {
//            case "Female":
//                System.out.println("I am a female");
//                break;
//            case "Male":
//                System.out.println("I am a Male");
//                break;
//            case "Prefer_not_to_say":
//                System.out.println("I do not want to say");
//                break;
//            default:
//                System.out.println("Unknown Gender");
//
//        }
//    }

//
        // CALL FUNCTION HERE:

//   6.
//   int result = add(20,50);
//        System.out.println(result);
        // 1
//        int result = highestNumber(800, 500);
//        System.out.println(result);

//       4.
//       float result = add(60,60);
//        System.out.println(result*2);

//        5.
//        int result = addThreeNumber(2,5,4);
//        System.out.println(result+10);
//
//        for (int i=0;i<=20;i++){
//            System.out.println(i);
//        }

//        for(int i=3;i<=29;i++){
//            if (i % 2 != 0){
//                System.out.println(i);
//            }
//        }

//        for (int i=12; i>=-15; i--){
//            if (i%2==0){
//                System.out.println(i);
//            }
//        }

//        for (int i=50; i>=20; i--){
//            if (i%3==0){
//                System.out.println(i);
//            }
//        }

        //Write a program to calculate the sum of first 10 natural number.
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum = sum+i;
//        }
//        System.out.println(sum);


        //Write a program that prompts the user to input a positive integer.
        // It should then output a message indicating whether the number is a prime number.

//        int num = 23;
////        boolean isPrime = true;
//        for (int i = 2; i <= 9; i++) {
//            if (num != i && num % i == 0) {
//                System.out.println("It is not prime number");
//                break;
//            } else if (i == 9) {
//                System.out.println("It is prime number");
//                break;
//            }
//        }


//         else {
//            System.out.println("It is prime number");
//            break;
//        }
///        if (isPrime == true) {
///            System.out.println("It is prime number");
///        }
///        else{
///           System.out.println("it is not prime number");
///        }

//Write a program that prompts the user to input a positive integer.
// It should then print the multiplication table of that number.

//        int numb = 2000307;
//
//        for(int i=1; i<=10; i++){
//            int result= numb*i;
//            System.out.println(numb + "x"+ i +"=" +result);
//        }

        //Write a program to find the factorial value of any number entered through the keyboard.

//        int a = 21;
//        int result = 1;
//        for(int i=1; i<=a; i++){
//            result = result*i;
//        }
//        System.out.println(result);

        //Two numbers are entered through the keyboard. Write a program to find the
        // value of one number raised to the power of another.

//        int baseNumber = 2;
//        int power = 100;
//        int result = 1;
//
//        for (int i = 1; i<=power;i++){
//            result = result*baseNumber;
//            System.out.println(i + "th value:" +result);
//        }
//        System.out.println(result);

//        Write a program that prompts the user to input a positive integer.
//        It should then output a message indicating whether the number is a prime number.

//        for(int i=2 ; i<=100; i++){ // 100 = n
//            for(int j = 2;j <=9; j++){ // 8 = n
//                if(i != j && i%j == 0){
////                    System.out.println( i + " is not prime number");
//                    break;
//                }
//                else if(j == 9){
//                    System.out.println(i+" is prime number");
//                    break;
//                }
//            }
//        }
//        int add = 2;
//        int [] numbers = new int [5];
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers.length);

//int finalResult = 0;
//        for (int i = 1; i <= 10; i++){
//            int result = 1;
//            System.out.println("i: " +i + "th: " + result);
//            for (int j = 1; j<=10; j++){
//                result = result+j;
//                System.out.println("j: "+j + "th: )finalResult = result;
//        }
//
//       ();

//Array

        int[] array = {10, 1, 2, 4, 6, 9};
        System.out.println(array[2]);
        System.out.println(array[1]);
        System.out.println(array[0]);
        System.out.println("Length: " + array.length);
        int sum = array[0] + array[1];
        System.out.println("1st and 2nd Sum: " + sum);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Value of " + i + " th array is " + array[i]); //
            if (array[i] % 2 == 0) { //
                System.out.println(array[i] + " is even"); //
            }
        }


        String[] stringArray = {"Apple", "Banana", "Orange", "Litchi", "Malta"};
        stringArray[1] = "Mango";
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
            if (stringArray[i].equals("Malta")) {
                System.out.println("Malta found");
                break;
            }
        }


        // 1. Ekta array er sum koro shb gula number er

        int[] numbers = {2, 9, 50, 1, 20, 300};
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[3]);
        System.out.println(numbers.length);

        int addition = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            addition = addition + numbers[i];
        }
        System.out.println(addition);

        //2. Ekta array er average koro oi number gular

        float average = 0;
        for (int i = 0; i < numbers.length; i++) {
            average = (average + numbers[i]);

        }
        float division = average / numbers.length;
        System.out.println(division);


//        int addition = array [0] + array [1];
//        System.out.println(addition);

//3. 3. Array theke shob theke boro shongkha ber korba.

        int highNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (highNumber < numbers[i]) {
                highNumber = numbers[i];

            }
        }
        System.out.println(highNumber);
        //

        int[] number = new int[]{25, 11, 7, 105, 56};
        //Initialize max with first element of array.
        int highestnumb = number[0];
        //Loop through the array
        for (int i = 0; i < number.length; i++) {
            //Compare elements of array with max
            if (number[i] > highestnumb) {
                highestnumb = number[i];
            }
        }
        System.out.println("Largest element present in given array: " + highestnumb);


        //4. Array theke shob theke choto shongkha ber korba.

        int smallestNumb = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (smallestNumb > numbers[i]) {
                smallestNumb = numbers[i];
            }
        }
        System.out.println(smallestNumb);


        //5. Ekta shonkha ar ekta array input dibo. Bolte hobe oi shongkha ta koybar ase array te
//Eg,
//array = { 5,6,5,8,9}
//number = 5

        int[] arrays = {5, 6, 5, 8, 9};
//        for (int i = 0; i < arrays.length; i++){
//            System.out.println(arrays[i]);
//        }

        int givenNumb = 5;
        int counter = 0;

        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i] == givenNumb) {
                counter++;
            }
        }
        System.out.println(counter);

        //ArrayList:
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(8);
        nums.add(5);
        nums.add(2);

        for (int n : nums) {
            System.out.println(n);
        }

        List<Integer> numbs = new ArrayList<Integer>();
        numbs.add(9);
        numbs.add(5);
        numbs.add(7);
        numbs.add(4);
        numbs.add(6);

        System.out.println(numbs.get(0));
        System.out.println(numbs.indexOf(5));
        //System.out.println(numbs.stream().max(4));

        for(Object m: numbs){
            int numb= (Integer) m;
            System.out.println(numb*2);
        }

       //
        ArrayList<Integer> thousandsNumber =  new ArrayList<Integer>();
        for (int i = 1000; i < 2000 ; i++) {
            thousandsNumber.add(i);
        }

        System.out.println(thousandsNumber);


    }


    //WRITE FUNCTION HERE

    //   6.
    static int number(int numb1, int numb2) {
        int sum = numb1 + numb2 + 30;
        return sum;
    }

    //1.
    static int highestNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    //
//
//    //   4.
    static float add(int c, int d) {
        float sum = c + d;
        return sum;
    }

    //
//    //    5.
    static int addThreeNumber(int e, int f, int g) {
        int sum = e + f + g;
        return sum;
    }


//Construct for loops that accomplish the following tasks:
//        a Print the numbers 0 - 20, one number per line.
//        b Print only the ODD values from 3 - 29, one number per line.
//        c Print the EVEN numbers 12 down to -14 in descending order, one number per line.
//        d Print the numbers 50 down to 20 in descending order, but only if the numbers are multiples of 3.


//1 Ask for two user input numbers, pass to a function and then display highest number.
// 2 Ask for two user input numbers, pass to a function and then return highest number
// to main function.
// 3 Ask for two user input numbers, pass to a function and then return highest
// number to main function. Display the highest number inside main function.
// 4 Ask the user to input two numbers and return the sum to main() by using
// a function and then inside the main() display the result after multiplying the sum by 2.
// 5 Ask user to enter three numbers then pass the value to a function.
// Add three numbers inside the function and return the result to main function.
// Inside main function display the result by adding 10 to it.


//    String country = getCountryName();
//        if (country.equals("Bangladesh")){
//                System.out.println("I love this country");
//                }else{
//                System.out.println("I hate you");
//                }
////        System.out.println(country);
//
//     static String getCountryName(){
//        return "Estonia";
//        }
//
//
}
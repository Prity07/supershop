package com.company.school;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
    }

    public Calculator(){

    }

    public void setNum1(int no1){

        this.num1 = no1;
    }

    public void setNum2(int no2){

        this.num2 = no2;
    }

    public int add(){
        int sgdfgdfgdfgdfgfd = this.num1 + this.num2;
        return sgdfgdfgdfgdfgfd;
    }

    public int substract(){
        int subResult = this.num1 - this.num2;
        return subResult;
    }

    public int multiply(){
        int multiplication = this.num1 * this.num2;
        return multiplication;
    }

    public int division(){
        int divide = this.num1 / this.num2;
        return divide;
    }

}

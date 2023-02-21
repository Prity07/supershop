package com.company.school;

public class Practice {
    private int number1;
    private int number2;
    private int number3;

    //constructor
    public Practice(int n1, int n2, int n3) {
        this.number1 = n1;
        this.number2 = n2;
        this.number3 = n3;
    }

    public int getNumber1() {
        return this.number1;
    }

    public void getNumber2() {

    }

    public int getNumber3() {
        return this.number3;
    }

    public int setNumber1(int c) {
        this.number1 = c;
        return c;
    }

    public int setNumber2(int d) {
        this.number2 = d + 1;
        return d;
    }

    public void setNumber3(int e) {
        this.number3 = e;

    }

    public int addFunction (){
        int addition= this.number1 + this.number2 + this.number3;
        return addition;
    }

    public int substractFunction (){
        int substract= this.number1-this.number2-this.number3;
        return substract;
    }

    public int multiplyFunction(){
        int multiply= this.number1* this.number2* this.number3;
        return multiply;
    }
    public int divisionFunction(){
        int division= this.number1/this.number2/this.number3;
        return division;
    }



}

//public class Practice2 extends Practice{
//    public int number4;
//
//}




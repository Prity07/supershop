package com.company.school;

class A {
    int a;
    int b;

    public void display() {
        System.out.println(a + b);
    }
}

class B extends A {
    int c;
    int d;

    public void show() {
        System.out.println(c + d);
    }
}

class C extends B {
    int x;
    int y;

    public void addition(){
        System.out.println(x+y);
    }
}
// hierarchy inheritance @Override

class Bank {
 public int getRateOfinterest(){
     return 0;
 }
}
class SBI extends Bank{

    public int getRateOfinterest() {
        return 10;
    }
}

class ICICI extends Bank{
    public int getRateOfinterest(){
        return 15;
    }
}

class Axis extends Bank{
    public int getRateOfinterest(){
        return 20;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        A aobj = new A();
        aobj.a = 100;
        aobj.b = 200;
        aobj.display();

        B bobj = new B();
        bobj.c =10;
        bobj.d= 20;
        bobj.show();

        bobj.a = 150;
        bobj.b =250;
        bobj.display();

        C cobj = new C();
        cobj.a = 5;
        cobj.b = 10;
        cobj.c = 15;
        cobj.d= 20;
        cobj.x = 25;
        cobj.y= 30;

        cobj.display();
        cobj.show();
        cobj.addition();

        //hierarchy inheritance @Override

        SBI sbiobj = new SBI();
        System.out.println(sbiobj.getRateOfinterest());

        ICICI iciciobj= new ICICI();
        System.out.println(iciciobj.getRateOfinterest());

        Axis axisobj = new Axis();
        System.out.println(axisobj.getRateOfinterest());


    }
}

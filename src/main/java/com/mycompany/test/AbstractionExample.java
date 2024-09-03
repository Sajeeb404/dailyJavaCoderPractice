package com.mycompany.test;


interface Calculator  {

    int age= 50;
    void sub();
    default void sum(){

    }

}

class Addition implements Calculator{

    @Override
    public void sub() {

    }




}

public class AbstractionExample {

    public static void main(String[] args) {


            int ages = Calculator.age;
    }

}


class DC extends ab{

}

abstract class Bank {
    public Bank() {
    }
   abstract int getRateOfInterest();
   int b;
   String s;
   void add(){};

    public Bank(int b, String s) {
        this.b = b;
        this.s = s;
    }



}

class SIBL extends Bank{



    @Override
    int getRateOfInterest() {
        return 10;
    }
}

class UCB extends Bank{
    @Override
    int getRateOfInterest() {
        return 20;
    }
}


interface A{
    void a();
    void b();
    void c();
    void d();


}

class Tests implements A{


    @Override
    public void a() {
        System.out.println("Called a");
    }

    @Override
    public void b() {
        System.out.println("Called b");
    }

    @Override
    public void c() {
        System.out.println("Called c");
    }

    @Override
    public void d() {
        System.out.println("Called d");
    }
}

abstract class ab implements bd{

    int m(){return 0;};

    public ab() {
    }
    int b = 50;

    public ab(int b) {
        this.b = b;
    }
}


interface bd{
    int b=21;
    String c ="D";

}




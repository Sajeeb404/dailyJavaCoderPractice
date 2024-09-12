package com.mycompany.test;

public class InterfacExample {
}

interface Ami{
    int b = 20;

}

class Rakib implements Ami{

    public static void main(String[] args) {
        Rakib rakib = new Rakib();

        Ami ami = rakib;
    }
}


interface Animals {


    int id=0;
    String name="Sajeeb";

    default void m(){
        System.out.println("hello im default method");
    }

    static void names(){
        System.out.println("I'm static method");
    }



}

class Cats implements Animals{

     void ms(){
        Animals.super.m();
    }


    public static void main(String[] args) {

        Cats cats = new Cats();
cats.m();
        Animals.names();


    }


    interface Big{

    }






}






package com.mycompany.test;

import java.io.IOException;
import java.sql.SQLClientInfoException;

public class FinalizeExample {





     void  m() {
         throw new ArithmeticException();

     }

}


class B extends FinalizeExample{

    @Override
    void m() {
        System.out.println("dsfds");
    }

    public static void main(String[] args) {
        B b = new B();
        b.m();
    }



}



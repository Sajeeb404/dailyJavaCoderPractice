package com.mycompany.test;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.text.NumberFormat;
import java.util.ArrayList;

public class JavaOopsExample {


    /* class== in java class is a factory, blueprint and template of object.
    class contains
    data-field
    method
    constractor
    block
    nested class and interfaces


    objects== in java object is a
    real world entity
    run time entity
    instance of class
    an it's a entity which has state and behavior
    state known as a data member and behavior known as a method.



     */
    public JavaOopsExample() {
        System.out.println("This is constractor");
    }

    {
        System.out.println("this block");
    }



    public static void main(String[] args) {

        JavaOopsExample j = new JavaOopsExample();



    }







    ArrayList<String> dl (){
        ArrayList s = new ArrayList();


        return s;
    }
}


abstract class Bd{

    void m(){
        int b;
        b=2;
    }
    abstract void d();


}

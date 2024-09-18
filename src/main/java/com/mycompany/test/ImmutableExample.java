package com.mycompany.test;

public class ImmutableExample {

//    There are many immutable classes like String,
//    Boolean, Byte, Short, Integer, Long, Float,
//    Double etc. In short, all the wrapper classes
//    and String class is immutable. We can also create
//    immutable class
//    by creating final class that have final data
//    members as the example given below:


    /*he instance variable of the class is final i.e. we cannot change the
     value of it after creating an object.
    The class is final so we cannot create the subclass.
    There is no setter methods i.e. we have no option to change
    the value of the instance variable.
    These points makes this class as immutable.*/

    public static void main(String[] args) {


        ImmutableExa ie = new ImmutableExa("20");

        System.out.println(ie.toString());


    }


}

 class ImmutableExa{


    String a;

    public ImmutableExa(String a) {
        this.a = a;
    }

    public String getA() {
        return a;
    }


}

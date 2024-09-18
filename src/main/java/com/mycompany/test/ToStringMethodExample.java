package com.mycompany.test;

public class ToStringMethodExample {



    /*The toString() method is a fundamental
    method in Java that is part of the Object class,
    which is the superclass of all classes in Java.
    The toString() method is designed to provide a
    string representation of an object. The default
    implementation returns a string that consists of
    the class name followed by the "@" character and the object's hash code.

    */

//    Purpose: The main purpose of the toString() method is to give a meaningful
//    string representation of an object, which is especially useful for debugging and logging.

//
//    The toString() method provides a string representation of an object.
//    Overriding toString() allows you to customize how objects of your class are represented as strings.
//    It is automatically called in various contexts, such as printing and string
//    concatenation, making it a powerful tool for improving the clarity of your code.


    int id;
    String name;
    String address;

    @Override
    public String toString() {
        return "toStringMethodExample{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ToStringMethodExample tsm = new ToStringMethodExample();

        tsm.address ="Dhaka";
        tsm.name = "Rakib";
        tsm.id =02;

        System.out.println(tsm);// in here tostring method call interlly




    }
}

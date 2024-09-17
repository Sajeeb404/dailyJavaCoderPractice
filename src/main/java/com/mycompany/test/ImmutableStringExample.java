package com.mycompany.test;

public class ImmutableStringExample {


    public static void main(String[] args) {

        
//        String c = "abcd".substring(2, 3);
//
//        System.out.println(c.toUpperCase());


//        String s = "Sajeeb";
//        s.concat("Aayaan");
//        System.out.println(s);

//        in hare u see string not changes.

//        s = s.concat(" Hosneara");
//        System.out.println(s);
//        now u see u can assign it but not change s reference value
//            so u can say string is immutable

//        StringBuilder st = new StringBuilder("Hello");
//        st.append("java");
//        System.out.println(st);
//        in this example you can see the difference and say yes String is immutable

//        Why String objects are immutable in Java?
//        As Java uses the concept of String literal. Suppose there are 5 reference variables, all refer to one object "Sachin". If one
//        reference variable changes the value of the object, it will be affected by all the reference variables.
//        That is why String objects are immutable in Java.
//        Following are some features of String which makes String objects immutable.
//
//
//        1. ClassLoader:
//        A ClassLoader in Java uses a String object as an argument. Consider,
//        if the String object is modifiable, the value might be changed and
//        the class that is supposed to be loaded might be different.

//        2. Thread Safe:
///        As the String object is immutable we don't have to take care of the
//        synchronization that is required while sharing an object across multiple threads.

//        3. Security:
//        As we have seen in class loading, immutable String objects avoid further
//                errors by loading the correct class. This leads to making the application program more secure.
//                Consider an example of banking software. The username and password cannot be modified by any
//        intruder because String objects are immutable. This can make the application program more secure.
//
//        4. Heap Space:
//        The immutability of String helps to minimize the usage in the heap memory. When we try to declare a
//    new String object, the JVM checks whether the value already exists in the String pool or not. If it exists,
//                the same value is assigned to the new object. This feature allows Java to use the heap space efficiently.







    }

}

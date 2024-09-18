package com.mycompany.test;

import java.util.Arrays;

public class SubstringExample {

    public static void main(String[] args) {

//        A part of String is called substring.
//        In other words, substring is a subset of another String.
//        Java String class provides the built-in substring() method that extract a substring
//        from the given string by using the index values passed as an argument



//        You can get substring from the given String object by one of the two methods:
//        public String substring(int startIndex):
//         When u give hit startIndex
//            it's result show from start to end index
//        this method also throw arrayoutofboundException
////                when starting index is larger then lenght and less then zero
//
//        String st = "Hello Java";
//
//
//        System.out.println(st.substring(1));
//
//        String s= "hello";
//        System.out.println(s.substring(0,2));


//        String s ="Sachin Tendulkar";
//        System.out.println("Orginal String "+ s);
//        System.out.println("Substring starting from index 6: "+ s.substring(6));
//        System.out.println("Substing starting from index 0 to 6: "+s.substring(0,6));

//        Using String.split() method:
//        The split() method of String class can be used to extract a substring from a sentence.
//        It accepts arguments in the form of a regular expression.

        String text= new String("Hello, My name is Sachin......");
        /* Splits the sentence by the delimeter passed as an argument */
        String[] sentences = text.split("\\.");


        for (String st: sentences){
            System.out.println(st);
        }




    }
}

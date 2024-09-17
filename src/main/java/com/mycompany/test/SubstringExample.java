package com.mycompany.test;

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
//                when starting index is larger then lenght and less then zero

        String st = "Hello Java";


        System.out.println(st.substring(1));



    }
}

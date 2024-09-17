package com.mycompany.test;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ConcatenationExample {


    public static void main(String[] args) {

//
//        In Java, String concatenation forms a new String that
//        is the combination of multiple strings. There are two ways to concatenate strings in Java:
//
//        By + (String concatenation) operator
//        By concat() method


//        String s1 = "Sajeeb ";
//        String s2 = "is java ";
//        String s3 = "Developer";
////it is by + operator concatenation
//        System.out.println(s1+s2+s3);
//
//        String st = "Sajeeb"+"Rakb";
//        The Java compiler transforms above code to this:
//        String st=(new StringBuilder()).append("Sajeeb").append("Rakb).toString();

//        System.out.println(s1.concat(s2).concat(s3));
//        this is by concat method concatenation

//        so it defened on you how u concat your string


//        2) String Concatenation by concat() method
//        The String concat() method concatenates the specified string to the end of current string. Syntax:
//
//        public String concat(String another)


//        String s1 = "Sachin";
//        String s2 = " Tendulkar";
//        String s3 = s1.concat(s2);
//        System.out.println(s3);
//        the abobe java programs concatenates two String object s1 and s2
//                using concat method
//                there are some other possible ways to concatenate String in java

//        StringBuilder

//        StringBuilder stb = new StringBuilder("hell");
//        String str = new String("hell");
//        String st = "hell";
//        System.out.println(st.equals(stb));

//        StringBuilder stb = new StringBuilder("hell");
//        StringBuilder st2 = new StringBuilder(" java");
//        StringBuilder stb4 = stb.append(st2);
//        System.out.println(stb4);
//
//        We can string concation using format method also

//        String s1 = new String("Hello");
//        String s2 = new String(" java your number is ");
//        int n = 50;
//
//        System.out.println(String.format("%s%s%10d", s1,s2,n));


//        we also cancatenation using String.join Method java 8;
//        The String.join() method is available in Java version
//        8 and all the above versions. String.join() method
//        accepts arguments first a separator and an array of String objects.
//
//        String s1 = "Hello";
//        String s2 ="java";
//        String s3 ="student";
//        String s4 ="";
//
//        String k = String.join(", ",s1,s2,s3);
//        System.out.println(k);



//        also String concatenation using StringJoiner class in java 8 versiton

//        StringJoiner class has all the functionalities of String.join() method.
//            In advance its constructor can also accept
//            optional arguments, prefix and suffix


//        StringJoiner stj1 = new StringJoiner(",");
//        stj1.add("hello");
//        stj1.add("java");
//        System.out.println(stj1);
//        StringJoiner stringJoiner = new StringJoiner(", ","[","]");
//        stringJoiner.add("Apple");
//        stringJoiner.add("Banana");
//        stringJoiner.add("Orange");
//        System.out.println(stringJoiner);
//        i hope you now understande what is is prefix and suffix


//        5. String concatenation using Collectors.joining() method
//            The Collectors class in java 8 offers joining() method that concatenates the input
//                elements in similar order as they occur.

//        Example

        List<String> list = Arrays.asList("abc", "def", "ghi");

        String str = list.stream().collect(Collectors.joining(", "));
        System.out.println(str);









    }
}

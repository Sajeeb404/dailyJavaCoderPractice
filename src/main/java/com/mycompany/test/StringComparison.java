package com.mycompany.test;

import org.w3c.dom.ls.LSOutput;

public class StringComparison {


//    We can compare String in Java on the basis
//    of content and reference.

//    There are three ways to compare String in Java:
//
//    By Using equals() Method
//    By Using == Operator
//    By compareTo() Method

//It is used in authentication (by equals() method),
//    sorting (by compareTo() method), reference matching (by == operator) etc.


//    1) By Using equals() Method
//        in here check the value.
//        equals method check the value if is equal it return true other wise false
//


    public static void main(String[] args) {


//    String s1 = "Sajeeb";
//    String s2 = "Sajeeb";
//    String s3 = new String("Sajeeb");
//
//        System.out.println(s3.equals(s1));// so it's check the value.
//
////        2) By Using == operator
////        The == operator compares references not values.
//
//        System.out.println(s3 == s1); // in here it's check the references not value
//        System.out.println(s2 == s1);

//        3) By Using compareTo() method

//    The String class compareTo() method compares values lexicographically and
//    returns an integer value that describes if first string is less than, equal
//    to or greater than second string.
/*        The method starts by comparing the first character of both strings.

                If the Unicode value of the character from the first string is greater than the second, it returns a positive number.
        If it is less, it returns a negative number.
        If Characters are the Same:
        If the characters are the same, it moves to the next character in both strings and compares them.*/


//    Suppose s1 and s2 are two String objects. If:
//    s1 == s2 : The method returns 0.
//    s1 > s2 : The method returns a positive value.
//    s1 < s2 : The method returns a negative value.
//
//    String s1 = "A";
//    String s2 = "A";
////    System.out.println(s1.compareTo(s2));
////    in here this 2 object are equal so return 0;

   /*     String s1 ="A";
        char c = 'a';
        System.out.println((int) c);
        String s2 = "b";
        char ch= 'b';
        System.out.println((int)ch);
        System.out.println(s1.compareTo(s2));*/

//        String s4 ="Sajeeb";  // 83+97+106+101+101+98=
//        String s5 = "Sajeeb"; //83+97+106=101+101+98=
//
//        int sum1 = 83+97+106+101+101+98;
//        int sum2 = 82+97+107+105+98;
//
//        String s6 = "Rakib"; //82+97+107+105+98
//
//        System.out.println(sum1);
//        System.out.println(sum2);
//        System.out.println( s4.compareTo(s6));
//
//

//        String s1 = "b";
//        String s2 = "aadfsdff";

//        System.out.println(s1.compareTo(s2));

//        how compareto method work...
        /*First Character Comparison:



}

}
         */





    }




}




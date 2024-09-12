package com.mycompany.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class ExceptionHandilingExample {

    public static void main(String[] args) throws FileNotFoundException {

//Checked Exception
//        PrintWriter pw;
//        try {
//            pw = new PrintWriter("jtp.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


//        Unchecked Exception


//        try
//        {
//        int[] are = {2,3,4,5,6};
//            System.out.println(are[5]);
//        }
//        catch (ArrayIndexOutOfBoundsException a)
//        {
//            System.out.println("ArrayIndexOutOfBoundsException caught" + a);
//        }

//        Number format exception

//        String s = "Hello";
//        int n = 60;
//        try {
//            n = Integer.parseInt(s);
//        } catch (NumberFormatException e) {
//            System.out.println("---------------------------" + e);
//
//        }
//
//        System.out.println(n);


//        NullPointerException

//        String s = null;
//
//        try {
//
//        System.out.println(s.length());
//        }catch (NullPointerException n){
//            System.out.println("nullllll " + n);
//        }
//



//    try {
//    int b = 5/0;
//        System.out.println(b);
//    }catch (ArithmeticException e){
//        System.out.println(e);
//    }



//        try {
//
//
//
//
//                int arr[] = {2,6,3,5};
//                arr[0] =10;
//
//        }catch (Exception e){
//            System.out.println("this is parent Exception");
//        }


//        try {
//
//
//            try {
//                try {
//                    int d[]={2, 2,5};
//                    d[3]=6;
//                }catch (Exception e3){
//                    System.out.println("Excetion Three" + e3);
//                }
//
//            }catch (Exception e2){
//                System.out.println("Exception Two" + e2);
//            }
//
//        }catch (Exception e1){
//            System.out.println("block for exception One"+ e1);
//        }


//        try {
//            int a = 20/0;
//            System.out.println(a);
//
//        }catch (ArithmeticException e){
//            System.out.println("hhhh");
//            System.out.println(e);
//        }finally {
//            System.out.println("finally block excuted");
//        }
//
//        System.out.println("rest code");
//
//

//try {
//m(11);
//    System.out.println("other code");
//
//}catch (Exception e){
//    System.out.println(e);
//}


//    method();
//
//
//        System.out.println("rest of the code...");


//        try {
//
//            throw new UserDefinedException("This is user Defined exception");
//
//        }catch (UserDefinedException e){
//            System.out.println("Caught exception");
//            System.out.println(e.getMessage());
//        }




//        ExceptionPropagation ex = new ExceptionPropagation();
//        try {
//        ex.z();
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }




    }

    static class ExceptionPropagation{

        void m(){
            int b =5/0;
        }

        void n(){
           m();
        }

        void z(){
            n();
        }


    }

//    public static void m(int age){
//        if (age<18){
//            throw new ArithmeticException("Person is not eligible for age");
//        }else {
//            System.out.println("Age is eligible");
//        }
//    }






    public static void method() throws FileNotFoundException {

        FileReader fileReader = new FileReader("C:\\Users\\Admin\\Desktop\\New folder\\abc.txt");
        BufferedReader fileinput = new BufferedReader(fileReader);


    }



}


class UserDefinedException extends Exception{

    public UserDefinedException(String message) {
        super(message);
    }

}

class FinallyExample {




}

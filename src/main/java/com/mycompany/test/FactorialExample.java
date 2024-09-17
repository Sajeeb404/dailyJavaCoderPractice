package com.mycompany.test;

public class FactorialExample {

    static int isFactorial(int n){

        if (n == 0 || n == 1)return 1;
        if (n<0) throw new IllegalArgumentException("Nagetive number is not allowed.");
        return n * isFactorial(n-1);
    }

    static int isFactorials(int n){

        if (n ==0 || n==1)return 1;
        if (n<0) throw new IllegalArgumentException("Nagetive number is not allowed.");

        int result = 1;

        for (int i = 1; i<=n;i++){

            result *=i;
        }
        return result;
    }



    public static void main(String[] args) {


        System.out.println(isFactorial(5));
        System.out.println(isFactorials(5));

    }



}

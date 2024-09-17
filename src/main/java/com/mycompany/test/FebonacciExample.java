package com.mycompany.test;

public class FebonacciExample {

//    recussion method
    static long isFebonacci(int n){

        if (n<0) throw new IllegalArgumentException("Negative number is not allowed");
        if (n==0) return 0;
        if (n==1) return 1;

        return isFebonacci(n-1)+isFebonacci(n-2);
    }

//    iterable approch

    static long isFebonaccis(int n){

        if (n<0) throw new IllegalArgumentException("Negative number is not allowed");
        if (n == 0) return 0;
        if (n==1) return 1;
        long a =0;
        long b= 1;

        for (int i =2; i<=n; i++){
            long next = a+b;
            a=b;
            b= next;
        }

        return b;
    }

    public static void main(String[] args) {


        System.out.println(isFebonacci(5));
        System.out.println(isFebonaccis(6));

    }
}

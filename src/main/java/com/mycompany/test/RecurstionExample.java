package com.mycompany.test;

public class RecurstionExample {


//    Recursion in java is a process in which a method calls itself continuously.
//    A method in java that calls itself is called recursive method.


    static int count = 0;

    static void recurM(){
        count++;

        if (count<=5){
            System.out.println("hello i'm recurtion method");
            recurM();
        }




    }

    static int isFactorial(int n){

        if (n ==0 || n ==1){
            return 1;
        }

        return n * isFactorial(n-1);
        // just flow the exprestion
        // 1st your number is 5, so 5 multiply then again call method
        // with before 5 now n is 4 so 5 multiple 4 then call method
        // now call with 3 so 5*4*3 then call method with 2 so now 5*4*3*2 now method call
        // with 1 this return 1 son now final result is 5*4*3*2*1=120
        // i hope this is clear for you
    }


    static int isitFac(int n){
        if (n == 1 || n==0){
            return 1;
        }
        int result = 1;

        for (int i = 1; i<=n; i++){

            result *=i;
        }

        return result;
    }



//    static long inFabonacci(int n){
//
//
//            if (n<0){
//                throw new IllegalArgumentException("Nagetive number are not allowed");
//            }
//
//
//        if (n == 0)return 0;
//        if (n == 1) return 1;
//
//        long a = 0;
//        long b = 1;
//
//        for (int i = 2; i<=n; i++){
//            long next = a+b;
//            a =b;
//            b = next;
//
//
//  }
//
//
//        return b;
//    }





//    static long isFabonacci(int n){
//
//        if (n<0) throw new IllegalArgumentException("Negative value are not allowed");
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//
//        long a =0;
//        long b =1;
//
//        for (int i = 2; i<=n; i++){
//            long next = a+b;
//
//            a =b;
//            b = next;
//        }
//
//
//
//       return b;
//    }


    static long isFabonacci(int n){

        if (n<0) throw new IllegalArgumentException("Nagetive number not allowed");
        if (n==0) return 0;
        if (n==1) return 1;

        return isFabonacci(n-1)+isFabonacci(n-2);
    }


    public static void main(String[] args) {


        System.out.println(isFabonacci(0));
        System.out.println(isFabonacci(1));
        System.out.println(isFabonacci(2));
        System.out.println(isFabonacci(3));
        System.out.println(isFabonacci(4));
        System.out.println(isFabonacci(5));
        System.out.println(isFabonacci(6));


//        1 2 3 4 5 6 7 8 9


//        System.out.println(isFactorial(5));
//        System.out.println(isitFac(5));


//        try {
//            System.out.println(inFabonacci(-7));
//        } catch (Exception e) {
//            System.err.println("Error for input:- "+ e.getMessage());
//        }


    }





}




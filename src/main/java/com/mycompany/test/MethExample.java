package com.mycompany.test;

import static java.lang.Float.NaN;

public class MethExample {


    public static void main(String[] args) {

        /*
        Math.abs return positive number.
        but when u use data type minimum value it's return same negative value
        examl this int negative value so it return same negative value.
       System.out.println(Math.abs(-2147483648));
       It's a vehabior of Math.abs.
       all data type same


       If we provide positive or negative value as argument, this method will result positive value.
If the argument is Infinity, this method will result Positive Infinity.
If the argument is NaN, this method will return NaN.
If the argument is equal to the value of Integer.MIN_VALUE or Long.MIN_VALUE, the most
negative representable int value or
long value, the result is that same value, which is negative.
         */


//        int
//       int a = 20;
//       int b = -20;
//        System.out.println(Math.abs(a));
//        System.out.println(Math.abs(b));
//
//        System.out.println(Math.abs(-7.0/0));
//        System.out.println(Math.abs(-7.0/0));
//        System.out.println(Math.abs(Double.NaN));

//        float
//        float x = -2.33f;
//        float y = -3.65f;
//
//        System.out.println(Math.abs(x));
//        System.out.println(Math.abs(y));

//      long
//        long e = -922635416454563807l;
//        long f = -5554455426456456454L;
//        System.out.println(Long.MAX_VALUE);
//
//        System.out.println(Math.abs(e));
//        System.out.println(Math.abs(f));

//        double

//        double d = -2.30;
//        double z = -6564.254;
//
//        System.out.println(Math.abs(d));
//        System.out.println(Math.abs(z));



//        Math.max()

//        This method returns maximum of two numbers.
//                If we provide positive and negative value as argument, this method will return positive argument.
//                If we provide both negative values as argument, number with the lower magnitude is returned as result.
//        If the arguments are not a number(NaN), this method will return NaN.

//        int a = 20;
//        int b = 30;
//        System.out.println(Math.max(a, b));
//
//        double x = -20.36354;
//        double y = -112.645;
//        System.out.println(Math.max(x, y));


//        Math.min also same as like max.
//            it's return min number of 2 value
//        This method returns minimum of two numbers.
//                If we provide positive and negative value as argument, this method will return negative argument.
//                If we provide both negative values as argument, number with the higher magnitude is returned as result.
//        If the arguments are not a number(NaN), this method will return NaN.


//        double x = 2.30;
//        double y = 3.565;
//        System.out.println(Math.min(x,y));

//        double a = -351.64;
//        double b = -31.64;
//        System.out.println(Math.min(a, b));


//        Math.round()	It is used to round of the decimal numbers to the nearest value.

//        x= It is a floating-point value to be rounded to an integer
//        This method returns the value of the argument rounded to the nearest int value.



//        If the argument is positive or negative number, this method will return the nearest value.


//        System.out.println(Math.round(2.49)); in hare return 2
//        System.out.println(Math.round(2.50)); in hare return 3

//        If the argument is not a number (NaN), this method will return Zero.
//        System.out.println(Math.round(NaN));


//        System.out.println(Math.round(-6.51)); in hare retun 7
//but in hare return 6
//        System.out.println(Math.round(-6.50));
//
//        System.out.println(Math.round(Double.POSITIVE_INFINITY));
//        System.out.println(Math.round(Double.NEGATIVE_INFINITY));

//        double x = 1.0/0;
//        // Input positive Infinity, Output Integer.MAX_VALUE
//        System.out.println(Math.round(x));



//        Math.sqrt()	It is used to return the square root  a number.
//        If the argument is positive double value, this method will return the square root of a given value.
//        If the argument is NaN or less than zero, this method will return NaN.
//                If the argument is positive infinity, this method will return positive Infinity.
//                If the argument is positive or negative Zero, this method will return the result as Zero with same sign.


//        System.out.println(Math.sqrt(-9));
//        System.out.println(Math.sqrt(9));

//        System.out.println(Math.sqrt(1.0/0));


//Math.cbrt()
//        If the argument is positive or negative double value, this method will return the cube root of a given value.
//        If the argument is NaN, this method will return NaN.
//                If the argument is infinity, this method will return Infinity with same sign as the argument.
//        If the argument is positive or negative Zero, this method will return Zero with same sign as the argument.

//
//        System.out.println(Math.cbrt(729.00));
//        System.out.println(Math.cbrt(-729.0000));
//        System.out.println(Math.cbrt(NaN));
//        System.out.println(Math.cbrt(1.0/0));
//        System.out.println(Math.cbrt(0.0));
//        System.out.println(Math.cbrt(-0.0));

//
//        System.out.println(Math.cbrt(8.00));
//        System.out.println(Math.cbrt(-8.00));







//        Math.pow()
//        It returns the value of first argument raised to the power to second argument.
//        The java.lang.Math.pow() is used to return the value of first argument
//        raised to the power of the second argument. The return type of pow() method is double.
//        If the second argument is positive or negative Zero, this method will return 1.0.
//        If the second argument is not a number (NaN), this method will return NaN.
//                If the second argument is 1, this method will return the result same as the first argument.

//        System.out.println(Math.pow(2.00,2.00));
//
//        System.out.println(Math.pow(2.00,-0.00));
//        System.out.println(Math.pow(2.00,NaN));
//        System.out.println(Math.pow(50.00,1.00));
//
//
//        double x = 27.2;
//        double y = 1.0;
//        // Second argument is 1 so output is 27.2
//        System.out.println(Math.pow(x, y));

//        System.out.println(Math.pow(5.00,5.00));





//        The java.lang.Math.signum () is used to find the sign of a given value.
//        If the argument is positive or negative Zero, this method will return Zero.
//                If the argument is positive value, this method will return Positive 1.
//        If the argument is Negative value, this method will return Negative 1.
//        If the argument is NaN, this method will return NaN.
//    if x=-2;
//        f=-x/x
//                f = -2/2
//                        ans = -1

//        System.out.println(Math.signum(-5.0));
//        System.out.println(Math.signum(5.6));
//        System.out.println(Math.signum(0.00));
//        System.out.println(Math.signum(-0.00));



//        Math.ceil()	It is used to find the smallest integer value that is
//        greater than or equal to the argument or mathematical integer.
//        If the argument is positive or negative double value, this method will return the ceil value.
//        If the argument is NaN, this method will return same argument.
//                If the argument is Infinity, this method will return Infinity with the same sign as the argument.
//                If the argument is positive or negative Zero, this method will return Zero with same sign as the argument.
//        If the argument is less than Zero but greater than -1.0, this method will return Negative Zero as

//        System.out.println(Math.ceil(2.50));
//        System.out.println(Math.ceil(-2.91));
//        System.out.println(Math.ceil(NaN));
//        System.out.println(Math.ceil(NaN));
//        double x = -0.25;
//        // Input less than zero but greater than -1.0, Output negative zero
//        System.out.println(Math.ceil(x));

//        System.out.println(Math.ceil(3.10));


//        System.out.println(Math.ceil(1.40));






//        Math.copySign()	It is used to find the
//        Absolute value of first argument along with sign specified in second argument.

//        When both parameters of the Math.copySign method are negative, the behavior remains consistent with
//        its purpose: to return the first argument with the sign of the second argument.
//        System.out.println(Math.copySign(-50.00, -40.00));


        //        When both parameters of the Math.copySign method are positive, the behavior remains consistent with
//        its purpose: to return the first argument with the sign of the second argument.
//        System.out.println(Math.copySign(50.00,30.00));

//        System.out.println(Math.copySign(-788.63f,26.9f));


//        float x = 788.63f;
//        float y = -26.9f;
//        // return -26.9 because second argument x is negative
//        System.out.println(Math.copySign(x, y));

//
//        i just clear now: copySing alway print first peramiter but defened on second peramiter, what's it print negative or postive.
//                second peramiter positive or first peramiter negative it will print first peramiter postive.
//                second peramiter negative or fist peramiter postive it will print first peramiter negative.
//
//        System.out.println(" its print 300.0 ===="+Math.copySign(-300.00,20.00));
//        System.out.println(" its print -400.0 ===="+Math.copySign(400.00,-30.00));


//        Math.nextAfter()	It is used to return
//        the floating-point number adjacent to the first argument in the direction of the second argument.
//        If either argument is a NaN, this method will return NaN.
//                If both arguments are signed zero, the direction will be unchanged.

//        System.out.println(Math.nextAfter(0,0));


//        System.out.println(Math.nextAfter(0,0));

        double a = 10;
        double b = 20;

        System.out.println(Math.nextAfter(a, b));

        float x = 200.00f;
        double y = -300.00;

        System.out.println(Math.nextAfter(x,y));













    }

}

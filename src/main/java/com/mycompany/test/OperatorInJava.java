package com.mycompany.test;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class OperatorInJava {

    /**
     *
     * 01. Unary Operator (postfix++, --prefix)
     * 02. Arithmetic Operator (+,-,*,/,%)
     * 03. Relational Operator (==, !=, <, >, <=, >=, instanceof )
     * 04. Shift Operator (<< (left shift), >>(right shift), >>> (unsignedRightShift))
     * 05. Logical Operator (&& (logical AND, || (logical OR))
     * 06. Bitwise Operator (& (bitwise AND), ^ (bitwise exclusive OR), | (bitwise inclusive OR) )
     * 07. Ternary Operator (?, :)
     * 08. Assignment Operator (=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>= )
     * */


    public static void main(String[] args) {

//        int a = 50; //
//        int b = 200; //
//        int c = 100;
//
////        int min = (a<b)?a:b;
////        System.out.println(min);
//        System.out.println(a>b&&a++<c);//false && true = false
//        System.out.println(a);//10 because second condition is not checked
//        System.out.println(a>b&a++<c);//false && true = false
//        System.out.println(a);//11 because second condition is checked



//        int num = 0;

//        for (int i = 0; i<=5; i++){
//
//            num +=1;
////            System.out.println(num);
//
//
//            switch (num){
//                case 1:
//                    System.out.println("This is 1 block");
//
//                case 2:
//                    System.out.println("This is 2 block");
//
//                case 3:
//                    System.out.println("This is 3 block");
//
//                case 4:
//                    System.out.println("This is 4 block");
//
//                case 5:
//                    System.out.println("This is 5 block");
//
//                case 6:
//                    System.out.println("This is 6 block");
//                    break;
//
//                default:
//
//                    System.out.println("This is default block " + num);
//
//            }
//
//
//
//        }

//        Scanner impurt = new Scanner(System.in);
//
//        System.out.println("Enter your month number.");
//
//        String monthName ="";
//        int monthNumber = impurt.nextInt();
//        System.out.println(monthName);
//        System.out.println("please enter how much day in the month");
//        int day = impurt.nextInt();
//
//        switch (monthNumber){
//            case 1:
//                monthName = "January";
//                break;
//            case 2:
//
//                switch (day){
//                    case 28:
//                        System.out.println(monthName = "This February is " + 28 +" days");
//
//                        break;
//                    default:
//                        System.out.println("false");
//                }
//
//
//                break;
//            case 3:
//                monthName = "March";
//                break;
//            case 4:
//                monthName = "April";
//                break;
//            case 5:
//                monthName = "May";
//                break;
//            case 6:
//                monthName = "June";
//                break;
//            case 7:
//                monthName = "July";
//                break;
//            case 8:
//                monthName = "August";
//                break;
//            case 9:
//                monthName = "September";
//                break;
//            case 10:
//                monthName = "October";
//                break;
//            case 11:
//                monthName = "Nobember";
//                break;
//            case 12:
//                monthName = "December";
//                break;
//            default:
//                monthName = "Pleas enter correct month number";
//        }


//        Scanner imp = new Scanner(System.in);
//
//        String name = imp.nextLine();
//
//        Day[] days = Day.values();
//
//        for (Day daynow: days){
//
//            switch (daynow){
//                case sun:
//                    System.out.println("This is Sunday");
//                    break;
//                case mon:
//                    System.out.println("This is Monday");
//                    break;
//                case tue:
//                    System.out.println("This is Tuesday");
//                    break;
//                case wed:
//                    System.out.println("This is Wednesday");
//                    break;
//                case thu:
//                    System.out.println("this is Thusday");
//                    break;
//                case fri:
//                    System.out.println("This is friday");
//                    break;
//                case sat:
//                    System.out.println("This is Saturday");
//                    break;
//                default:
//                    System.out.println("please enter correct within 'sat, sun, mon, tue, wed, thu, fri' ");
//            }
//
//
//        }
//
//    }
//
//
//
//    enum Day{sat, sun, mon, tue, wed, thu, fri;


//        Scanner im = new Scanner(System.in);
//
//        System.out.println("Pleas enter character");
//        String imput = im.nextLine();
//
//        if (imput.length()>0){
//            char ch = imput.charAt(0);
//            if (imput.length()>1){
//                System.out.println("Warning: More then one character your entered");
//            }else {
//                switch (ch){
//                    case 'a':
//                        System.out.println(ch+ " is vowel.");
//                        break;
//                    case 'e':
//                        System.out.println(ch+ " is vowel.");
//                        break;
//                    case 'i':
//                        System.out.println(ch+ " is vowel.");
//                        break;
//                    case 'o':
//                        System.out.println(ch+ " is vowel.");
//                        break;
//                    case 'u':
//                        System.out.println(ch+ " is vowel.");
//                        break;
//                    case 'A':
//                        System.out.println(ch+ " is vowel.");
//                        break;
//                    case 'E':
//                        System.out.println(ch+ " is vowel.");
//                        break;
//                    case 'I':
//                        System.out.println(ch+ " is vowel.");
//                        break;
//                    case 'O':
//                        System.out.println(ch+ " is vowel.");
//                        break;
//                    case 'U':
//                        System.out.println(ch+ " is vowel.");
//                        break;
//                    default:
//                        System.out.println(ch+ " consonant");
//
//                }
//
//            }
//
//
//
//        }else {
//            System.out.println("No character was entered");
//        }




//        for (int i=1;i<=10;i++){
//            if (i==5){
//                System.out.println("hello i'm five");
//                continue;
//            }
//
//            System.out.println(i);
//        }


//        for (int i =1; i<=3;i++){
//
//            for (int j = 1; j<=3;j++){
//                System.out.println(i +" "+ j);
//            }
//        }


//        for (int i =1; i<=5; i++){
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for (int i = 5; i>=1; i--) {
//            for (int j = i; j >= 1; j--) {
//                System.out.print("* ");
//
//
//            }
//                System.out.println();
//
//
//        }
//

//        int[] arr ={2,52,32,65,25,255,50};
//
//        for (int i:arr){
//            System.out.print(i+ " ");
//
//        }
//
//
//       String[] str = {"Dhaka", "Chittogram", "Borisal", "Cumilla", "Sylhet", "Khulna" };
//
//        for (String st:str){
//            System.out.println(st);
//        }

//        int num = 5;
//        aa:
//        for (int i = 1; i <= num; i++) {
//
//            bb:
//            for (int j = i; j <= 5; j++) {
//                System.out.print("* ");
//                if (i ==4){
//                    break aa;
//                }
//            }
//
//            System.out.println();
//
//        }


//        Scanner sn = new Scanner(System.in);
//        System.out.println("Please enter your number");
//
//        int impurt = sn.nextInt();
//        while (impurt<10){
//            System.out.println("hello i'm while loop " +
//                    ""+ impurt);
//            impurt++;
//        }

//    int in = 10;
//
//        do {
//            in--;
//            System.out.println("Hello i'm do while loop");
//            continue;
//
//        }while (in>5);
//
//
//







//       this is single line comment

        /* \u000d this is multiple line comment */

        /**  \u000d this si ducomentaion comment */

/*       \u000d System.out.println("helllo this comment");
 */



 /* \u000d System.out.printlin("Hello i'm multi comment")*/

    }

}

package com.mycompany.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;

public class JavaConverSionExample {



}


class LongTointAndInteger{


    public static void main(String[] args) {

        /*We can convert long to int in java using typecasting. To convert higher data type into lower, we need to perform typecasting.*/


        long l = 50l;

        int i = (int) l;// this is called type cast.

        Long ll = 50L;
        int lb = ll.intValue();
        System.out.println(lb);



    }
}



class IntTolongAndLong{

    public static void main(String[] args) {

    /*      Java Convert int to long
            We can convert int to long in java using assignment operator.
            There is nothing to do extra because lower type can be converted to higher type implicitly.

            */


        int b = 20;
        long l = b;

        System.out.println(l);

        /*We can convert int value to Long object by instantiating Long class or calling Long.valueOf() method.*/

        int i = 50;
        Long ll = Long.valueOf(i);
        System.out.println(ll);





        }
}


class ObjectToString{

    public static void main(String[] args) {


        /*We can convert Object to String in java using toString() method of Object class or String.valueOf(object) method.
        *
        * You can convert any object to String in java whether it is user-defined class,
        * StringBuilder, StringBuffer or anything else.
        Here, we are going to see two examples of converting Object into String. In the first example,
        * we are going to convert Emp class object into String which is an user-defined class. In second
        * example, we are going to convert StringBuilder to String.


*/
//
//
//        ObjectToString objectToString = new ObjectToString();
//
//        String s1 = objectToString.toString();
//
//        String s2 = String.valueOf(objectToString);
//
//        System.out.println(s1);
//        System.out.println(s2);


//        StringBuffer stringBuffer = new StringBuffer();
//
//        stringBuffer.append("Sajeeb");
//
//        stringBuffer.reverse();
//
//        System.out.println(stringBuffer);
//
//        String sd = stringBuffer.toString();
//        String sdd = String.valueOf(stringBuffer);
//        System.out.println(sd);
//        System.out.println(sdd);



        StringBuilder stringBuilder = new StringBuilder();


        stringBuilder.append("Sajeeb");

        String st = stringBuilder.toString();
        String stt = String.valueOf(stringBuilder);
        String ss = String.valueOf(stringBuilder);
        System.out.println(st);
        System.out.println(stt);
        System.out.println(ss);



    }
}





class StringToObject{



    public static void main(String[] args) throws Exception {



        /*We can convert String to Object in java with assignment operator.
         Each class is internally a child class of Object class. So you can assign string to Object directly.*/


//        String s = "Sajeeb";
//
//        Object ob = s;


        String s = "Sajeeb";

        Class c = Class.forName("java.lang.String");
        Class cc = Class.forName("com.mycompany.test.StringToObject");

        System.out.println(c.getName());
        System.out.println(cc.getName());
        System.out.println(cc.getSuperclass().getName());


    }
}

class charToString{


    public static void main(String[] args) {
        /*We can convert char to String in java using String.valueOf(char) method of
         String class and Character.toString(char) method of Character class.




         */


        char c = 'C';

        String s = String.valueOf(c);
        String d = Character.toString(c);

        System.out.println("This is chart to string "+ s);
        System.out.println("This is chart to string "+ d);



    }
}




class StringTochar{

    public static void main(String[] args) {

//        We can convert String to char in java using charAt() method of String class.

//        String string = "Hello java, i'm Sajeeb. Can you hear me";
//
////            char c = string.charAt(1);
////        System.out.println(c);
//
//        char[] chars = string.toCharArray();
//
//        for (char d:chars){
//            System.out.println(d);
//        }



        String s="hello";
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            System.out.println("char at "+i+" index is: "+c);
        }











        String n = "20";
        int b = Integer.parseInt(n);




    }
}






class DateToString{

    public static void main(String[] args) {


        /*The format() method of DateFormat class is used to convert Date into String.
        DateFormat is an abstract class. The child class of DateFormat is SimpleDateFormat.

        * */

//
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(2024, 0,20);
//        Date date3 = calendar.getTime();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        String d = dateFormat.format(date3);
//        System.out.println(d);
//
//        Date date = Calendar.getInstance().getTime();
//        System.out.println(date3);
//        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MM dd, yyyy");
//        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("dd-MMMM-yyyy");
//
//        String sDate1 = simpleDateFormat1.format(date);
//        String sDate2 = simpleDateFormat2.format(date);
//        String sDate3 = simpleDateFormat3.format(date);
//
//        System.out.println(sDate1);
//        System.out.println(sDate2);
//        System.out.println(sDate3);


//        Calendar calendar = Calendar.getInstance();
//
//        calendar.set(2021, 07,27);
//
//        Date date = calendar.getTime();
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM, yyyy");
//
//        String aayaanBirthDay = simpleDateFormat.format(date);
//        System.out.println(aayaanBirthDay);
//
////        System.out.println(date);


//        Date date = new Date();
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
//
//        String s = dateFormat.format(date);
//        System.out.println(s);
//        System.out.println(date);


        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);


                /*Here’s a comparison of Date, LocalDate, and Calendar in Java, along with their differences:

        1. Date
        Package: java.util
        Type: Represents a specific instant in time, with millisecond precision.
        Mutable: Yes, the Date object can be modified after creation.
        Time Zone: Contains information about the date and time but does not have timezone capabilities.
        Deprecated Methods: Some methods, like getYear() and getDay(), are deprecated due to their poor design and confusion.
        Example:
        java
        Copy code
        Date date = new Date(); // Current date and time
        2. LocalDate
        Package: java.time
        Type: Represents a date without time (year, month, day) and is part of the modern date-time API introduced in Java 8.
        Immutable: Yes, once created, it cannot be changed. Any modification returns a new instance.
        Time Zone: Does not store time zone information; it's meant for dates without time or time zone context.
        Thread-Safe: Being immutable makes it inherently thread-safe.
        Example:
        java
        Copy code
        LocalDate localDate = LocalDate.now(); // Current date (without time)
        3. Calendar
        Package: java.util
        Type: An abstract class that allows you to manipulate dates and times. It can represent a specific instant but is more flexible than Date.
        Mutable: Yes, Calendar objects can be modified after creation.
        Time Zone: Has built-in support for time zones.
        Legacy API: Considered somewhat outdated, and often replaced by the java.time package. It has a more complicated API compared to LocalDate and LocalDateTime.
        Example:
        java
        Copy code
        Calendar calendar = Calendar.getInstance(); // Current date and time
        Key Differences
        Feature	Date	LocalDate	Calendar
        Type	Instant in time	Date (no time)	Flexible date/time
        Mutability	Mutable	Immutable	Mutable
        Time Zone	Limited (not timezone aware)	No time zone	Time zone aware
        API Type	Legacy	Modern (Java 8+)	Legacy
        Thread Safety	Not thread-safe	Thread-safe	Not thread-safe
        Summary
        Use Date for legacy systems where backward compatibility is needed, but be cautious due to its mutability and deprecated methods.
        Use LocalDate for modern applications where you need to work with dates without time.
        Use Calendar when you need flexibility with time zones and calendar calculations, but it's generally advisable to use LocalDate or other classes from the java.time package for new development.*/


            }
        }



        class StringToDate{

            public static void main(String[] args) throws ParseException {
                /*We can convert String to Date in java using parse()
                 method of DateFormat and SimpleDateFormat classes.







                 */

//
//        String stringDate = "22/09/2024";
//
//        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
//
//        System.out.println(date.getDay());
//        System.out.println(stringDate);


//        String sDate1 = "31/12/2024";
//        String sDate2 = "31-Dec-2024";
//        String sDate3 = "12 31, 2024";
//        String sDate4 = "Tue, Dec 31 2024";
//        String sDate5 = "Tue, Dec 31 2024 23:37:50";
//        String sDate6 = "31-Dec-2024 23:37:50";
//
//        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
//        SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yyyy");
//        SimpleDateFormat format3 = new SimpleDateFormat("MM dd, yyyy");
//        SimpleDateFormat format4 = new SimpleDateFormat("E, MMM dd yyyy");
//        SimpleDateFormat format5 = new SimpleDateFormat("E, MMM dd yyyy HH:mm:ss");
//        SimpleDateFormat format6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
//
//        Date date1 = format1.parse(sDate1);
//        Date date2 = format2.parse(sDate2);
//        Date date3 = format3.parse(sDate3);
//        Date date4 = format4.parse(sDate4);
//        Date date5 = format5.parse(sDate5);
//        Date date6 = format6.parse(sDate6);
//
//        System.out.println(sDate1 + "\t\t\t\t\t\t"+ date1);
//        System.out.println(sDate2 + "\t\t\t\t\t\t"+ date2);
//        System.out.println(sDate3 + "\t\t\t\t\t\t"+ date3);
//        System.out.println(sDate4 + "\t\t\t\t"+ date4);
//        System.out.println(sDate5 + "\t\t"+ date5);
//        System.out.println(sDate6 + "\t\t\t"+ date6);
//
//        System.out.println();
//        System.out.println(String.format("%-15s %-20s", sDate1, date1));
//        System.out.println(String.format("%-15s %-20s", sDate2, date2));
//        System.out.println(String.format("%-15s %-20s", sDate3, date3));
//        System.out.println(String.format("%-15s %-20s", sDate4, date4));
//        System.out.println(String.format("%-15s %-20s", sDate5, date5));
//        System.out.println(String.format("%-15s %-20s", sDate6, date6));
//
//
//
//


//        String sdate = "31/09/2024";
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/2024");
//
//        Date date = simpleDateFormat.parse(sdate);
//
//        System.out.println(date);











    }
}


class DoubleToSting{

    public static void main(String[] args) {
        /*We can convert double to String in java using
        String.valueOf() and Double.toString() methods.


        It is generally used if we have to display double
        value in textfield for GUI application because
        everything is displayed as a string in form.


        */

        double d1 = 50.50d;

        String s1 = String.valueOf(d1);

        String s2 = Double.toString(d1);

        System.out.println(d1);
        System.out.println(d1+s1);
        System.out.println(d1+s2);





    }
}


class StringTodoubleAndDouble{


    public static void main(String[] args) {
        /*
        * It is generally used if we have to perform mathematical
        * operations on the string that contains double number.
        *  Whenever we get data from textfield or textarea, entered data is
        * received as a string. If entered data is double, we need to convert
        *  string to double. To do so, we use Double.parseDouble() method.
        *
        * */



        String s1 = "50.50";

        double d1 = Double.parseDouble(s1); // this is primitive
        Double d2 = Double.valueOf(s1); // this is object

        System.out.println(d2+d1);
        System.out.println(d2+s1);
        System.out.println(d1+s1);






    }
}


class floatToString{

    public static void main(String[] args) {

        /*It is generally used if we have to display float value in
        textfield because everything is displayed as a string in form.

        We can convert float to String in java using
        String.valueOf() and Float.toString() methods.

        */


        float f = 20.6f;

        String s1 = String.valueOf(f);
        String s2 = Float.toString(f);

        System.out.println(f+f);
        System.out.println(s2+s1);
        System.out.println(f+s2);
        System.out.println(f+s1);



    }
}


class StringTofloatAndFloat{

    /*It is generally used if we have to perform mathematical operations on
    the string that contains float number. Whenever we get data from textfield or
    textarea, entered data is received as a string. If entered data is float,
    we need to convert string to float. To do so, we use Float.parseFloat() method*/



    public static void main(String[] args) {

    String string = "50.5";
    float f = Float.parseFloat(string);
        System.out.println(f+string);
        System.out.println(f+f);

        Float fobject = Float.valueOf(string);

        float floatUnboxing = fobject;
        Float floatAutoboxing = floatUnboxing;





    }



}



class longToString{


    public static void main(String[] args) {
        /*We can convert long to String in java using String.valueOf() and Long.toString() methods.
        Java Convert long to String
        Scenario
        It is generally used if we have to display long number in textfield in GUI
        application because everything is displayed as a string in form.

*/

//        long l1 = 9223372036854775807l; //this is long value

//        String stringLong = String.valueOf(l1);
//        System.out.println(l1);
//        System.out.println(l1+stringLong);


        long l2 = 854541264231l;

        String string2 = Long.toString(l2);

        System.out.println(string2+50);




    }
}



class StringTolongAndLong{


    public static void main(String[] args) {


//        String s = "9990449935";
//
//        long l = Long.parseLong(s);
//
//        System.out.println(s+50);
//        System.out.println(l+50);
//
//

        String stringLong1 = "9990449935";
        String stringLong2 = "9990449990";
        String stringLong3 = "999044990";


        long long1 = Long.parseLong(stringLong1);
        System.out.println("This is long value one: addition with 50");
        System.out.println(long1+50);
        System.out.println("This is long value one: addition with stringLong1");
        System.out.println(long1+stringLong1);

        long long2 = Long.parseLong(stringLong2);
        System.out.println("This long value two: addition with 50");
        System.out.println(long2+50);
        System.out.println("This long value two; addition with stringLong2");
        System.out.println(long2+stringLong2);

        Long longObject = Long.valueOf(stringLong3);
        long long3 = longObject; //this is called unboxing
        System.out.println("This long Object: addition with 50");
        System.out.println(longObject+50);
        System.out.println("This long Object: addition with stringLong3");
        System.out.println(longObject+stringLong3);
        System.out.println("This long Object and long3: addition with each other");
        System.out.println(longObject+long3);






    }

}



class IntToString{

    public static void main(String[] args) {

/*        We can convert int to String in java using String.valueOf() and Integer.toString() methods.
            Alternatively, we can use String.format() method, string concatenation operator etc.

                Scenario
        It is generally used if we have to display number in textfield because everything is displayed as a string in form.*/


        /*Use Integer.toString(int i) when you specifically need to convert an int to a String.
        Use String.valueOf(...) when you want a versatile method that can handle multiple types.*/

//        so Integer.toString only work with int value.  String.valueOf work, int, long, double, float , char, object


//        int a = 50;
//
//        String s  = String.valueOf(a);
//
//        System.out.println(a+50); // 100
//        System.out.println(s+50); //5050
//
//        int i = 200;
//
//        String ss = Integer.toString(i);
//        System.out.println(i+200); // 400
//        System.out.println(ss+200); //200200

//        String.format()

        int a = 200;

        String s = String.format("%d", a);

        System.out.println(s+50); //20050
        System.out.println(a+20); //220








    }






}




class StringToIntAndInteger{
/*
* when we do this.
* it is generally used if we have to perform mathmatical operation on
* the string which contains a number. Whenever we receive data form TextFiel or TextArea
* dat is received as stirng. but we nothing to do with this number.
*
* */

    public static void main(String[] args) {

//
//        String n = "20";
//        int b = 20;
//
//        System.out.println(Integer.parseInt(n)+b);
//
//        Integer c = Integer.parseInt("500"); //autoboxing
//        int d = Integer.valueOf("200"); // unboxint
//
//
//        Integer a = 20; //autoboxing
//        int g = a; // unboxint
//
//        String s = "200";
//        int i = Integer.parseInt(s);
//
//        System.out.println(i);
//
//

//        when we string to primitiv int use parseInt method but
//        when   we string to Interger object then use valueOf method

//        String s = "200";
//        int i = Integer.parseInt(s);
//
//        System.out.println(s+200); //output 200200
//        System.out.println(i+200); // output 400



//        String s = "200";
//        Integer i = Integer.valueOf(s);
//        System.out.println(i);
//        System.out.println(i+200);
//    If you don't have numbers in string literal, calling Integer.parseInt() or
//    Integer.valueOf() methods throw NumberFormatException.
//        it we provided char value

//        String s = "Sajeeb";
//        Integer i = Integer.valueOf(s);




    }



}

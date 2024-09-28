package com.mycompany.test;

import javax.swing.text.StyledEditorKit;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class JavaConverSionExample {

    public static void main(String[] args) {


    }

}

class DecimalToOctal{

    public static void main(String[] args) {

        /*
        * We can convert decimal to octal in java using Integer.toOctalString() method or custom logic.
        * */


//        Integer.toOctalString()
//        -------------------------------------------------------------------------
//        System.out.println(Integer.toOctalString(15));
//        System.out.println(Integer.toOctalString(60));
//
//        System.out.println(Integer.parseInt("77", 8));

        /*Java Decimal to Octal conversion: Custom Logic
        //We can convert decimal to octal in java using custom logic.*/

        System.out.println(toOctal(100));

    }


    public static String toOctal(int decimal){
        int rem; //declaring variable to store remainder
        String octal=""; //declareing variable to store octal
        //declaring array of octal numbers
        char octalchars[]={'0','1','2','3','4','5','6','7'};
        //writing logic of decimal to octal conversion
        while(decimal>0)
        {
            rem=decimal%8;
            octal=octalchars[rem]+octal;
            decimal=decimal/8;
        }
        return octal;
    }



}


class OctalToDecimal{
    public static void main(String[] args) {


        /*We can convert octal to decimal in java using Integer.parseInt() method or custom logic.
        *
        *
        *
        *
        *
        * */

        System.out.println(Integer.parseInt("17",8));

        System.out.println(getDecimal(17));



    }


    public static int getDecimal(int octal){
        //Declaring variable to store decimal number
        int decimal = 0;
        //Declaring variable to use in power
        int n = 0;
        //writing logic
        while(true){
            if(octal == 0){
                break;
            } else {
                int temp = octal%10;
                decimal += temp*Math.pow(8, n);
                octal = octal/10;
                n++;
            }
        }
        return decimal;
    }


}


class DecimalToHex{

    public static void main(String[] args) {

//        We can convert decimal to hexadecimal in java using Integer.toHexString() method or custom logic.


        System.out.println(Integer.toHexString(256));

        System.out.println( toHex(256));


    }


    public static String toHex(int decimal){
        int rem;
        String hex="";
        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(decimal>0)
        {
            rem=decimal%16;
            hex=hexchars[rem]+hex;
            decimal=decimal/16;
        }
        return hex;
    }

}


class HexaDecimalToDecimal{

    public static void main(String[] args) {
//        We can convert hexadecimal to decimal in java using
//        Integer.parseInt() method or custom logic.

//        Integer.parseInt() method

//        System.out.println(Integer.parseInt("10", 16));
//        System.out.println(Integer.toHexString(19));


        System.out.println("Decimal of a is: "+getDecimal("a"));
        System.out.println("Decimal of f is: "+getDecimal("f"));
        System.out.println("Decimal of 121 is: "+getDecimal("121"));




    }


    public static int getDecimal(String hex){
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}




class DecimalToBinary{
    public static void main(String[] args) {

        //        We can convert decimal to binary in java using Integer.toBinaryString() method or custom logic.

//        String i = Integer.toBinaryString(2);
//        System.out.println(i);
//        System.out.println(Integer.toBinaryString(7));
//
//        System.out.println(Integer.parseInt("111",2));

//        Java Decimal to Binary conversion: Custom Logic

        System.out.println(toBinary(63));
        System.out.println(Integer.parseInt("11111", 2));

//0-0
//1-1
//10-2
//11-3
//100-4
//101-5
//110-6
//111-7
//1000-8
//1001-9
//1010-10

    }
//Java Decimal to Binary conversion: Custom Logic
    public static ArrayList<Integer> toBinary(int decimal){

        ArrayList<Integer> binary = new ArrayList<>();
            if (decimal == 0){
                binary.add(0);
                return binary;
            }

        while (decimal>0){
            binary.add(decimal%2);
            decimal = decimal/2;
        }

        Collections.reverse(binary);
        return binary;
    }




}






class BinaryToDecimal{


    public static void main(String[] args) {


        /*We can convert binary to decimal in java using Integer.parseInt() method or custom logic.*/

//        ***Integer.parseInt()
//        The Integer.parseInt() method converts string to int with given redix.
//        Radix refers to the base of a numeral system,
        /*Binary (Base 2): Uses digits 0 and 1.
        Octal (Base 8): Uses digits 0 to 7.
        Decimal (Base 10): Uses digits 0 to 9.
*/
//        The signature of parseInt() method is given below:

//        String  binary ="10";
//        int decimal = Integer.parseInt(binary, 2);
//        System.out.println(decimal);
//        u can try this way

//        System.out.println(Integer.parseInt("100",2));

//        We can convert binary to decimal in java using custom logic.


//        System.out.println(getDecimals(10));
//
//        System.out.println(Integer.parseInt("10",2));
    }


    public static int getDecimals(int binary){

        int decimal = 0;
        int n = 0;

        while (true){
            if (binary == 0){
                break;
            }else {
                int reminder = binary % 10;
                decimal += reminder * Math.pow(2,n);
                binary = binary / 10;
                n++;
            }

        }

        return decimal;
    }







//    public static int getDecimal(int binary){
//        int decimal = 0;
//        int n = 0;
//
//        while (true){
//        if (binary==0){
//            break;
//        }else {
//            int temp = binary % 10;
//            decimal += temp * Math.pow(2, n);
//            binary = binary/10;
//            n++;
//        }
//
//        }
//
//
//        return decimal;
//
//    }




}






class TimeStampToDate{


    public static void main(String[] args) {

//        You can format the Timestamp value using SimpleDateFormat class.
//        Let's see the example of display Timestamp value without
//        milliseconds.


//        Timestamp ts = new Timestamp(System.currentTimeMillis());
//        Date date1= new Date(ts.getTime());
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
//
//
//        System.out.println(simpleDateFormat.format(date1));
//
//        The Timestamp class extends Date class. So, you can directly assign instance of
//        Timestamp class into Date. In such case, output of Date object will be like Timestamp.
//        But, it is not suggested by Java Doc because you may loose the milliseconds or nanoseconds of data.

        Timestamp ts = new Timestamp(System.currentTimeMillis());

        Date date = ts;

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMMM-yyyy");

        System.out.println(formatter.format(date));






    }
}



class DateToTimeStamp{


    public static void main(String[] args) {





//        Java Convert Date to Timestamp
//        Java Convert Date to Timestamp
//        We can convert Date to Timestamp in java using constructor of java.sql.Timestamp class.
//
//        The constructor of Timestamp class receives long value as an argument.
//         So you need to convert date into long value using getTime() method of java.util.Date class.
//
//        You can also format the output of Timestamp using java.text.SimpleDateFormat class.

        Date date = new Date();

        Timestamp ts = new Timestamp(date.getTime());

        System.out.println(ts);

//        You can format the Timestamp value using SimpleDateFormat
//        class. Let's see the example of display Timestamp
//        value without milliseconds.

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy");

        System.out.println(simpleDateFormat.format(ts));





//        Calendar c = Calendar.getInstance();
//        c.set(2024,2,50);
//        Date date = c.getTime();
//
////        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("dd/MMMM/yyyy");
//
//
//        System.out.println(date);

    }


}





class BooleanToString{

    public static void main(String[] args) {



        /*We can convert boolean to String in java using String.valueOf(boolean) method.
        *
        * The String.valueOf() method converts boolean to String.
        * The valueOf() is the static method of String class.
        *
        * */
        boolean b = true;
        String s = String.valueOf(b);
        System.out.println(s);

        /*Alternatively, we can use Boolean.toString(boolean)
         method which also converts boolean into String.
         The Boolean.toString() method converts boolean to String.
         The toString() is the static method of Boolean class.

         */
        boolean bb = false;
        String ss = Boolean.toString(bb);
        System.out.println(ss);



//        int nubmer = 12345;
//        int revers = 0;
//
//        while (nubmer != 0){
//            int remainder = nubmer % 10;
//            revers = revers * 10 + remainder; //54
//            nubmer = nubmer/10;
//        }






    }
}


class StringToBoolean{

    public static void main(String[] args) {

        /*We can convert String to boolean in java using Boolean.parseBoolean(string) method.

        To convert String into Boolean object, we can use Boolean.
        valueOf(string) method which returns instance of Boolean class.

        To get boolean true, string must contain "true". Here, case is ignored. So,
        "true" or "TRUE" will return boolean true. Any other string value except "true" returns boolean false.
*/

        String st1 ="True";
        String st2 = "true";
        String st3 = "TRUE";
        String st4 = "tRue";
        String st5 = "trUe";
        String st6 = "ok";

//      The parseBoolean() method converts string into boolean primitive.
        boolean b1 = Boolean.parseBoolean(st1);
        boolean b2 = Boolean.parseBoolean(st2);
        boolean b3 = Boolean.parseBoolean(st3);
        boolean b4 = Boolean.parseBoolean(st4);
        boolean b5 = Boolean.parseBoolean(st5);
        boolean b6 = Boolean.parseBoolean(st6);


//        The Boolean.valueOf() method converts string into Boolean object.
        Boolean B1 = Boolean.valueOf(st1);
        Boolean B2 = Boolean.valueOf(st2);
        Boolean B3 = Boolean.valueOf(st3);
        Boolean B4 = Boolean.valueOf(st4);
        Boolean B5 = Boolean.valueOf(st5);
        boolean B6 = Boolean.valueOf(st6);


        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);

        System.out.println();

        System.out.println(B1);
        System.out.println(B2);
        System.out.println(B3);
        System.out.println(B4);
        System.out.println(B5);
        System.out.println(B6);



    }
}



class IntToCharAndCharacter{



    public static void main(String[] args) {

/*We can convert int to char in java using typecasting.
To convert higher data type into lower, we need to perform typecasting.
Here, the ASCII character of integer value will be stored in the char variable.*/

//        int i = 1;
//        char c = (char) (i+'0');
//        System.out.println(c);


//        If you store integer value in a single quote, it will store actual character in char variable.
//        int i = '9'; //uppercast compiler
//        char c = (char) i;
//        System.out.println(c);


//        To get the actual value,
//                you can also use Character.forDigit() method.

        int REDIX = 10;
        int a =9;
        char c = Character.forDigit(a, REDIX);

        System.out.println(c);


        /*Definition: Radix, often referred to as the base of a numeral system, indicates the number of
        unique digits, including zero, that a system uses to represent numbers. It is a fundamental
        concept in mathematics and computer science that defines how numerical values are expressed and interpreted.
        Key Points
        Numeral Systems:
        Different numeral systems use different radices. The most common ones include:
        Binary (Base 2): Uses two digits (0 and 1).
        Octal (Base 8): Uses eight digits (0 to 7).
        Decimal (Base 10): Uses ten digits (0 to 9).
        Hexadecimal (Base 16): Uses sixteen digits (0 to 9 and A to F).*/





    }




}



class CharToInt{

    public static void main(String[] args) {

        /*We can convert char to int in java using various ways.
        If we direct assign char variable to int, it will return ASCII value of given character.*/

//        it will return ASCII value of given character
        char c = '4';
        int i  = c;
        System.out.println(i);

//        Java char to int Example: Character.getNumericValue()
//            char c = '4';
//            int i = Character.getNumericValue(c);
//             System.out.println(i);


        // Convert char to int
//        char c = '8';
//        int i = c -'0';
//        System.out.println(i);


//        char c2='9';
//        // Convert char to String and then to int
//        String ss = Character.toString(c2);
//        String s = String.valueOf(c2);
//        Integer i = Integer.valueOf(ss);
//        int ii = Integer.parseInt(s);
//
//        System.out.println(i);



    }
}



class DoubleToInt{

    public static void main(String[] args) {
//        We can convert double to int in java using typecasting.
//                To convert double data type into int, we need to perform typecasting.

        double d = 50.50;
        int i = (int) d;
        long l = (long) d;
        Long L = Long.valueOf((long) d);
        Integer I = Integer.valueOf((int) d);

        Double dd = d;

        int ii = dd.intValue();
        long ll = dd.longValue();




    }
}


class IntTodoubleAndDouble{

    public static void main(String[] args) {

    /*    We can convert int to double in java using assignment operator.
        There is nothing to do extra because lower type can be converted to higher type implicitly.



    */


        int i = 20;

        double d = i;

        System.out.println(d);

        /*We can convert int value to Double
        object by instantiating Double class or calling Double.valueOf() method.*/

        Double dd = Double.valueOf(i);
        Long ll = Long.valueOf(i);

        int ii = ll.intValue();
        int iid = dd.intValue();
        long lv = dd.longValue();
        System.out.println(dd);





    }

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

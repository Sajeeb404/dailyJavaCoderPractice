package com.mycompany.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StringExample {





    public static void main(String[] args) {

//
//        char[] ch = {'S','a', 'j','e','e','b'};
//
//        String st = new String(ch);
//        String string = "Sajeeb";

//        string.compareTo(st);

//        System.out.println(string.compareTo(st));
//
//        String is immutable
//----------------------------------------------------------------------------------------------------------------------
//        String is sechuence of cheracter but in java, string is object

//        two way to create string
//             by string literal or
//                by new key word

//        by string literal exampel
//        String ex = "Sajeeb"; it create a object
//        but
//        String st = ex; it does't create a object
//
//        In the above example, only one object will be created. Firstly, JVM will
//        not find any string object with the value "Welcome" in string constant
//        pool that is why it will create a new object. After that it will find
//        the string with the value "Welcome" in the pool, it will not create a
//        new object but will return the reference to the same instance.
//
//                Note: String objects are stored in a special memory area known
//        as the "string constant pool".

//        create string, by string literal is more efficiant in java
//because when we create string by new key word. it's create two object
//so it's more memory consume and time
//        example:

//        String st = new String("Sajeeb");
//        in one line two object created.
//        one object create in normal heap and one object created in string constant pool.


//        java String class method

//        charAt()
//----------------------------------------------------------------------------------------------------------------------
//        this method return the value of string by pass the index  position.

//        example

//        String st = "Sajeeb";
       /* System.out.println(st.charAt(0));*/
//we also use this
/*        for (int i =0; i<st.length();i++){
            System.out.println(st.charAt(i));
        }

    */

//        System.out.println(st.charAt(st.length()-1));

//        print cheracter odd and even positon

   /*     for (int i =0; i<st.length(); i++){

            if (i%2==0){
//                System.out.println("This is even cheracter");
                System.out.println(st.charAt(i));
            }else {
//                System.out.println("This is odd cheracter");
//                System.out.println(st.charAt(i));
            }*/

//        for (int i = 0; i<st.length(); i++){
//            if(i%2 != 0){
//                System.out.println(st.charAt(i));
//            }
//        }



//        Counting Frequency in string

//        String st = "Counting Frequency in sstring";
//        int count =0;
//
//        for (int i =0; i<st.length();i++){
//            if (st.charAt(i) == 's'){
//                count++;
//            }
//        }
//        System.out.println(count);


//StringExample ste = new StringExample();
//
//    String st = "aeiou";
//
//        System.out.println(ste.vowelCount("aeiou"));
//

//        Java String length()
//----------------------------------------------------------------------------------------------------------------------
//            this method find the length of the string

//        it return integer value

//        String st = "                 ";
//        int countWhitesapece=0;
//        int countword=0;
//
//        for (int i =0; i<st.length(); i++){
//            if (st.charAt(i)== ' '){
//                countWhitesapece++;
//            }else {
//                countword++;
//            }
//        }
//        System.out.println(countword+" This total word");
//        System.out.println(countWhitesapece+" This total this is white space");


//        String st = "Sajeeb is java Developer";
//
//        int sizeWithWhiteSapce = st.length();
//        System.out.println(sizeWithWhiteSapce);
//        st = st.replace(" ", "");
//
//
//        int sizeWhiteoutWhiteSpaces = st.length();
//        System.out.println(sizeWhiteoutWhiteSpaces);
//
//        int whitesapece = sizeWithWhiteSapce-sizeWhiteoutWhiteSpaces;
//        System.out.println(whitesapece);
//        String str = "  fsdf sdfsdfd ";
//        int white=0;
//
//        for (int i =0; i<str.length(); i++){
//            if (str.charAt(i)== ' '){
//                white++;
//            }
//        }
//        System.out.println(white);



//        System.out.println("This is right word ="+st);
//        System.out.println("This is reversed word");
//
//        for (int i =0; i<st.length(); i++){
//            System.out.print(st.charAt(st.length()-1-i));
//        }




//        String format()
//----------------------------------------------------------------------------------------------------------------------
//        It returns a formatted string.
    /*In Java, the String.format() method is used to create a new String object that is
         formatted according to the specified format string and arguments. This method is part of the String class,
        and it provides a way to build formatted strings in a way that’s
        similar to printf but returns a String instead of printing directly.*/
//
//        String sf3=String.format("value is %32.12f",32.33434);
//        String sf4=String.format("value is %32.10f",32.33434);
//        System.out.println(sf3);
//        System.out.println(sf4);
//
//        System.out.printf("value is %32.12f",32.33434);

//        format() or printf() are same but
//                two uses are diffent printf use to print and format() method use to store formated value and then use latter on demand;


//        String formatted = String.format("Width: %10d, %nPrecision: %.3f", 123, 45.6789);

//        System.out.println(formatted);


//        %a this is retrun hexadecimal of given valeu
//        The %a format specifier in Java is specifically designed for floating-point numbers
//        and cannot be used with integer values (int, long, etc.).
//        If you try to use %a with integers, it will result in a java.util.IllegalFormatConversionException.
//
//        try {
//        double a = 5.00;
//        double b = 50.00;
//        String resulta = String.format("a: %a", a);
//        String resultb = String.format("b: %a",b);
//            System.out.println(resulta);
//            System.out.println(resultb);
//
//
//        }catch (Exception e){
//            System.out.println(e);
//        }

//        new line
//        \n
//        System.lineSeparator();
//        format() %n
//        println();
//        this 4 way u create na new line;
//        System.out.println("hello, \nworld");
//        String newLine = System.lineSeparator();
//        System.out.println("Hello,"+newLine+ "world");
//        String st = String.format("Sajeeb %nis devoloper");
//        System.out.println(st);
//        System.out.println("Hello,");
//        System.out.println("world");

//        String text = "Hello";
//        int b = 20;
//        double d= 40.0;
//        float f = 20.0f;
//        char c= 'a';


//        String align1 = String.format("|%10s|", text);
//        String align2 = String.format("|%10s=%n|%10d=%n|%10f=%n|%10c=%n|%10f=", text, b,d,c,f);
////        System.out.println(align1);
//        System.out.println(align2);

//        Here are some commonly used format specifiers with %t:
//
//                  %tF: Formats the date as YYYY-MM-DD.
//                %tD: Formats the date as MM/DD/YY.
//                %tT: Formats the time as HH:MM:SS.
//                %tR: Formats the time as HH:MM (24-hour clock).
//                %tI: Formats the hour as 12-hour clock.
//                %tp: Formats the AM/PM marker.

//        Date date = new Date();
//
//        String datebyYear = String.format("|%20tF|", date);
//
//        String datebyMonth = String.format("|%20tD|",date);
//
//        System.out.println(datebyYear);
//        System.out.println(datebyMonth);
//        Calendar calendar = Calendar.getInstance();
//        int day = calendar.get(Calendar.DAY_OF_MONTH);
//        in hare month +1 because month count index base, so january is 0, or february is 1 that's why ues this
//        int month = calendar.get(Calendar.MONTH)+1;
//        int year = calendar.get(Calendar.YEAR);
//        String firstDay = day+"/"+month+"/"+year;
//        String dateByDay = String.format("|%20s|", firstDay);
//
//        System.out.println(dateByDay);



//        Java String substring()
//----------------------------------------------------------------------------------------------------------------------
//        The Java String class substring() method returns a part of the string.
//
//        We pass beginIndex and endIndex number position in the Java substring method where beginIndex
//        is inclusive, and endIndex is exclusive. In other words, the beginIndex
//        starts from 0, whereas the endIndex starts from 1.

//        There are two types of substring methods in Java string.
//        Signature
//        public String substring(int startIndex)  // type - 1
//        and
//        public String substring(int startIndex, int endIndex)  // type - 2

//        Exception Throws
//        StringIndexOutOfBoundsException is thrown when any one of the following conditions is met.
//        if the start index is negative value
//        end index is lower than starting index.
//        Either starting or ending index is greater than the total number of characters present in the string.

//        type one
//                return from string starting index to last of string
//        type two
//                return from specifed starting and ending.

//        String st = "Hello Sajebb you are a Java Developer?";
//
//        System.out.println(st.substring(2)); // it's return llo Sajebb you are a Java Developer?
//
//        System.out.println(st.substring(2, 5)); // it's return llo, remember white space also have countable.
//
//

//        String str[] =
//                {        "Praveen Kumar",
//                        "Yuvraj Singh",
//                        "Harbhajanddddddddddddddddd Singh",
//                        "Gurjit Singh",
//                        "Virat Kohli",
//                        "Rohit Sharma",
//                        "Sandeep Singh",
//                        "Milkha Singh"
//                };
//
//        String surName = "Singh";
//
//
//        for (int i = 0; i<str.length;i++){
//            int length = str[i].length();
//            String subStrings = str[i].substring(length-surName.length());
//
//            if (surName.equals(subStrings)){
//
//                System.out.println(str[i]);
//
//            }
//        }



//        String[] str = {
//                "Sabbir Hossain",
//                "Rakib Hossain",
//                "Abdur Rahman",
//                "Sajeeb Hossain"
//        };
//
//         String surName ="Hossain";
//        for (int i = 0; i<str.length;i++){
//            int indexLength= str[i].length();
//            String subsWord= str[i].substring(indexLength-surName.length());
//
//            if (subsWord.equals(surName)){
//                System.out.println(str[i]);
//            }
//
//
//        }


//        String str = "Mbadabm";
//
//        String firstLetter=str.substring(0,1);
//        System.out.println(firstLetter);
//        String lastLetter = str.substring(str.length()-1);
//        System.out.println(lastLetter);
//
//        String nextLetter = str.substring(1, str.length()-1);
//        System.out.println("This is next word ="+nextLetter);
//
//
//
//        if (firstLetter.equalsIgnoreCase(firstLetter)){
//            System.out.println("This is equal");
//        }else {
//            System.out.println("This is not equal");
//        }

//        String str ="MiMd";
//        System.out.println(str.substring(0, 1));
//        System.out.println(str.substring(str.length()-1));

//        StringExample stringExample = new StringExample();
//        boolean ans = stringExample.isPalindrom(str);
//
//        if (ans){
//            System.out.println("This is Palindrome Word");
//        }else {
//            System.out.println("this is not Palindrom word");
//        }

//        StringExample stringExample = new StringExample();
//
//        String strs[] =
//                {
//                        "madam",
//                        "rock",
//                        "eye",
//                        "noon",
//                        "kill"
//                };
//
//        for (int i =0; i<strs.length; i++){
//           boolean ans = stringExample.isPalindrom(strs[i]);
//           if (ans){
//               System.out.println("This is Palindrome " + strs[i]);
//           }else {
//               System.out.println("This is not palindrome "+ strs[i]);
//           }
//
//        }

//        Java String contains()
//----------------------------------------------------------------------------------------------------------------------
//        The Java String class contains() method searches the sequence of characters in this string.
//            It returns true if the sequence of char values is found in this string otherwise returns false.
//        true if the sequence of char value exists, otherwise false.
//        he contains() method searches case-sensitive char sequence.
//        If the argument is not case sensitive, it returns false. Let's see an example.




//
//        System.out.println(st.contains("Hello"));
//        System.out.println(st.contains("hello"));

//        The contains() method raises the NullPointerException when one passes null
//        in the parameter of the method. The following example shows the same.

//        System.out.println(st.contains(null));

//        The contains() method should not be used to search for a character in a string. Doing so results in an error
//        String st ="Hello    World ";
//        char d = 'H';

//        The contains() method only checks for the presence or absence of a string in another string. It never
//        reveals at which index the searched index is found.
//                Because of these limitations, it is better to
//        use the indexOf() method instead of the contains() method.


//        Java String join()
//----------------------------------------------------------------------------------------------------------------------

        /*The Java String class join() method returns a string joined with a given delimiter.
        In the String join() method, the delimiter is copied for each element.
        The join() method is included in the Java string since JDK 1.8.
        There are two types of join() methods in the Java String class.*/
//        public static String join(CharSequence delimiter, CharSequence... elements)
//        and
//        public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
//        String stringJoin= String.join("-", "Welcome","to", "java");

//        We can use a delimiter to format the string as we did in the below example to show the date and time.
//        String dateFormat= String.join("/", "15","09", "2024");
//        System.out.println(dateFormat);


//        using null as a delimiter, we get the null pointer exception

//        System.out.println(String.join(null,"hell", "java"));

//
//
//        if the elements that have to be attached with the delimiter are null then, we get the ambiguity.
//                It is because there are two join() methods, and null is acceptable for both types of the join() method.
//        String st = null;
//        st = String.join("*",null);
//        System.out.println(st);


//        If the elements that have to be attached with the delimiter have some strings,
//        in which a few of them are null, then the null elements are treated as a normal string,
//                and we do not get any exception or error. Let's understand it through an example.

//        String str = String.join("-", null, "Rakib", "Sabbir", null,"Shahadat");
//
//        System.out.println(str);



//        Java String equals()
//----------------------------------------------------------------------------------------------------------------------
//        The Java String class equals() method compares the two given strings based on the content of the string.
//        If any character is not matched, it returns false. If all characters are matched, it returns true.

//        System.out.println("rakib".equals("rakib"));


//        Let's see one more example to test the equality of string present in the list.
//        String str = "Aayaan";
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("Rakib");
//        list.add("Sabbir");
//        list.add("Aayaan");
//        list.add("Raihan");
//
//
//        for (String st: list){
//            if (st.equals(str)){
//                System.out.println("Aayaan is present today");
//            }else {
//                System.out.println("Aayaan is not present today");
//
//            }
//        }


//


        /*The internal implementation of the equals() method shows that one
        can pass the reference of any object in the
        parameter of the method. The following example shows the same.*/

       /* String str1 = "a";
        String str2 = "123";
        String str3 = "12.021";
        String str4 = "false";

        Character c = 'a';
        Integer i = 123;
        Float f = 12.021f;
        Boolean b = false;

        System.out.println(str1.equals(c));
        *//*this is show false how do i work any object referance with string*//*
        *//*use tostring*//*
        System.out.println(str1.equals(c.toString()));
        System.out.println(str2.equals(i));
        System.out.println(str2.equals(i.toString()));
        System.out.println(str3.equals(f));
        System.out.println(str3.equals(f.toString()));
        System.out.println(str4.equals(b));
        System.out.println(str4.equals(b.toString()));*/

//        Java String equalsIgnoreCase()
//        ---------------------------------------------------------------------------------------------
//        The Java String class equalsIgnoreCase() method compares the two given strings on the basis of
//                the content of the string irrespective of the case (lower and upper) of the string.
//                It is just like the equals() method but doesn't check the case sensitivity.
//        If any character is not matched, it returns false, else returns true.


//        System.out.println("java".equalsIgnoreCase("Java"));
////        true because same content. not effect lower or upper case. it's just ignore that
//        System.out.println("Java".equalsIgnoreCase("Python"));


//        boolean isEmpty()
//-----------------------------------------------------------------------------------------------
        /*it's return boolean value true or false when is empty is return true or when have data
        * it's return false*/
//        Note: here empty means the number of characters contained in a string is zero.

//        String str = "Rakib";
//        String st = "";
//
//        System.out.println(str.isEmpty()); //false it's have data so it is false
//        System.out.println(st.isEmpty()+); // true it's not have data so it is true
//
//

//        String str = "";
//        String stn = null;
//        String st = "Sajeeb";

//        if (str.length() == 0){
//            System.out.println("my length is 0");
//        }
//            if (str.isEmpty()){
//                System.out.println("my block is empty");
//            }

//        Earlier in this tutorial, we have discussed that the empty strings contain zero characters. However,
//                the same is true for a null string too. A null string is a string that has no value.

        /*to check this null*/
//
//        if (stn == null){
//            System.out.println("This is my null block");
//        } else if (stn.length() == 0) {
//
//            System.out.println("This is my length block");
//        }
//


//
//        Blank Strings
//        Blank strings are those strings that contain only white spaces. The isEmpty() method comes in very
//        handy to check for the blank strings. Consider the following example.

//
//        String st = "  ";
//
//        if (st.length() == 0){
//            System.out.println("The length is 0");
//        } else if (st.length()> 0 && st.trim().isEmpty()) {
//
//            System.out.println("The length now trimed and empty");
//        }else {
//            System.out.println("The length is not 0 or not trimed and now is not empty");
//        }
//        System.out.println(st);
//
//        String str = " Rakib                  sout    ";
//
//        if (str.length() == 0){
//            System.out.println("The length is 0");
//
//        } else if (str.length()> 0 && str.trim().isEmpty()) {
//            System.out.println("The length is not 0 or not trimed and now is not empty");
//
//        }else {
//            System.out.println("The length is not 0 or not trimed and now is not empty");
//
//        }
//
//        System.out.println(str);

//        Java String concat()
//----------------------------------------------------------------------------------------------
//
//        The Java String class concat() method combines specified string at the end of
//        this string. It returns a combined string.


//        String str = "Sajeeb is a java developer";
//        System.out.println(str);
//        str=str.concat(" and Rakib also.");
//        System.out.println(str);

//        so in hare proved java string is immutable we can't change the value of string by through the method
//                to concat assign it.


//        String str1 = "Sajeeb";
//        String str2 = "Rakib";
//        String str3 = "Seli";
//
//        String str4 = str1.concat(str2).concat(str3);
//        char e = 'S';
//        int count =0;
//    for (int i = 0; i<str4.length();i++){
//        if (str4.charAt(i) == e){
//            count++;
//        }
//
//    }

//        System.out.println(count);
//
//            String str = "Country";
////also use this way
//        System.out.println("Bangladesh is my ".concat(str));
//
//
//        Java String replace().
//-----------------------------------------------------------------------------------------------------------
//        The Java String class replace() method returns a string replacing all the old char or CharSequence
//        to new char or CharSequence.//
//        Since JDK 1.5, a new replace() method is introduced that allows us to replace a sequence of char values.


        /*it is just like a find and replacement
        * we are use this system in ms word. it is work same like that.
        * */
//        String str = "Bangladesh is a small country in the world";
////        this is letter replacment
//        String st = str.replace('a', 'b');
//        System.out.println(st);
//
////        This is a charsequenc replacement
//        String repStr = str.replace("Bangladesh", "India");
//
//        System.out.println(repStr);
//
//        The replace() method throws the NullPointerException when the
//        replacement or target is null. The following example confirms the same.

//        String st = "Hello Java i'm hare ";
//
////        String stt = st.replace(null, "s");
//        String  sttt = st.replace("a",null);
//        System.out.println(sttt);

//        Java String replaceAll()
//----------------------------------------------------------------------------------------------------------------------
//        The Java String class replaceAll() method returns a string replacing all
//          the sequence of characters matching regex and replacement string.

//        String  str = "Hello Java we hear you, are hear to me";
//
//        String strs = str.replaceAll("h", "d");

//        System.out.println(strs);
/*
        replaceAll: Uses regular expressions, allowing for complex patterns and substitutions.
        replaceAll: Takes a String regex pattern and a replacement String.
                replace is simpler and faster for straightforward replacements,
        while replaceAll provides greater flexibility for more complex pattern-based replacements.*/


//        : remove white spaces

//        String str = "                    hello java i'm developer ";
//        System.out.println(str);
//
//        String strss = str.replace(" ", "");
//        System.out.println(strss);
//
////        String strs = str.replaceAll("\\s","");
////        System.out.println(strs);
//
//        The replaceAll() method throws the PatternSyntaxException when there is an improper regular expression.

////        adding white space
//        System.out.println("HelloJava".replace("", " "));
//        System.out.println("HelloJavaiamJavaDeveloper".replaceAll(""," "));
//
////        Even the null regular expression is also not accepted by the replaceAll() method as the NullPointerException is raised.
//
//        System.out.println("HelloJava".replaceAll(null,"rakib"));


//        Java String split()
//----------------------------------------------------------------------------------------------------------------------

//        The java string split() method splits this
//        string against given regular expression and returns a char array.


//        String st = "Ja va is my li fe";
//
//        String[] words = st.split("\\s");
//
//        this mean ur String
//        for (String s: words){
//            System.out.println(s);
//        }

//        String str = "Dhaka is   thd capital of Bangladesh";
//        String[] dt = {"hell", "","Two"};
//        split mean split the condition and return array of list

//        String[] stre = str.split("\\s",3);
//
//        for (int i = 0; i< stre.length; i++){
//            System.out.println(stre[i]);
//        }
//        System.out.println(stre.length);
//
//        for (String st: stre){
////            System.out.print(st);
//            System.out.println(st);
//        }

//       String[] st = str.split("\\s",0);
//         in this line 0 limit, remove space and divided it and return array of string but
//        in line you have more the one space as a sequence, in hare remove one space and
//        another one count as a array indexm but index value is empty.
//
//        System.out.println(st.length);
//
//        for (String std: st){
//            System.out.println(std);
//        }


//        String sts = "Java Developer is sthe bestt programmer";
////         in hare bestt one t is split but another one remove but count array as a empty eary
////                that why is array leght 4;
//        String[] std = sts.split("t", 0);
//        System.out.println(std.length);
//        for (String sd : std){
//            System.out.println(sd);
//        }



//        Java String intern()
//---------------------------------------------------------------------------------------------------------------------
//        The intern() method in Java is a part of the String class and plays a role in optimizing memory usage for strings.

//        String st = new String("Hello").intern();
//        String st1 = "Hello";
//        String st2 = "Hello";
//
//        System.out.println(st == st1);
//        System.out.println(st.hashCode());
//        System.out.println(st1.hashCode());
//        System.out.println(st2.hashCode());

//        in hare 3 string are same memory location share each other
//        When a string is created in Java, it occupies memory in the heap. Also,
//        we know that the String class is immutable. Therefore, whenever we create a string
//        using the new keyword, new memory is allocated in the heap for corresponding string,
//        which is irrespective of the content of the array. Consider the following code snippet.



//        Java String indexOf()
//--------------------------------------------------------------------------------------------------------------------
//        The Java String class indexOf() method returns the position of
//                the first occurrence of the specified character or string in a specified string.
//        in hare 4 type index method

//        1. int indexOf(int ch)
//        It returns the index position for the given char value

//        String st = "Hello word";
//        System.out.println(st.indexOf('H'));
//        in hare i give him letter it's give me the letter index position (1st)
//        if you need last l index u use lastindexof method



//        2  int indexOf(int ch, int fromIndex)
//        It returns the index position for the given char value and from index
//        String st2 = "Hello lBangladesh";
//        System.out.println(st2.indexOf('l', 7));

//        3 int indexOf(String substring)
//        It returns the index position for the given substring

//        String st = "Hello java can you hear me, hello can java ";
//        System.out.println(st.indexOf("can"));
//
//        4 int indexOf(String substring, int fromIndex)
//        It returns the index position for the given substring and from index
//        System.out.println(st.indexOf("can", 12));

//        find out the tatal cheracter
//         String st = "Hello java can you hear, me i'm Sajeeb";
//
//
//         int count = 0;
//         int fromIndex = 0;
//         for (;;){
//             int indx = st.indexOf('e',fromIndex);
//             System.out.println(indx);
//             if (indx>=0){
//                 count++;
//                 fromIndex = indx+1;
//             }else {
//                 break;
//             }
//         }
//        System.out.println(st);
//        System.out.println("The e is present ="+count);
//
//
//
//

//
//        String st = "Hello man wellcome to new bangladeeeeeesh";
//
//        int letterCount= 0;
//        int fromIndex = 0;
//
//        for (;;){
//
//            int index = st.indexOf('e',fromIndex);
//
//            if (index>=0){
//                letterCount++;
//                fromIndex = index+1;
//            }else {
//                break;
//            }
//        }
//        System.out.println(letterCount);


//        Java String toLowerCase()
//---------------------------------------------------------------------------------------------------------------------
//        The java string toLowerCase() method returns the string in lowercase letter. In other
//        words, it converts all characters of the string into lower case letter.

//        String st = "HellO BanglaDeHS";
//
//        String stToLoercase= st.toLowerCase();
//        System.out.println(stToLoercase);

//        There are two variant of toLowerCase() method. The signature or syntax of string toLowerCase() method is given below:
//
//        public String toLowerCase()
//        public String toLowerCase(Locale locale)

//        now we see toLowerCase

//        String st = "MY namE iS IsmaIl";
//
//        String stringEng= st.toLowerCase(Locale.ENGLISH);
//        System.out.println(stringEng);
//        String stringTur = st.toLowerCase(Locale.forLanguageTag("tr"));
//        String stringIt = st.toLowerCase(Locale.forLanguageTag("it"));
//        System.out.println(stringTur);
//        System.out.println(stringIt);

//        toLowerCase() use for lower the word
//    toLowerCase(Locale clae) also same but in hare we see local word

//        toLowerCase(): Converts all characters to lowercase based on the default locale.
//        toLowerCase(Locale locale): Converts all characters to lowercase based on
//        the specific locale rules, which can differ for special characters like I and İ.
//        No Parameters: Converts all characters in the string to lowercase based on the default locale of the JVM.


//        Java String toUpperCase()  toUpperCase(Locale locale)
//-----------------------------------------------------------------------------------------------------------

//        toUpperCase()
//        It returns a string in uppercase.
//        toUpperCase(Locale locale)
//        It returns a string in uppercase using specified locale.

//        toUpperCase() and toUpperCase(Locale locale)  also same to lowerMethod.
//        lower use for lower the sentence and upper use for upper the sentence
//        String st = "hello bangladeshIIiiii";
//            String st2 = st.toUpperCase();
//            System.out.println(st2);
//            String stE = st.toUpperCase(Locale.ENGLISH);
//        System.out.println(stE);
//        String stT = st.toUpperCase(Locale.forLanguageTag("tr"));
//        System.out.println(stT);

//        in hare you see the difference



//        String trim()
//-----------------------------------------------------------------------------------------------------------------------
//        It removes all beginning and ending spaces of this string.
//        this method does not remove middle spaces
//        String st = "     Hello         java  ";
//        System.out.println(st);
//
//        System.out.println(st.trim());

// String st1 = " Hello java ";
//        System.out.println(st1.length());
//        System.out.println(st1.trim().length());


        String st = " abc ";
        String st2 = " abc ";

        System.out.println(st.hashCode() == st2.trim().hashCode());

//        so hashcode also chages


//        static String valueOf(int value)
//--------------------------------------------------------------------------------------------------------------------------
//        It converts given type into string. It is an overloaded method.






    }









    boolean isPalindrom(String str){

        int length = str.length();
        if (length == 0 || length == 1){
        return true;
        }
        String firstLetter = str.substring(0,1);
        String lastLetter = str.substring(str.length()-1);

        if (firstLetter.equalsIgnoreCase(lastLetter)){

        return isPalindrom(str.substring(1, length-1));
        }
        return false;
    }



//        ArrayList<Character> bl;


//    public StringExample() {
//
//        bl = new ArrayList<Character>();
//        bl.add('A'); bl.add('a');
//        bl.add('E'); bl.add('e');
//        bl.add('I'); bl.add('i');
//        bl.add('O'); bl.add('o');
//        bl.add('U'); bl.add('u');
//    }


//    boolean isVowel(char vowel){
//
//       for (int i = 0; i< bl.size(); i++){
//            if (vowel == bl.get(i)){
//                return true;
//            }
//       }
//       return false;
//    }

//    int vowelCount(String s){
//    int vowelc =0;
//
//      for (int i =0; i<s.length(); i++){
//
//        char c = s.charAt(i);
//        if (isVowel(c)){
//        vowelc++;
//        }
//
//    }
//
//    return vowelc;
//    }


}



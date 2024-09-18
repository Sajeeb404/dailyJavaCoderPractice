package com.mycompany.test;

import com.mysql.cj.xdevapi.DatabaseObject;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.*;
import java.util.stream.Stream;

public class RegularExpresionExample {


//    The Java Regex or Regular Expression is an API to define a pattern
//    for searching or manipulating strings.
//It is widely used to define the constraint on strings such as password and email validation.
//Java Regex API provides 1 interface and 3 classes in java.util.regex package
//MatchResult interface
 //Matcher class
 //Pattern class
 //PatternSyntexException class
    public static void main(String[] args) {



//        Pattern class
//--------------------------------------------------------------------------------------------
//        It is the compiled version of a regular expression.
//        It is used to define a pattern for the regex engine.

//        Pattern p = Pattern.compile("$s");
//
//
//        Matcher m = p.matcher("as");
//
//        boolean b = m.matches();
//
//        System.out.println(b);


        /*o u mean pattern class compile regex pattern and that patter following matcher class for matching??
ChatGPT said:
ChatGPT
Exactly! Here’s a concise breakdown of how the Pattern and Matcher classes work together in Java:

Interaction Between Pattern and Matcher
Compile the Regex:

You start by creating a Pattern object using the Pattern.compile(String regex) method.
This compiles the provided regular expression into a pattern that can be used for matching.


Create a Matcher:

You then create a Matcher object by calling the matcher(CharSequence input) method on the Pattern object,
passing in the string you want to search or match against.


Perform Matching Operations:

With the Matcher object, you can now perform various matching operations:
matches(): Checks if the entire input string matches the pattern.
find(): Searches for the next substring that matches the pattern.
replaceAll(String replacement): Replaces all matches in the input string with a specified replacement string.


Summary
Pattern: Compiles the regex and defines the matching rules.
Matcher: Performs the actual matching operations based on the rules defined by the Pattern.
*/

//
//        Scanner st = new Scanner(System.in);
//        boolean controller = true;
//
//        while (controller){
//            System.out.println("Enter Regex pattern");
//            Pattern p = Pattern.compile(st.nextLine());
//            System.out.println("Now enter Text");
//            Matcher m = p.matcher(st.nextLine());
//
//            boolean found = false;
//            while (m.find()){
//
//                System.out.println("i found the text "+ m.group()+" starting at index "+ m.start()+ " ending index "+ m.end());
//                found = true;
//                controller = false;
//            }
//            if (!found){
//                System.out.println("No match found");
//            }
//
//        }

//
//        Pattern p = Pattern.compile("[a-z]");
//        Matcher m = p.matcher("b");
//
//        boolean b = m.matches();
//
//        System.out.println(b);

//        Pattern p = Pattern.compile("rakib");
//        Matcher m =p.matcher("hossain rakib and rakib");
//
//
//        System.out.println(m.groupCount());

//        Pattern p = Pattern.compile(",");
//        String s = "Sajeeb, Afzal, Sufian, Bappy, Defu, Nabil, Sabbir";
//        String[] ss = p.split(s);
//
//        for (String b : ss){
//            System.out.println(b.trim());
//
//        }

//
//
//        Pattern p = Pattern.compile("....s");
//        Matcher m = p.matcher("aafs");
//        boolean b = m.matches();
//        System.out.println(b);
//
//        boolean bd = Pattern.compile(".s").matcher("Rs").matches();
//        System.out.println(bd);
//
//        boolean bs = Pattern.matches("..s", "aas");
//
//        System.out.println(bs);


//        System.out.println(Pattern.matches(".s", "rs"));

//        System.out.println(Pattern.matches(".s.", "rsr"));

//        System.out.println(Pattern.matches("[abc]","I have an apple and a banana."));
//        Pattern p = Pattern.compile("[abc]");
//        Matcher m = p.matcher("I have an apple and a banana.");
//
//        System.out.println(m.matches());
//
//        while (m.find()){
//
//            System.out.println(m.group());
//        }

//    Pattern p = Pattern.compile("[^abc]");
//    Matcher m = p.matcher("sajeeb are you here");
//
//
//    while (m.find()){
//
//        System.out.println(m.group());
//
//    }
//        Pattern p = Pattern.compile("[a-z]");
//        Matcher m = p.matcher("rakib ssain");
//        if (m.matches()) {
//            System.out.println("The input matches the pattern.");
//        } else {
//            System.out.println("The input does not match the pattern.");
//        }


//        String input = "HelloWorld"; // Input string to check
//        Pattern p = Pattern.compile("[a-zA-Z]+"); // Pattern to match one or more letters
//
//        Matcher m = p.matcher(input);
//
//        // Check if the entire string matches the pattern
//        if (m.matches()) {
//            System.out.println("The input matches the pattern.");
//        } else {
//            System.out.println("The input does not match the pattern.");
//        }
//

//

//
//        System.out.println("? quantifier ....");
//        System.out.println(Pattern.matches("[nnn]?", "nn"));

//        System.out.println("+ quantifier ....");
//        System.out.println(Pattern.matches("[amn]+", "aammnnnnnnnnnnnnn"));
//
//        Pattern p = Pattern.compile("[amn]+");
//        Matcher m = p.matcher("aaaaaaaaaaaaaaaaaaaaaa");
//        System.out.println(m.matches());
//

//        Pattern p = Pattern.compile("[^abc]");
//        Matcher m = p.matcher("d");
//
//        System.out.println(m.matches());
//
//


//        Pattern p = Pattern.compile("[A-z]");
//        Matcher m = p.matcher("a");
//        System.out.println(m.matches());
//
//        Pattern p = Pattern.compile("[a-bd-z]");
//
//        Matcher m = p.matcher("c");
//        System.out.println(m.matches());

//        Pattern p = Pattern.compile("[a-z&&[abc]]");
//
//        Matcher m = p.matcher("a");
//        System.out.println(m.matches());


//        Pattern p = Pattern.compile("[a-z&&[^c-z]]");
//        Matcher m = p.matcher("");
//        System.out.println(m.matches());


//        [abc]: This matches a single character that can be either 'a', 'b', or 'c'.
//                ?: This quantifier means "zero or one occurrence" of the preceding element (in this case, the character class [abc]).
//        System.out.println("? quantifier ....");
//        System.out.println(Pattern.matches("[abc]?", "c"));
//        System.out.println(Pattern.matches("[amn]?", "aa"));



//        one or more times
//        System.out.println(Pattern.matches("[hello]+", "e"));
//        System.out.println(Pattern.matches("[hello]+", "llllllllllllllllllllll"));
//        System.out.println(Pattern.matches("[hello]+", ""));


//        zero or more times

//        System.out.println(Pattern.matches("[hell]*", ""));
//        System.out.println(Pattern.matches("[hell]*", "h"));
//        System.out.println(Pattern.matches("[hell]*", "hhhhhhh"));
//        System.out.println(Pattern.matches("[hell]*", "fffff"));
//        System.out.println(Pattern.matches("[hell]*", "hhhhhhhhhhhhhheeeeeeeeellllllloooo"));


//        X{n}
//        X occurs n times only


//        String[] stt = {"aaa","aaaa","aa"};
//
//        Pattern p = Pattern.compile("a{3}");
//
//        for (String s:stt){
//            Matcher m = p.matcher(s);
//
//            System.out.println(m.matches());
////           if (m.matches()){
////               System.out.println(s +" matches the pattern");
////            }
////           else {
////               System.out.println(s +" not matches the pattern");
//
//           }




//        X{n,}: Matches X at least n times. There is no upper limit specified.


//        String[] strings = {"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa"};
//
//        Pattern p = Pattern.compile("a{3,}");
//
//        for (String st : strings){
//
//        Matcher m = p.matcher(st);
//            System.out.println(m.matches());
//        }


//        X{y,z}
//        X occurs at least y times but less than z times


        String[] strings = {"a", "aa", "aaa", "aaaa", "aaaaa", "aaaaaa", "aaaaaaa"};

//        Pattern p = Pattern.compile("a{04,06}");
//
//        for (String string :strings){
//            Matcher m = p.matcher(string);
//            if (m.matches()){
//                System.out.println(string + " is matches" + " length is "+string.length());
//            }else {
//                System.out.println(string + " is not matches");
//            }
//
//        }





//
//        Definition
//                .: Matches any single character, including letters,
//                digits, punctuation, and whitespace, but typically does not match line terminators (like \n).


        String[] string = {"", ".", ",", "/", "?", "[", "{", "]", "}", "\n", "|", "!", "@", "#", "$", "%", "%", "&", "*", "(", ")", "_", "-", "=", "+", "1", "a", "bb", "2", "22", "4155", "df", "aaaaa", "a", "abfc10"};
//
//
//        Pattern p = Pattern.compile(".");
//
//        for (String st: string){
//            Matcher m = p.matcher(st);
//            System.out.println(m.matches()+ " "+st);
//        }


//        \d
//        Any single digits, short of [0-9]

//        Definition
//\d: Matches any single digit character from 0 to 9.


//        Pattern d = Pattern.compile("\\d");
//
//        for (String st : string){
//            Matcher m = d.matcher(st);
//            if (m.matches()){
//                System.out.println(st +" this is digit matches");
//            }else {
//                System.out.println(st +" this is not digit, so not matches");
//
//            }
//
//        }


//        \D
//        Any non-digit, short for [^0-9]

        /*The regex pattern \D is used to match any non-digit character, which is equivalent to the character class [^0-9].
          Definition
        \D: Matches any character that is not a digit (i.e., not in the range 0-9).*/

//        String[] str = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "a", "aa", "ab", "12b" };
//
//        Pattern pb = Pattern.compile("\\D");
//
//        for (String st : str){
//            Matcher m = pb.matcher(st);
//            if (m.find()){
//                System.out.println("Match the pattern "+ st);
//            }else {
//                System.out.println("does not match the pattern "+ st);
//
//            }
//
//        }

       /* The regex pattern \s is used to match any whitespace character, which includes spaces, tabs, newlines, and other types of whitespace.

        Definition
\s: Matches any single whitespace character. This includes:
        Space (' ')
        Tab ('\t')
        Newline ('\n')
        Vertical tab ('\x0B')
        Form feed ('\f')
        Carriage return ('\r')*/





//        \s
//        Any whitespace character, short for [\t\n\x0B\f\r]

        String[] st = {"x0B", "\f", "\r", " ","\n", "a", "abc", " a ", "  \t ", "123", "ab"};
//
//        Pattern p = Pattern.compile("\\s");
//
//        for (String ss : st){
//            Matcher m = p.matcher(ss);
//
//            if (m.find()){
//                System.out.println("This is match " + ss);
//            }else {
//                System.out.println("This is not match " + ss);
//
//            }
//        }

//        \S
//        Any non-whitespace character, short for [^\s]



//        Pattern p = Pattern.compile("\\S");
//
//        for (String ss :st){
//            Matcher m = p.matcher(ss);
//            if (m.find()){
//                System.out.println("this is match "+ ss);
//            }else {
//                System.out.println("this is not match");
//
//            }
//        }


        /*Definition
        \w: Matches any single word character, equivalent to the character class [a-zA-Z_0-9]. This means it matches:
        Lowercase letters (a-z)
        Uppercase letters (A-Z)
        Digits (0-9)
        Underscore (_)*/
//        Pattern pattern = Pattern.compile("\\w");
//        Pattern p = Pattern.compile("[a-zA-Z_0-9]");
//
//        String[] sts = {"aaRB_5045", "45asdDD"};
//
//        for (String std: sts){
//            Matcher m = p.matcher(std);
//            if (m.find()){
//                System.out.println("this match");
//            }else {
//                System.out.println("this not match");
//
//            }
//        }

        /*The regex pattern \W is used to match any non-word character, which is the inverse of \w.

                Definition
\W: Matches any single character that is not a word character. This includes:
        Spaces
        Punctuation (e.g., !, @, #, etc.)
        Special characters (e.g., $, %, &, etc.)
        Any character that is not a letter, digit, or underscore*/

//        Pattern p = Pattern.compile("\\W");
//
//        String[] str = {"@", "!", "*", "&", "%", "dfasdf", "fd545_"};
//
//        for (String s: str){
//            Matcher m = p.matcher(s);
//            System.out.println(m.matches());
//        }


    /*The regex pattern \b is used to denote a word boundary. It is a zero-width assertion that matches a position
        between a word character (as defined by \w) and a non-word character (as defined by \W), or the start/end of a string.

    Definition
    \b: Matches a position where a word character (like letters, digits, or underscores) is next to a non-word character or
    the start/end of a string. It does not consume any characters; it simply asserts where a word begins or ends.*/


//        Pattern p = Pattern.compile("\\bcat\\b");
//
//        String[] str = {"This is cat", "this is cat", "I love cat", "hell Cat"};
//
//        for (String  ss: str){
//            Matcher m = p.matcher(ss);
//
//            if (m.find()){
//            System.out.println("This is match " );
//
//            }else {
//            System.out.println("This is not match ");
//
//            }
//
//
//
//
//        }

        /*The regex pattern \B is used to denote a non-word boundary. It matches a position where a word character
         is adjacent to another word character, meaning it asserts that a boundary between word and non-word characters does not exist.
        Definition
        \B: Matches a position that is not a word boundary. This means it will match positions between two
        word characters or between two non-word characters.*/







        }










    }


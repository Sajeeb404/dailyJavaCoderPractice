package com.mycompany.test;

import java.util.StringJoiner;

public class StringBufferExample {


    public static void main(String[] args) {


        /*Java StringBuffer class is used to create mutable (modifiable) String objects.
        *
        *A String that can be modified or changed is known
        *  as mutable String. StringBuffer is used for creating mutable strings.
        *
        *
        * */

//
//        StringBuffer sb = new StringBuffer(20);
//
//        sb.append("How are you0         ");
//        System.out.println(sb.capacity());
//


//        StringBuffer st = new StringBuffer();
//
//        System.out.println(st.capacity());
//        (16*2)+2=34 i.e (oldcapacity*2)+2
//        it use for capcity
//when 16 charecter is fill then follow thid condition

//        System.out.println(st.reverse());
//        System.out.println(st.length());

//        String st ="Hello java";
////
//        for (int i = st.length()-1; i>=0; i--){
//            System.out.print(st.charAt(i));
//        }




//        StringBuffer sb=new StringBuffer("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
//
//        sb.ensureCapacity(50);
//        System.out.println(sb.capacity());
//        System.out.println(sb.capacity());//default 16
//
//        sb.append("Hello");
//
//        System.out.println(sb.capacity());//now 16
////
//        sb.append("java is my favourite language");
//        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
//        sb.ensureCapacity(10);//now no change
//        System.out.println(sb.capacity());//now 34
//        sb.ensureCapacity(50);//now (34*2)+2
//        System.out.println(sb.capacity());//now 70

//        StringBuffer Class append() Method
//----------------------------------------------------------------------------
//        appee() is use for concatetion with giving argument?
//
//        StringBuffer sb = new StringBuffer();
//        sb.append(10);
//        sb.append(20);
//        System.out.println(sb);

//        StringBuffer sb = new StringBuffer();
//        String num = "42";
//        String pi = "3.14";
//
//
//        sb.append(num);  // Appends the integer directly
//        sb.append(pi);   // Appends the double directly
//        sb.append(" is the answer.");
//        System.out.println(sb);

//        why introduced multiple data type in append method

        /*i understand one think. int i append here and after later i also
        mathmatical operation in other methodChatGPT said:
        Exactly! That's one of the key advantages of having different data
        types in Java. By using the original data types like int, double, or
        boolean, you can perform mathematical and logical operations without
        needing to convert them back and forth between strings.*/


//        StringBuffer insert() Method
//------------------------------------------------------------------------------
//        The insert() method inserts the given String with this string at the given index position.

//        StringBuffer sb = new StringBuffer("Hello");
////        sb.insert(0,50);
//        sb.insert(1,"java");//Hjavaello
////        sb.insert(1,60);//5600
//        System.out.println(sb);

//        StringBuffer replace() Method
//-----------------------------------------------------------------------------------
//        the replace() method replaces the given String from the specified beginIndex and endIndex.

//        replace method re---place the exact letter, word or sentance from specifeind starting index and ending index
//        let's example

//        StringBuffer st = new StringBuffer("Hello Java");
//
//        st.replace(4,7, "Sajeeb");// hell Sajeeb ava
//        System.out.println(st);


//        StringBuffer delete() Method
//--------------------------------------------------------------------------------
//        The delete() method of the StringBuffer class deletes the
//        String from the specified beginIndex to endIndex.

//        StringBuffer stringBuffer = new StringBuffer("Hello Bangladesh");
//        stringBuffer.delete(2,4);
//        System.out.println(stringBuffer);
//
//
//        StringBuffer stb = new StringBuffer();
//        stb.append("Rakib");
//        stb.append("Rakib");
//        stb.append("Sabbir");
//        stb.append("Sajeeb");
//        stb.delete(0,5);
//        stb.replace(5, 11, "Ria");
//
////         System.out.println(stb);
//
//        StringJoiner st = new StringJoiner(", ", "{","}");
//        st.add(stb);
//        st.add("Sajeeb");
//
//        System.out.println(stb.charAt(01));
//
//
//
//        System.out.println(st);


//        StringBuffer reverse() Method
//------------------------------------------------------------------------
//        the reverse() method of the StringBuilder class reverses the current String.

//        StringBuffer stb = new StringBuffer();
//        stb.append("Madam");
//
//        stb.reverse();
//        System.out.println(stb);

//        6) StringBuffer capacity() Method
//-------------------------------------------------------------------------
//        the capacity() method of the StringBuffer class returns the current capacity of the buffer.
//        The default capacity of the buffer is 16. If the number of character increases from its
//        current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your
//        current capacity is 16, it will be (16*2)+2=34.
//        StringBuffer st = new StringBuffer();
//        System.out.println(st.capacity());
//        st.append("banglaesh iss my ");
//        System.out.println(st.capacity());

//        StringBuffer ensureCapacity() method
//        .................................................................
//        The ensureCapacity() method of the StringBuffer class ensures that the
//        given capacity is the minimum to the current capacity. If it is greater than
//        the current capacity, it increases the capacity by (oldcapacity*2)+2. For example
//        if your current capacity is 16, it will be (16*2)+2=34.

        StringBuffer stb = new StringBuffer(17);
        stb.append("ffffffffffffffffff");
        System.out.println(stb.capacity());

//            stb.ensureCapacity(17);
//        System.out.println(stb.capacity());
//        stb.append("dfffffffffffffffffff");
//        System.out.println(stb.capacity());


        /*Overview of StringBuffer
Definition: StringBuffer is a mutable sequence of characters. It is part of the java.lang package and is used to create strings that can be modified after they are created.
Key Features
Mutability: Unlike String, which is immutable, StringBuffer allows modifications to its content without creating new objects. This makes it more efficient for operations that involve frequent changes to string data.

Thread Safety: StringBuffer is synchronized, meaning it is thread-safe. Multiple threads can safely access a StringBuffer instance without corrupting its data.

Capacity Management: StringBuffer maintains a capacity that determines how much space is allocated for character data. If the current capacity is exceeded, it automatically increases the capacity using its growth strategy.

Important Methods
Constructors:

StringBuffer(): Creates a new StringBuffer with a default capacity of 16 characters.
StringBuffer(int capacity): Creates a new StringBuffer with the specified initial capacity.
StringBuffer(String str): Creates a new StringBuffer initialized to the contents of the specified string.
Common Methods:

append(): Adds a string, character, or other data types to the end of the StringBuffer.
insert(): Inserts a string or character at a specified index.
delete(): Removes characters from a specified range.
replace(): Replaces characters in a specified range with a new string.
reverse(): Reverses the characters in the StringBuffer.
capacity(): Returns the current capacity of the buffer.
ensureCapacity(int minimumCapacity): Ensures that the buffer can hold at least the specified number of characters.*/

        /*Performance Considerations
Efficiency: StringBuffer is generally more efficient than String when performing numerous string modifications. Each modification of a String results in a new object, whereas StringBuffer modifies the existing object.

Synchronization Overhead: While StringBuffer is thread-safe, this comes at a performance cost. For single-threaded scenarios, consider using StringBuilder, which is similar but not synchronized.

When to Use
Use StringBuffer when you need a mutable string that can be modified by multiple threads.
For single-threaded applications or when performance is critical, prefer StringBuilder, which offers similar functionality without synchronization.
Summary
StringBuffer is a mutable, synchronized character sequence.
It is ideal for scenarios requiring frequent modifications to strings, especially in multi-threaded environments.
It provides various methods for string manipulation, making it versatile for different use cases.*/
            StringBuffer st = new StringBuffer("Hello");
            StringBuffer st1 = new StringBuffer("Hello");
        System.out.println(st.toString().equals(st1.toString()));




    }



}

package com.mycompany.test;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.spec.ECField;


class Simple{

  private void msg(){
        System.out.println("Hello i'm private method");
    }
}

public class ReflactionAPIExample {

//    static class Test{
//
//        void printName (Object ob){
     //       Class c = ob.getClass();
//            System.out.println(c.getName());
//        }
//    }

  public void m(){
        System.out.println("hello m() method");
    }
   public int b = 20;


    public static void main(String[] args) throws Exception {



        try {
            Class<?> c = Class.forName("com.mycompany.test.Simple");
            Simple s = (Simple) c.getDeclaredConstructor().newInstance();
            Method m = c.getDeclaredMethod("msg", null);
            m.setAccessible(true);
            m.invoke(s, null);

        }catch (Exception e){
            System.out.println(e);
        }






//        try {
//            Class<?> c = Class.forName("com.mycompany.test.ReflactionAPIExample");
//
//            ReflactionAPIExample r = (ReflactionAPIExample) c.getDeclaredConstructor().newInstance();
//
//            r.m();
//
//            System.out.println(r.b);
//        } catch (Exception e) {
//            System.out.println(e);
//
//        }


//        ReflactionAPIExample r = new ReflactionAPIExample();
//        Method m = ReflactionAPIExample.class.getMethod("m");
//        Field f = ReflactionAPIExample.class.getField("b");
//
//        int d= f.getInt(r);
//        System.out.println(d);
//
//        m.invoke(r);

//        Class c = Class.forName("com.mycompany.test.ReflactionAPIExample");
//        System.out.println(c.getName());
//

//ReflactionAPIExample r = new ReflactionAPIExample();
//
//
//        Test t = new Test();
//        t.printName(r);
//
//
//        Class c = boolean.class;
//        System.out.println(c.getName());
//
//        Class c2 = ReflactionAPIExample.class;
//
//        System.out.println(c2.getName());



//        Understanding javap tool

        /*javap is a command-line tool provided by the Java Development Kit (JDK) that
        disassembles Java class files. It allows you to view the compiled bytecode of
         a Java class, including information about the methods, fields, and other class members.

Key Features of javap
Disassembly:

javap can show the bytecode for methods in a human-readable format, making it
 useful for understanding how Java code is translated into bytecode.
Class Information:

You can get information about the class structure, such as access modifiers (public,
private, etc.), method signatures, field types, and more.
Debugging:

It can be used for debugging purposes to analyze the compiled code and understand
 how Java constructs are represented at the bytecode level.
Options:

javap has various options to control the output, such as -c for bytecode, -p for
public and private methods/fields, and -s for internal signatures.
Example Usage
Assuming you have a Java class named Example compiled into Example.class, you can use javap as follows:

Basic Usage:
javap Example

View Bytecode:
javap -c Example

View All Members (Including Private):
javap -p Example

View Internal Signatures:
javap -s Example


javap is a valuable tool for Java developers, especially for those interested in
understanding how Java code is compiled and executed at a lower level. It aids in
 debugging and helps to clarify the relationships between Java source code and the generated
 bytecode. If you have more questions about javap or related topics, feel free to ask!


*/




    }
}

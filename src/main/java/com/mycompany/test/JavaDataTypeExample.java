package com.mycompany.test;

public class JavaDataTypeExample {


    boolean b;
    char c;
    byte by = 30;
    short sht= 32767;
    int in ;
    long lg;
    float f;
    double d;


    public static void main(String[] args) {

        JavaDataTypeExample jb = new JavaDataTypeExample();

        System.out.println("boolean default value---false--- "+(jb.b));
        System.out.println("char default value---u000--- "+jb.c);
        System.out.println("byte default value---0--- "+jb.by);
        System.out.println("short default value---0--- "+jb.sht);
        System.out.println("int default value---0--- "+jb.in);
        System.out.println("long default value--0l---- "+jb.lg);
        System.out.println("float default value---0.0f--- "+jb.f);
        System.out.println("double default value---0.0d--- "+jb.d);
    }
}

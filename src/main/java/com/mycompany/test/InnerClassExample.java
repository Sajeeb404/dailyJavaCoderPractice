package com.mycompany.test;

public class InnerClassExample {

    int age=30;

    class Inner{
        void msg(){
            System.out.println("Her age is "+ age);
        }
    }


    public static void main(String[] args) {



        InnerClassExample outer= new InnerClassExample();

        InnerClassExample.Inner in = outer.new Inner();

        in.msg();
        InnerClassExample.Pratic pr = outer.new Pratic();
        pr.ms();

    }


    class Pratic{

        void ms(){
            System.out.println("Hello i'm innter class two");
        }
    }


    /*Anonymous classes are a useful feature in Java for quickly defining
    classes that are used only once, especially in scenarios involving
    interfaces or abstract classes. They promote concise and clear code
    in specific contexts, though care should be taken not to overuse
     them to avoid reducing code readability.*/



    /*A local inner class is defined within a method and is only accessible
    within that method. Once the method finishes executing, the local inner
    class and its instances are no longer accessible, effectively "dying"
    when the method scope ends. This makes them useful for temporary
    tasks or encapsulating functionality that's only relevant
    within that specific method.*/


    private int data=30;//instance variable
    void display(){
        int value=50;//local variable must be final till jdk 1.7 only
        class Local{
            void msg(){System.out.println(value);}
        }
        Local l=new Local();
        l.msg();
    }





}

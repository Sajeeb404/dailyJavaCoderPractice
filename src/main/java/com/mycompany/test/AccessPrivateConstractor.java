package com.mycompany.test;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Example{

    private int id;
    private String name;

    private Example() {
        System.out.println("this private non-paramitarized constractor");
    }

    private Example(int id, String name) {
        System.out.println("this private paramitarized constractor");
        this.id = id;
        this.name = name;
    }


    private void msg(){

        System.out.println("This private method");
    }


}

public class AccessPrivateConstractor {


    public static void main(String[] args) {

        try {
            Class<?> ob = Class.forName("com.mycompany.test.Example");

            var constractord = ob.getDeclaredConstructor();
            constractord.setAccessible(true);
            Example ex = (Example) constractord.newInstance();


            var constractor = ob.getDeclaredConstructor(int.class, String.class);
            constractor.setAccessible(true);
            Example example = (Example) constractor.newInstance(500, "Rkib");



            Method method = ob.getDeclaredMethod("msg");
            method.setAccessible(true);
            method.invoke(example);

            Field idfield = ob.getDeclaredField("id");
            idfield.setAccessible(true);

            Field namefield = ob.getDeclaredField("name");
            namefield.setAccessible(true);

            System.out.println("ID "+ idfield.get(example));
            System.out.println("ID "+ namefield.get(example));



        } catch (Exception e) {
            System.out.println(e);
        }




    }



}

package com.mycompany.test;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Demo{


   private Demo() {
       System.out.println("This non-paramitarized constractor called..");
   }

   private int id;
   private String name;

    private Demo(int id, String name) {
       System.out.println("This paramitarized constractor called..");

        this.id = id;
        this.name = name;
    }


private void msg(){
    System.out.println("This is private method.");
}



}

public class PrivateAccess {


    public static void main(String[] args)  {

        try {
            Class<?> ob = Class.forName("com.mycompany.test.Demo");

            var non_constractor = ob.getDeclaredConstructor();
            non_constractor.setAccessible(true);
            Demo demo = (Demo) non_constractor.newInstance();


            var para_meter_constractor = ob.getDeclaredConstructor(int.class, String.class);
            para_meter_constractor.setAccessible(true);
            Demo demo1 = (Demo) para_meter_constractor.newInstance(100, "Sajeeb");


            Field idField = ob.getDeclaredField("id");
            idField.setAccessible(true);
            System.out.println("This is id: "+idField.get(demo1));

            Field nameField = ob.getDeclaredField("name");
            nameField.setAccessible(true);
            System.out.println("This is name: "+ nameField.get(demo1));

            Method method = ob.getDeclaredMethod("msg");
            method.setAccessible(true);
            method.invoke(demo);




        } catch (Exception e) {
            System.out.println(e);
        }


    }
}

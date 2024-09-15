package com.mycompany.test;

import com.sun.security.jgss.GSSUtil;

public class ObjectCloning implements Cloneable{


    int id;
    String name;
    String address;

// object cloning are three type
// one is shallow copy
// thwo is deep copy
// three is cloning copy

//obj1 = obj2 is a shallow copy
//obj1.id = obj2.id is deep copy
//ob2 = obj1.clone() is a cloning copy



    public ObjectCloning(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public ObjectCloning() {
    }

//    @Override
//    public String toString() {
//        return "ObjectCloning{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                '}';
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {


        ObjectCloning orginal = new ObjectCloning(1, "Sajeeb", "Dhaka");
        System.out.println("This is orginal "+orginal);
        ObjectCloning equal = orginal; //this is shallow copy

        ObjectCloning copy = (ObjectCloning) orginal.clone();
        if (orginal == copy){
            System.out.println("Hello i'm orgnial and equl are same memory location");
        }else {
            System.out.println("hello i'm not same location orginal or clone()");
        }

        System.out.println("Equal==================="+equal);



        try {
            System.out.println("This is copy "+ copy);

        }catch (Exception e){
            System.out.println(e);
        }


        System.out.println("------------------------------------"+orginal);
        System.out.println("------------------------------------"+equal);
        System.out.println("------------------------------------"+copy);


    }
}

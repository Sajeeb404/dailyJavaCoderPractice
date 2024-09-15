package com.mycompany.test;

public class WrapperClassExample {


//    all the primitive type to make Object type this class known as a wrapper class;
//    autoboxing and unboxing know in wrapper class
//    when primitive type convert into object type automiticaly it's know autoboxing.
//    when object type convert int primitve type automically it's knonw unboxing
//    exmaple
//

    public static void main(String[] args) {

//    autoboxing
        int b =20;
        Customint ci = new Customint(b);

        Integer c = b;
        System.out.println(c);

//        unboxing

        Integer a = 30;
        int d = a;

        System.out.println(d);






    }


}




class Customint{

    private int a;

    public Customint(int a) {
        this.a = a;
    }

    public Customint() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return Integer.toString(a);
    }


}


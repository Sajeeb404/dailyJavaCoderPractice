package com.mycompany.test;

public class JavaInheritanceExample {


    int b;

int b(){

    int b;
    b=500;
    return 0;
}


}


class Aa{


    public Aa() {
        System.out.println("This is parent class constructor");
    }

    {
        System.out.println("this is parent class initializar block");
    }


}

class Ba extends Aa{

    {
        System.out.println("this is child class initializar block");
    }


    public Ba() {
        System.out.println("This is child class constructor");
    }


    public static void main(String[] args) {
        Ba bb = new Ba();

    }
}




class Employee{

    float salary= 40000;


}

class Programmer extends Employee{


    int bounus = 10000;

    public static void main(String[] args) {
        Employee em = new Employee();

        Programmer programmer = new Programmer();

        System.out.println("Programmer salary is "+programmer.salary);
        System.out.println("Programmer bonous is "+programmer.bounus);
        System.out.println("Programmer total salary is "+ (programmer.bounus + programmer.salary));
    }

}

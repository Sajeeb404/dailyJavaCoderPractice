package com.mycompany.test;


public class InstansOfOperExam {




    public static void main(String[] args) {

        int ins = 20;
        String s ="Animal";

        Animal a = new Animal();


        Animal dg = new Dog();
        System.out.println(dg instanceof Cat);





    }


}

class Animal{

    void sound(){
        System.out.println("This animal sound more loudlly");
    }


}

class Dog extends Animal implements Cat{

    @Override
    void sound() {
        System.out.println("Dog sound bow bow");
    }
}

interface Cat{

}

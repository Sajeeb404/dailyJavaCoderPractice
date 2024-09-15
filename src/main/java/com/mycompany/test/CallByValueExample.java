package com.mycompany.test;




public class CallByValueExample {

    int data = 50;

    void change(int data){
        data = data+50;
    }

    public static void main(String[] args) {
        CallByValueExample d = new CallByValueExample();

        d.change(50);

        System.out.println(d.data);
    }
}


class CallbyReferance{

    int data = 100;


    void change (CallbyReferance op){
        op.data = op.data+10;
    }

    public static void main(String[] args) {
        CallbyReferance cl = new CallbyReferance();

        cl.change(cl);
        System.out.println(cl.data);
    }
}

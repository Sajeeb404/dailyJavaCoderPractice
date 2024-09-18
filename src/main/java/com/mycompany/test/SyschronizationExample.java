package com.mycompany.test;

public class SyschronizationExample {


    /*Synchronization in Java is the capability to control the access of
    multiple threads to any shared resource.

Java Synchronization is better option where we want to allow only
one thread to access the shared resource.


Why use Synchronization?
The synchronization is mainly used to

To prevent thread interference.
To prevent consistency problem.

*/

    public static void main(String[] args) {

//        Table obj = new Table();
//
//        MyThread1 t1 = new MyThread1(obj);
//        MyThread2 t2 = new MyThread2(obj);
//
//        t1.start();
//        t2.start();

//        MyThread1 t3 = new MyThread1(new Table());
//        MyThread2 t4 = new MyThread2(new Table());
//
//        t3.start();
//        t4.start();


//        synchronized method by using annonymous class
//        Table obj = new Table();
//
//        Thread t1 = new Thread(){
//            @Override
//            public void run() {
//                obj.printTable(5);
//            }
//        };
//
//        Thread t2 = new Thread(){
//            @Override
//            public void run() {
//                obj.printTable(100);
//            }
//        };
//
//
//        t1.start();
//        t2.start();


//        Synchronized Block in Java

//        Table1 obj = new Table1();
//
//        Thread1 t1 = new Thread1(obj);
//        Thread2 t2 = new Thread2(obj);
//
//
//        t1.start();
//        t2.start();


//        Synchronized Block Example Using Anonymous Class

//Table1 obj = new Table1();

//Thread t1 = new Thread(){
//
//    @Override
//    public void run() {
//        obj.printTable(3);
//    }
//};
//
//Thread t2 = new Thread(){
//    @Override
//    public void run() {
//        obj.printTable(4);
//    }
//};
//
//t1.start();
//t2.start();

//
//Sender sender = new Sender();
//SenderWThreads sender1 = new SenderWThreads("Hola ", sender);
//SenderWThreads sender2 = new SenderWThreads("Welcome to Sajeeb house ", sender);
//sender1.start();
//sender2.start();
//
//        try {
//            sender1.join();
//            sender2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


//        Static Synchronization


//
//        MyT1 t1 = new MyT1();
//        MyT2 t2 = new MyT2();
//        MyT3 t3 = new MyT3();
//        MyT4 t4 = new MyT4();
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();


//        Example of static synchronization by Using the anonymous class

//        Thread t1 = new Thread(){
//            @Override
//            public void run() {
//                TableStatic.printTable(1);
//            }
//        };
//        Thread t2 = new Thread(){
//            @Override
//            public void run() {
//                TableStatic.printTable(10);
//            }
//        };
//        Thread t3 = new Thread(){
//            @Override
//            public void run() {
//                TableStatic.printTable(100);
//            }
//        };
//        Thread t4 = new Thread(){
//            @Override
//            public void run() {
//                TableStatic.printTable(1000);
//            }
//        };
//
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();

//
//        Customer c = new Customer();
//
//        new Thread(){
//            @Override
//            public void run() {
//                c.withDraw(15000);
//            }
//        }.start();
//
//        new Thread(){
//            @Override
//            public void run() {
//                c.deposit(20000);
//            }
//        }.start();
//
//


//        SharedResource sharedResource = new SharedResource();
//        new Thread(()-> {
//
//            try {
//                for (int i =0; i < 10; i++) {
//                    sharedResource.increment();
//                }
//            } catch (Exception e) {
//                Thread.currentThread().interrupt();
//            }
//
//
//        }).start();
//
//        new Thread(()->{
//            try {
//                for (int i = 0; i < 10; i++) {
//                    sharedResource.decrement();
//                }
//            } catch (Exception e) {
//                Thread.currentThread().interrupt();
//            }
//        }).start();

//        TestInterruptingThread1 t1 = new TestInterruptingThread1();
//        t1.start();
//
//
//            t1.interrupt();

//    TestInterruptingThread2 t1 = new TestInterruptingThread2();
//    TestInterruptingThread2 t2 = new TestInterruptingThread2();
//    t1.start();
//    t1.interrupt();
//    t2.start();
//
//    }


        /*Key Points about Thread Interruption
Interruption Mechanism:

The interrupt() method is a way to signal a thread that it should stop what it's doing. However, this mechanism only works if the thread is designed to check for interruptions.
Effect of wait() and sleep():

If a thread is currently waiting (via wait()) or sleeping (via sleep()), and it is interrupted, it will throw an InterruptedException.
This allows the thread to handle the interruption appropriately, often in a catch block.
Without wait() or sleep():

If a thread is running and not blocked by wait() or sleep(), calling interrupt() will not stop the thread immediately or throw an exception.
The thread will continue executing until it checks its interrupt status or completes its task.
Example Explanation
Using the example we discussed earlier:

When the thread is executing the loop without wait() or sleep(), calling interrupt() will set the interrupted status but will not affect the thread until it checks Thread.currentThread().isInterrupted().

When the thread is in Thread.sleep(1000) and is interrupted, it will throw InterruptedException, allowing the thread to handle it (e.g., by exiting the loop or cleaning up).

Summary
To Handle Interrupts: If you want a thread to respond to interrupts, you should include blocking methods like wait() or sleep(), which will allow the thread to react when interrupted.
Thread Behavior: If not using these blocking methods, the thread will continue executing and must have its own logic to check for interruptions.
This cooperative mechanism allows for a more graceful shutdown of threads rather than forcibly terminating them.*/


//        Reentrant Monitor in Java

//        A Reentrant Monitor is a synchronization construct that allows a thread to acquire the
//        same lock multiple times without causing a deadlock. It is a type of
//        monitor that provides the following key characteristics:

        Reentrant t = new Reentrant();

        new Thread(){
            @Override
            public void run() {
                t.m();
            }
        }.start();

    }
}




class Reentrant{
    public synchronized void m(){
        n();
        System.out.println("this is m() method");
    }

    public synchronized void n(){
        System.out.println("this is n() method");
    }
}




class TestInterruptingThread2 extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 2; i++) {
            if (Thread.interrupted()){
                System.out.println("code for interrupted thread");
            }else {
                System.out.println("code for normal thread");
            }

        }
    }
}


class TestInterruptingThread1 extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("task");

        }catch (InterruptedException e){
//            throw new RuntimeException("Thread interrupted..."+e);
            System.out.println("Exception handled \n"+ e);
        }
        System.out.println("thread is running...");

    }
}



class SharedResource{

    private int count = 0;
    private final int LIMIT = 5;

    public synchronized void increment() throws InterruptedException {

        while (count >= LIMIT){
            wait();
        }
        count++;
        System.out.println("Count incremented to: "+ count);
        notify();

    }


    public synchronized void decrement() throws InterruptedException {

        while (count<=0){
            wait();
        }

        count--;
        System.out.println("Count dd to: "+ count);
        notify();
    }




}



class Customer{

    int amount = 10000;

    synchronized void withDraw(int amount){

        System.out.println("Going to withdraw");

        if (this.amount <amount){
            System.out.println("Less blance: waiting for deposit");
            try {wait();}catch (Exception e){}
        }
        this.amount -= amount;
        System.out.println("Withdraw completed...");
    }

    synchronized void deposit(int amount){
        System.out.println("going to deposit...");
        this.amount +=amount;
        System.out.println("deposit completed....");
        notify();
    }



}



class TestDeadLockExample{

    //        Deadlock in Java

/*Deadlock in Java is a part of multithreading. Deadlock can
occur in a situation when a thread is waiting for an object lock,
that is acquired by another thread and second thread is waiting for
an object lock that is acquired by first thread. Since, both
threads are waiting for each other to release the lock, the
condition is called deadlock.*/


//    public static void main(String[] args) {
//        final String r1 = "resource1";
//        final String r2 = "resource2";
//
//
//        Thread t1 = new Thread(){
//            @Override
//            public void run() {
//                synchronized (r1){
//                    System.out.println("This is " + r1+ " block, and it's try to enter "+ r2 +" block");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    synchronized (r2){
//                    System.out.println("This is " + r2+ " block, and this block is finished");
//                    }
//
//                }
//            }
//        };
//
//
//        Thread t2 = new Thread(){
//
//            @Override
//            public void run() {
//                synchronized (r2){
//                    System.out.println("This is " + r2+ " block, and it's try to enter "+ r1 +" block");
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                    synchronized (r1){
//                        System.out.println("This is " + r1+ " block, and this block is finished");
//                    }
//                }
//            }
//        };
//
//        t1.start();
//        t2.start();
//
//
//
//    }



}






class TableStatic{

    synchronized static void printTable(int n){

        for (int i = 1; i <= 10; i++) {
            System.out.println(i*n);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class MyT1 extends Thread{
    @Override
    public void run() {
        TableStatic.printTable(1);
    }
}

class MyT2 extends Thread{
    @Override
    public void run() {
        TableStatic.printTable(10);
    }
}

class MyT3 extends Thread{
    @Override
    public void run() {
        TableStatic.printTable(100);
    }
}

class MyT4 extends Thread {
    @Override
    public void run() {
        TableStatic.printTable(1000);
    }
}


class Sender{

    public void SenderMsg(String msg){
        System.out.println("\nSendeing a Message: "+ msg);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n"+msg+"Sent");
    }
}

class SenderWThreads extends Thread{

    private String msg;
    Sender sd;

    public SenderWThreads(String msg, Sender sd) {
        this.msg = msg;
        this.sd = sd;
    }

    @Override
    public void run() {
        synchronized (sd){
            sd.SenderMsg(msg);
        }
    }
}




class Table1 {

   void printTable(int n){
       synchronized (this){
           for (int i = 1; i <= 5; i++) {
               System.out.println(n*i);
           }
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
    }

}


class Thread1 extends Thread{

    Table1 t;
    public Thread1(Table1 t) {
        this.t = t;
    }
    @Override
    public void run() {
       t.printTable(5);
    }
}


class Thread2 extends Thread{
    Table1 t;

    public Thread2(Table1 t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}








class Table{

  synchronized void printTable(int n){

        for (int i = 1; i <= 5; i++) {
            System.out.println(i*n);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread1 extends Thread{

    Table t;

    public MyThread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
       t.printTable(5);
    }
}

class MyThread2 extends Thread{
Table t;

    public MyThread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}




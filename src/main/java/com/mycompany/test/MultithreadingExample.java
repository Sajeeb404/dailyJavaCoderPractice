package com.mycompany.test;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadingExample {



    /*Multithreading in Java is a process of executing multiple threads simultaneously.*/


/*
1. New State
Description: A thread is in this state when it is created but not yet started. It has not
begun its execution.
Transition: A thread moves from the new state to the active state when the start() method
is invoked on the thread instance.



Runnable vs. Running States
Runnable State:

Think of it as threads waiting in line (at the door) to enter a room (the CPU).
When multiple threads are ready to run but waiting for their turn, they are in the Runnable state.
The thread scheduler is responsible for deciding which thread gets to enter the room next.
Running State:

This is when a thread is actually inside the room (the CPU) and executing its task.
Only one thread can be in the Running state on a single CPU core at any given time.
Once the thread finishes its task, its time slice expires, or it yields control, it goes
back to the Runnable state, allowing other threads to have a chance to run.
Example Scenario
You have two threads (let's call them Thread A and Thread B).
Both are ready to run (in the Runnable state) and waiting to be scheduled by the thread scheduler.
The scheduler allows Thread A to run. Now, Thread A is in the Running state, actively executing its code.
While Thread A is running, Thread B remains in the Runnable state, waiting for its turn.
After some time, if the scheduler preempts Thread A (or it voluntarily yields), Thread A will return to
the Runnable state, and the scheduler may then choose Thread B to enter the Running state.
Summary
Runnable: Ready to run, waiting for CPU time.
Running: Actively executing on the CPU.
This distinction is essential for understanding how multithreading works and how the CPU allocates
time to different threads. If you have more questions or need further clarification, feel free to ask!





There are two ways to create a thread:

By extending Thread class
By implementing Runnable interface.


//Working of the Java Thread Scheduler
//Thread Scheduler in Java
1 First come first Serve Scheduling
2 Time-slicing scheduling
3 Preemptive priority Scheduling



*/


    public static void main(String[] args)  {

//        ExampleTread t1 = new ExampleTread();
//        ExampleTread t2 = new ExampleTread();
//        t1.start();
//        t2.start();

//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread1 = new Thread(myRunnable);
//        Thread thread2 = new Thread(myRunnable);
//
//        thread1.start();
//        thread2.start();


//        ThreadExmpleRun myrun = new ThreadExmpleRun();
//        Thread t1 = new Thread(myrun);
//        Thread t2 = new Thread(myrun);
//        Thread t3 = new Thread(myrun);
////        t3.setPriority(Thread.MAX_PRIORITY);
////        t2.setPriority(8);
////        t1.setPriority(6);
//        t3.start();
//        t2.start();
//        t1.start();

//        System.out.println(t1.getState());
//        System.out.println(t2.getState());
//        t1.start();
//        t2.start();


        /*Let's understand the working of the Java thread scheduler.
        Suppose, there are five threads that have different arrival
        times and different priorities. Now, it is the responsibility
        of the thread scheduler to decide which thread will get the CPU first.

    The thread scheduler selects the thread that has the highest priority,
    and the thread begins the execution of the job. If a thread is already
    in runnable state and another thread (that has higher priority) reaches
    in the runnable state, then the current thread is pre-empted from the processor,
     and the arrived thread with higher priority gets the CPU time.

    When two threads (Thread 2 and Thread 3) having the same priorities and arrival time,
    the scheduling will be decided on the basis of FCFS algorithm. Thus, the thread that
     arrives first gets the opportunity to execute first.

     Example of the sleep() Method in Java: When the sleeping time is -ive
    The following example throws the exception IllegalArguementException
    when the time for sleeping is negative.

     */

//ThreadSleepMethod threadSleepMethod = new ThreadSleepMethod();
//
//Thread t1 = new Thread(threadSleepMethod);
//Thread t2 = new Thread(threadSleepMethod);
//
//t1.start();
//t2.start();

//        try {
//
//            for (int i = 1; i < 5; i++) {
//                Thread.sleep(1000);
//                System.out.println(i);
//            }
//
//        }catch (Exception e){
//            System.out.println(e);
//        }


//        ThreadSleepMethod threadSleepMethod = new ThreadSleepMethod();
//
//        Thread t1 = new Thread(threadSleepMethod);
//
//        try {
//        t1.start();
//        t1.start();
//
//        }catch (IllegalThreadStateException e){
//            System.out.println(e);
//        }



        /*When you call the run() method directly, it behaves like a regular method call,
        executing in the current thread, rather than starting a new
        thread. Here's a recap of how it works:*/

//        Myrunnable myrunnable = new Myrunnable();
//        Thread t1 = new Thread(myrunnable);
//        t1.run();
//        System.out.println(Thread.currentThread().getName() +" is running");


//

        /*Using join()
Analogy: Imagine you have two workers: Worker A and Worker B.
Worker A (the thread calling join()) says to Worker B (the thread being joined),
 “You finish your work first, and then I will continue my work.” Worker A will wait
  and not do anything else until Worker B is done.
Outcome: Worker A knows exactly when Worker B has finished, and only then does Worker
 A proceed with its tasks.

Using sleep()
Analogy: Now, imagine Worker A says, “I’m going to take a nap for one minute.”
Worker A doesn’t care about what Worker B is doing during this time. After one minute,
Worker A wakes up and continues working, regardless of whether Worker B has finished or not.
Outcome: Worker A is unaware of Worker B’s status while napping and simply resumes work
after the sleep period is over.Summary of the Differences

join():
Communication: Direct communication between threads. One thread explicitly waits for another to complete before proceeding.
Control: The calling thread is blocked until the other thread finishes its execution.
sleep():
Independence: The sleeping thread pauses its execution without concern for other threads. It does not wait for any thread to finish.
Time-Based: It simply resumes after a specified time, regardless of what other threads are doing.*/


//        MyThread t1 = new MyThread();
//
//        YourThread t2 = new YourThread();
//
//        t1.start();
//

//
//        TestJoinMethod testJoinMethod = new TestJoinMethod();
//
//        Thread t1 = new Thread(testJoinMethod);
//        Thread t2 = new Thread(testJoinMethod);
//        Thread t3 = new Thread(testJoinMethod);
//
//
//        t1.start();
//
//       t2.start();
//
//        try {
//            t2.join();
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        t3.start();


//        NamingThreadExample namingThreadExample = new NamingThreadExample();
//
//        Thread t1 = new Thread(namingThreadExample, "Thread One");
//        Thread t2 = new Thread(namingThreadExample, "Thread Two");
//        Thread t3 = new Thread(namingThreadExample, "Thread Three");
//
//        t1.start();
//        t2.start();
//        t3.start();
//        Thread t4 = new Thread(namingThreadExample);
//        Thread t5 = new Thread(namingThreadExample);
//        Thread t6 = new Thread(namingThreadExample);
//
//
//        t4.setName("Hello");
//        t5.setName("Java");
//        t6.setName("World");
//
//        t4.start();
//        t5.start();
//        t6.start();
/*Setting Daemon Threads: You can set a thread as a daemon by calling the setDaemon(true) method before starting the
thread. This must be done before the thread is started; otherwise, it will throw an IllegalThreadStateException.*/



//        DaemonThread daemonThread = new DaemonThread();
//        Thread t1 = new Thread(daemonThread);
//        Thread t2 = new Thread(daemonThread);
//        Thread t3 = new Thread(daemonThread);
//
//        t1.setDaemon(true);
//
//        t1.start();
//        t2.start();
//        t3.start();

//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        for (int i = 1; i <=9 ; i++) {
//            ThreadPoolExample task = new ThreadPoolExample("Task "+ i);
//            executorService.submit(task);
//        }
//
//        executorService.shutdown();
//
//

//        ThreadGroupExampl runnable = new ThreadGroupExampl();
//        ThreadGroup tg = new ThreadGroup("Parent ThreadGroup");
//
//        Thread t1 = new Thread(tg, runnable, "one");
//        Thread t2 = new Thread(tg, runnable, "two");
//        Thread t3 = new Thread(tg, runnable, "three");
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//        System.out.println("Thread Group Name: "+ tg.getName());
//        tg.list();


//        ThreadGroup tg = new ThreadGroup("The parent group of Threads");
//        ThreadNew th1 = new ThreadNew("first", tg);
//        ThreadNew th2 = new ThreadNew("second", tg);
//
//        System.out.println(new ThreadNew("third", tg));

//        System.out.println("The total number of active threads are: "+ tg.getName());

//        Runtime r = Runtime.getRuntime();
//
//        r.addShutdownHook(new ShutDownHoo());
//
//        System.out.println("Now main sleeping... press ctrl+c to exit");
//        try{Thread.sleep(10000);}catch (Exception e) {}

//        for shutdown
//        try {
//            Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }



//        for restart
//        try {
//            Runtime.getRuntime().exec("shutdown -r -t 0");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        Java Runtime availableProcessors()
        try {
            System.out.println(Runtime.getRuntime().availableProcessors());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }



}


class ShutDownHoo extends Thread{

    @Override
    public void run() {
        System.out.println("ShoutdounHook is call");
    }
}


class ThreadNew extends Thread{

    ThreadNew(String tName, ThreadGroup tg){
        super(tg, tName);
        start();
    }


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
               Thread.sleep(5);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class ThreadGroupExampl implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }




}



class ThreadPoolExample implements Runnable{

    private final String name;

    public ThreadPoolExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println("Executing task: "+ name);

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println("Task completed: "+ name);

    }


}

class DaemonThread implements Runnable{

    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()){
            System.out.println("this is daemon thread");
        }else {
            System.out.println("this user thread");
        }
    }



}



class NamingThreadExample implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }


}



class TestJoinMethod implements Runnable{

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " = "+i);
        }
    }
}



class MyThread extends Thread{


    @Override
    public void run() {
        System.out.println("hello i'm MyThread");
        for (int i = 1; i <= 50; i++) {

            if (i == 6){
                try {
                    YourThread d = new  YourThread();
                    d.start();
                    d.join();
                }catch (Exception e){
                    System.out.println(e);
                }
            }
            System.out.println("Hello "+i);
        }


    }


}


class YourThread extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);

        }
    }
}






class Myrunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}






class ThreadSleepMethod implements Runnable{

    @Override
    public void run() {

        for (int i = 1; i <5 ; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }


    }
}



class ThreadExmpleRun  implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Now the thread is running ...");
    }

}



//class MyRunnable implements Runnable {
//    @Override
//    public void run() {
//        System.out.println(Thread.currentThread().getName() + " is running.");
//        // Additional code for the thread's task can go here.
//    }
//}



class ExampleTread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState() + " is running.");
    }
}





package com.mycompany.test;

import java.util.Scanner;

public class RepeatedAdditionQuiz {
    
    
    int numberOne = (int)(Math.random() * 10);
    int numberTwo = (int)(Math.random() * 10);
 
    Scanner inptu = new Scanner(System.in);
    
    
    public void m1(){
        System.out.println("What is the answer " + numberOne +" + "+ numberTwo + " = ");
        
        int answer = inptu.nextInt();
        
        while (numberOne + numberTwo != answer) {
            System.out.println("Please try again this answer is wrong");
            answer = inptu.nextInt();
        }
            System.out.println("You got it");
        
        
    }
    
    
    
    
   
}

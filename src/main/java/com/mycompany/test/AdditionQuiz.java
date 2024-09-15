/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class AdditionQuiz {
    
       Scanner input = new Scanner(System.in);  
    
    public void additions(int numberOne, int numberTwo){
        
        System.out.println("What is " + numberOne + " + " + numberTwo + "?" ); 
        
        int answer = input.nextInt();
        System.out.println("The answer is " + numberOne + " + " + numberTwo + " = " + (numberOne + numberTwo == answer));   



        



    
    }




    
    
}

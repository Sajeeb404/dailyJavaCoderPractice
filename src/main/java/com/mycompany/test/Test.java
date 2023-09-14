/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Test {

    public static void main(String[] args) {
        
     
         int numbme1 = (int) (System.currentTimeMillis() % 10);
         int numbme2 = (int) (System.currentTimeMillis() / 7 % 10);
        AdditionQuiz aq = new AdditionQuiz();
        
        aq.additions(numbme1, numbme2);
        
    }
    
    
}

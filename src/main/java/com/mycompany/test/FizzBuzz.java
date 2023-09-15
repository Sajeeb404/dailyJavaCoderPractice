
package com.mycompany.test;
public class FizzBuzz {
    
    
    public void fixxbux(){     
        for (int i = 0; i <= 100; i++) {
              if (i % 3 == 0) {
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }
            
        }
    }
    
}



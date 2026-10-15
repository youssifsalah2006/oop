/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication175;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication175 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Scanner S = new Scanner (System.in);
        int number = S.nextInt();
        if (number % 3 ==0 && number % 5 ==0){
            System.out.println ("Divisible by 3 and 5" );
           
        }
        else if (number % 3 ==0){
              System.out.println ("Divisible by 3" );
           
            
        }
        else if (number % 5 ==0){
              System.out.println ("Divisible by 5" );
        }
        else {
              System.out.println ("not Divisible by 3 or 5" );
            
        }
            
    }
    
}

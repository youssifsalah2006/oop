/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication182;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication182 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner S = new Scanner (System.in);
     System.out.println("enter a nuber :");
     int num = S.nextInt();
     int reverse = 0;
     while (num > 0){
         int digit = num % 10;
         reverse = reverse * 10 + digit;
         num=num/10;
     }
     System.out.println("the reverse is " + reverse);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication38;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class JavaApplication38 {
    private static double radius;

    public static double cylindervolume (double dvalue, double hvalue){
        double redius = dvalue / 2.0;
        return Math.PI * Math.pow(redius,2)*hvalue;
    }
    public static void main(String[] args) {
         System.out.println ("thevolume =");
         Scanner S=new Scanner(System.in); 
        double dvalue =S.nextDouble(); 
        double  hvalue =S.nextDouble(); 
      
        System.out.println (cylindervolume(dvalue, hvalue));
        
        
    }

   
}


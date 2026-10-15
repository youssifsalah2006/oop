/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication181;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication181 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

       
    }
}
    


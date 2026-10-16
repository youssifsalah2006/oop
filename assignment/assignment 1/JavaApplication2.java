/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author yossi
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);

        final double TAX_RATE = 0.14;

        double price = input.nextDouble();
        int quantity = input.nextInt();

        double subtotal = price * quantity;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        System.out.printf("Subtotal = %.2f%n", subtotal);
        System.out.printf("Tax = %.2f%n", tax);
        System.out.printf("Total = %.2f%n", total);
    }
}
        
   
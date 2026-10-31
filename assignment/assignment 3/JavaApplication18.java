/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author yossi
 */
public class JavaApplication18 {

   

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int largest = 0;
        int smallest = 0;
        int count = 0;
        int sum = 0;

        System.out.print("Enter a positive number (0 to stop): ");
        n = input.nextInt();

        while (n != 0) {
            if (count == 0) {
                largest = n;
                smallest = n;
            } else {
                if (n > largest) {
                    largest = n;
                }

                if (n < smallest) {
                    smallest = n;
                }
            }

            sum += n;
            count++;

            System.out.print("Enter a positive number (0 to stop): ");
            n = input.nextInt();
        }

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("Largest: " + largest);
            System.out.println("Smallest: " + smallest);
            System.out.printf("Average: %.2f%n", average);
        } else {
            System.out.println("No numbers were entered.");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication23;

import java.util.Scanner;

/**
 *
 * @author yossi
 */
import java.util.Scanner;

public class JavaApplication23 {

    

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = new int[6];

        System.out.print("Enter 6 numbers: ");

      
        for (int i = 0; i < 6; i++) {
            nums[i] = input.nextInt();
        }

      
        System.out.print("Reverse: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }

       
        int sum = 0;

        for (int i = 0; i < 6; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i];
            }
        }

        System.out.println("\nSum of even numbers: " + sum);

     
        int count = 0;

        for (int i = 0; i < 6; i++) {
            if (nums[i] > nums[0]) {
                count++;
            }
        }

        System.out.println("Greater than the first number: " + count);
    }
}


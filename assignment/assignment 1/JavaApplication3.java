/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author yossi
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double average = (a + b + c) / 3.0;

        System.out.println(Math.round(average));
        System.out.printf("%.2f%n", average);
    }
}


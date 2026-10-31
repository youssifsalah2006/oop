/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author yossi
 */
public class JavaApplication13 {

   
  

    public static double coneVolume(double dValue, double hValue) {
        double r = dValue / 2.0;

        return (1.0 / 3.0) * Math.PI
                * Math.pow(r, 2) * hValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter diameter: ");
        double diameter = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        double volume = coneVolume(diameter, height);

        System.out.printf("Volume: %.2f%n", volume);

    
    }
}

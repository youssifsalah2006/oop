/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author yossi
 */
public class JavaApplication12 {

   

    public static double getDouble(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextDouble();
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        double celsius = getDouble(S, "Enter temperature in Celsius: ");
        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);

    
    }
}

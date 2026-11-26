/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication28;

/**
 *
 * @author yossi
 */
import java.util.Scanner;

public class JavaApplication28 {

    /**
     * @param args the command line arguments
     */
   


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        float[] values = new float[n];

        System.out.print("Enter the array elements: ");

        for (int i = 0; i < n; i++) {
            values[i] = input.nextFloat();
        }

        ArrayStatistics stats = new ArrayStatistics();

        stats.findMaxMin(values);

        System.out.println("Maximum value: "
                + stats.getMaxValue());

        System.out.println("Minimum value: "
                + stats.getMinValue());

    }
}

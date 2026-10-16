/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author yossi
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int days = input.nextInt();

        int weeks = days / 7;
        int remainingDays = days % 7;

        System.out.println(weeks + " weeks and "
                + remainingDays + " days");
    }
}

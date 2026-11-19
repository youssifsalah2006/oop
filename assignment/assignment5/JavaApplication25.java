/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication25;

/**
 *
 * @author yossi
 */
import java.util.Scanner;
        
public class JavaApplication25 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] grid = new char[3][4];

        System.out.println("Enter 3 words (4 letters each):");

        for (int i = 0; i < 3; i++) {
            String word = input.next();

            for (int j = 0; j < 4; j++) {
                grid[i][j] = word.charAt(j);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Columns: ");

        for (int j = 0; j < 4; j++) {
            String columnWord = "";

            for (int i = 0; i < 3; i++) {
                columnWord = columnWord.concat(
                    String.valueOf(grid[i][j])
                );
            }

            System.out.print(columnWord + " ");
        }

        System.out.println();
        
        int vowels = 0;
        String vowelLetters = "aeiou";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                if (vowelLetters.indexOf(grid[i][j]) != -1) {
                    vowels++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
    }
}


 

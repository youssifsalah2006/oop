/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication24;

/**
 *
 * @author yossi
 */ 
import java.util.Scanner;
public class JavaApplication24 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char[][] board = new char[3][3];

        int xCount = 0;
        int oCount = 0;

        System.out.print("Enter 9 cells (X or O): ");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = input.next().charAt(0);

                if (board[i][j] == 'X') {
                    xCount++;
                } else {
                    oCount++;
                }
            }
        }

  
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("X count: " + xCount);
        System.out.println("O count: " + oCount);

        boolean fullRow = false;

        for (int i = 0; i < 3; i++) {

            if (board[i][0] == 'X' &&
                board[i][1] == 'X' &&
                board[i][2] == 'X') {

                fullRow = true;
            }
        }

        if (fullRow) {
            System.out.println("X has a full row");
        } else {
            System.out.println("No full X row");
        }
    }
}

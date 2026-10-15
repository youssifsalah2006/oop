/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication179;

import java.util.Scanner;
import static javafx.scene.input.KeyCode.S;

/**
 *
 * @author Student
 */
public class JavaApplication179 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner S = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = S.next().charAt(0);

        if (ch>='0'&& ch<='9') {
            System.out.println("Digit");
        } else if (( ch>='A' && ch<'Z')  || (ch>= 'A' && ch<'z' )) {
            System.out.println("Letter");
        } else {
            System.out.println("Other");
        }

     
    }
}
    
    


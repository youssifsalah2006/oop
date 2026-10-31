/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication16;

import java.util.Scanner;

/**
 *
 * @author yossi
 */
public class JavaApplication16 {

   

    public static String maskEmail(String email) {
        email = email.trim();

        int at = email.indexOf('@');

        if (at == -1) {
            return "Invalid Email";
        }

        String username = email.substring(0, at);
        String domain = email.substring(at + 1).toLowerCase();

        if (username.length() <= 2) {
            return username + "@" + domain;
        }

        String masked = username.substring(0, 2);

        for (int i = 2; i < username.length(); i++) {
            masked += "*";
        }

        return masked + "@" + domain;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = S.nextLine();

        System.out.println(maskEmail(email));

        
    }
}

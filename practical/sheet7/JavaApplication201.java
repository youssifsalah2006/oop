/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication201;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication201 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your account number:");
        String accnum=input.next();
         System.out.print("enter your account HOLDER:");
        String acchold=input.next();
         System.out.print("enter your account balance:");
        double bal=input.nextDouble();
        BankAccount account = new BankAccount(accnum,acchold,bal);
        System.out.print("enter deposet amount:");
        double dep=input.nextDouble();
 account.deposit(dep);
  System.out.print("enter withdraw amount:");
        double with=input.nextDouble();
 account.withdraw(with);
    System.out.println("account number: "+ account.getaccountnumber());
     System.out.println("account holder: "+ account.getaccountholder());
      System.out.println("account balance: "+ account.getbalance());
    }
    
}
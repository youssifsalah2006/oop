/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication27;

/**
 *
 * @author yossi
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {

        BankAccount account = new BankAccount("12345", 1000);

        account.deposit(500);

        account.withdraw(300);
        
        System.out.println("Account Number: "
                + account.getAccountNumber());

        System.out.println("Final Balance: "
                + account.getBalance());
    }
}

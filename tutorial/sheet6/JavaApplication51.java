/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication51;

import java.util.Scanner;

/**
 *
 * @author STUDENT
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner S = new Scanner (System.in);
        CashRegister c = new CashRegister();
        System.out.print("item1");
       
         c.additem(S.nextDouble());
        System.out.print("item2");
         c.additem(S.nextDouble());
       
       
         System.out.println (c.getitemcount()+" "+c.getTotalprice());
         c.clear();
          System.out.println (c.getitemcount()+" "+c.getTotalprice());
       
    }
}
     

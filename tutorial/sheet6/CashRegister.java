/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication51;

/**
 *
 * @author STUDENT
 */
public class CashRegister {
     private int itemcount;
      private double totalprice;
  
   public void additem (double price){
       itemcount ++;
       totalprice+=price;
   }
   public void clear()
   {
        itemcount =0;
        totalprice =0;
   }
       public int getitemcount()
       {
           return itemcount;
       }

        public double getTotalprice() {
            return totalprice;
        }

        public void setItemcount(int itemcount) {
            this.itemcount = itemcount;
        }

        public void setTotalprice(double totalprice) {
            this.totalprice = totalprice;
            
        }
}

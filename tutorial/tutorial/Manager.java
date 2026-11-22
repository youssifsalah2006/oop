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
public class Manager extends Employee  {
    private String department;
      private double allowance;

    public Manager(String name, int id, double salary ,String department,double allowance) {
        super(name, id, salary);
         this.department= department;
        this.allowance= allowance;
    }
      public String getDepartment () {
         return department;
}
        public void setDepartment (String department) {
         this.department= department;
        }
         public double getAllowance () {
         return allowance;
         }
         
          public void setAllowance (double allowance) {
         this.allowance= allowance;
          }
          public double calcateBonus (){
              return getSalary ()*0.20;
              
          }
          public void displayInfo(){
              super.displayinfo();
                 System.out.println("Department :"+ department);
               System.out.println("Allowance :"+ allowance);
              
              
          }
}
         

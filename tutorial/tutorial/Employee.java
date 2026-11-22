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
public class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name ,int id,double salary){
        this.name= name;
        this.id= id;
        this.salary=salary;
        
        
    }
    public void setName (String name) {
         this.name= name;
    }
    
    public String getName () {
        return name;
    
}
     public void setId (int id) {
         this.id= id; 
}
     
        public int getId () {
        return id; 
     
        }
             
    public void setSalary (double Salary) {
         this.salary= salary;
    }
    
      
        public double getSalary () {
        return salary; 
     
        }
        public double calculatebonus(){
            return salary * 10;
        }
          public double calculatebonus(double percentage){
              return salary * percentage / 100;
          }
          public void displayinfo(){
              System.out.println("Name :"+ name);
               System.out.println("Id :"+ id);
               System.out.println("Salary :"+ salary);
               
          }
}
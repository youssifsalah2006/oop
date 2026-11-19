/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication202;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class JavaApplication202 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
        System.out.print("enter number of students:");
        int n = input.nextInt();
        student[] students = new student[n];
        for(int i=0 ; i<students.length ; i++){
        System.out.print("enter name , id , grade : ");
        String name=input.next();
                String id=input.next();
                        double grade=input.nextDouble();
                        students[i] = new student(name,id,grade);
        }
         System.out.print("enter student index");
         int index=input.nextInt();
         System.out.print("enter new grade");
         double newgrade=input.nextDouble();
         students[index].updategrade(newgrade);
         for(int i =0 ; i<students.length ; i++){
         String status=students[i].ispassed()?"passed" :"faild";
         System.out.print(students[i].getstudentname()+"---"+students[i].getstudentid()+"---"+students[i].getgrade()+"---"+status);
         }
    }
    
}



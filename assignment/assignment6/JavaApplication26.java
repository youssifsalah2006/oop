/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication26;

/**
 *
 * @author yossi
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {

        
        Student s1 = new Student("123", "Ahmed", 3.2);
        Student s2 = new Student();

        s2.setGPA(3.8);

    
        System.out.println("Student 1:");
        System.out.println("ID: " + s1.getStudentID());
        System.out.println("Name: " + s1.getStudentName());
        System.out.println("GPA: " + s1.getGPA());
        System.out.println("Honor Student: " + s1.isHonorStudent());

        System.out.println();

        System.out.println("Student 2:");
        System.out.println("ID: " + s2.getStudentID());
        System.out.println("Name: " + s2.getStudentName());
        System.out.println("GPA: " + s2.getGPA());
        System.out.println("Honor Student: " + s2.isHonorStudent());
    }
}

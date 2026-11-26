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

    
public class Student {

    private String studentID;
    private String studentName;
    private double GPA;

    // Parameterized Constructor
    public Student(String studentID, String studentName, double GPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.GPA = GPA;
    }

    // Default Constructor
    public Student() {
        studentID = "000";
        studentName = "Unknown";
        GPA = 0.0;
    }

    // Setters
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    // Getters
    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getGPA() {
        return GPA;
    }

    // Honor Student Method
    public boolean isHonorStudent() {
        return GPA >= 3.5;
    }

    // Display Information
    public void displayInfo() {
        System.out.println("ID: " + studentID);
        System.out.println("Name: " + studentName);
        System.out.println("GPA: " + GPA);
        System.out.println("Honor Student: " + isHonorStudent());
        System.out.println();
    }
}

}

}

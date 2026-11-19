/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication202;

public class student {
    private String studentname;
    private String studentid;
    private double grade;
    public student(String name,String id, double gra ){
        studentname=name;
        studentid=id;
            grade=gra;
    }
    public void updategrade(double newgrade){
    grade=newgrade;}
    public boolean ispassed(){
    return grade>=50;}
    public String getstudentname(){
    return studentname;}
     public String getstudentid(){
    return studentid;}
     public double getgrade(){
    return grade;}
        
    
    
    
    
    
   
}
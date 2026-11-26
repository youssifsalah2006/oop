/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication22;

/**
 *
 * @author STUDENT
 */
public class vehicle {
   
    private String brand;
    private String model;
    private int year;

    public vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public double calculateRentalPrice(int days){
        return days;
    }
    

    public double calculateRentalPrice(int days, double discount) {
        double price = calculateRentalPrice(days);
        return price - (price * discount / 100);
    }

    public void displayDetails() {
        System.out.println(toString());
    }
    }


  





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
public class carr extends vehicle {
    private int numberOfDoors;

    public carr(String brand, String model, int year,
               int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

     public double calculateRentalPrice(int days) {
        return days * 70;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
    public String toString() {
        return super.toString() +
                ", Number of Doors: " + numberOfDoors;
    }
}


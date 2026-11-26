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
    
    public class motorcycle extends vehicle {
    private int engineCapacity;

    public motorcycle(String brand, String model, int year,
                      int engineCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }


    public double calculateRentalPrice(int days) {
        return days * 30;
    }
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " +
                engineCapacity);
    }

    public String toString() {
        return super.toString() +
                ", Engine Capacity: " + engineCapacity;
    }
    }


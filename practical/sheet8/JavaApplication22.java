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
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       carr car = new carr("Toyota", "Corolla", 2024, 4);

        motorcycle motorcycle =
                new motorcycle("Honda", "CBR", 2023, 600);

        System.out.println("Car Details:");
        car.displayDetails();

        System.out.println("\nMotorcycle Details:");
        motorcycle.displayDetails();
  
        System.out.println("\nRental Prices:");

        System.out.println("Car: " +
                car.calculateRentalPrice(3));

        System.out.println("Motorcycle: " +
                motorcycle.calculateRentalPrice(3));

        System.out.println("\nDiscount:");

        System.out.println("Car: " +
                car.calculateRentalPrice(3, 10));

        System.out.println("Motorcycle: " +
                motorcycle.calculateRentalPrice(3, 20));

     
        System.out.println("\nToString:");

        System.out.println(car);
        System.out.println(motorcycle);
    }
    
}

package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //---------------------------------------------------
        Scanner sc = new Scanner(System.in);
        String choice;
        ArrayList<Vehicle> rentedVehicles =new ArrayList<>();
        //---------------------------------------------------
try {


        do{
            System.out.println("Vehicle Rental System\n" +
                    "1. Rent a Car\n" +
                    "2. Rent a Bike\n" +
                    "3. Rent a Truck\n" +
                    "4. View Rented Vehicles\n" +
                    "5. Exit\n"+
                    "Enter your choice:");
            choice = sc.next();
            if (choice.equals("5")) break;

            switch (choice){
                case "1":
                    //Enter details (create a new object)
                    System.out.println("Enter car model: ");
                    String carModel = sc.next();
                    System.out.println("Enter rental days:");
                    int rentalDays = sc.nextInt();
                    Vehicle car = new Car(carModel,rentalDays);
                    rentedVehicles.add(car);
                    //Print details
                    System.out.println("\nRental Details:");
                    car.displayDetails();
                    System.out.println();
                    break;
                case "2":
                    //Enter details (create a new object)
                    System.out.println("Enter bike brand: ");
                    String bikeBrand = sc.next();
                    System.out.println("Enter rental hours:");
                    int rentalHours = sc.nextInt();
                    Vehicle bike = new Bike(bikeBrand,rentalHours);
                    rentedVehicles.add(bike);
                    //Print details
                    System.out.println("\nRental Details:");
                    bike.displayDetails();
                    System.out.println();
                    break;
                case "3":
                    //Enter details (create a new object)
                    System.out.println("Enter truck type: ");
                    String truckType = sc.next();
                    System.out.println("Enter rental weeks:");
                    int rentalWeeks = sc.nextInt();
                    Vehicle truck = new Truck(truckType,rentalWeeks);
                    rentedVehicles.add(truck);
                    //Print details
                    System.out.println("\nRental Details:");
                    truck.displayDetails();
                    System.out.println();
                    break;
                case "4":
                    for (Vehicle vehicle: rentedVehicles){
                        vehicle.displayDetails();
                    }
                    System.out.println();
                    break;
                default:  System.out.println("Invalid option.");
            }
        }while (true);
} catch (InputMismatchException e){
    System.out.println("InputMismatchException: "+e.getMessage());
} catch (Exception e){
    System.out.println("Exception:"+e.getMessage());
}
        System.out.println("Thank you for using the Vehicle Rental System!");
    }
}
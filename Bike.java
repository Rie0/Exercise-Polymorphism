package org.example;

public class Bike implements Vehicle{

    private final static double hourlyRate = 10.0;
    private String brand;
    private int hours;

    //Constructor

    public Bike(String brand, int hours) {
        this.brand = brand;
        this.hours = hours;
    }


    //Getters setters

    public double getHourlyRate(){
        return hourlyRate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    //Methods
    @Override
    public double calculateRentalCost() {
        return hours*hourlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "\n__________________________"+
                "\nBike Brand: "+brand+
                "\nDaily Rental Rate: $"+hourlyRate+
                "\nRental Cost: $"+calculateRentalCost());
    }
}
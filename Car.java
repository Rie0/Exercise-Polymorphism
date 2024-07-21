package org.example;

public class Car implements Vehicle{

    private static final double dailyRate=50.0;
    private String model;
    private int days;

    //Constructor

    public Car(String model, int days) {
        this.model = model;
        this.days = days;
    }

    //Getters setters

    public double getDailyRate() {
        return dailyRate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    //Methods
    @Override
    public double calculateRentalCost() {
        return days*dailyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "\n__________________________"+
                "\nCar Model: "+model+
                "\nDaily Rental Rate: $"+dailyRate+
                "\nRental Cost: $"+calculateRentalCost());
    }
}

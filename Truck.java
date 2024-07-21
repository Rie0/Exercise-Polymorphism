package org.example;

public class Truck implements Vehicle{

    private final static double weeklyRate = 500.0;
    private String type;
    private int weeks;


    //Constructor

    public Truck(String type, int weeks) {
        this.type = type;
        this.weeks = weeks;
    }

    //Getters setters

    public double getWeeklyRate(){
        return weeklyRate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    //Methods
    @Override
    public double calculateRentalCost() {
        return weeks*weeklyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "\n__________________________"+
                "\nTruck type: "+type+
                "\nDaily Rental Rate: $"+weeklyRate+
                "\nRental Cost: $"+calculateRentalCost());
    }
}
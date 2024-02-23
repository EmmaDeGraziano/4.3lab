package edu.sdccd.cisc191;

public class Vehicle{
    private Option option;
    private String manufacturer;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private Option[] options;
    public Vehicle(){

    }
    public Vehicle(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, Option[] options){
        this.manufacturer = manufacturer;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.options = options;
    }
    public Vehicle(String manufacturer, int milesOnVehicle, int price, int numberOfSeats){
        this.manufacturer = manufacturer;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
    }

    public String getManufacturerName(){
        return manufacturer;
    }
    public int getMilesOnVehicle(){
        return milesOnVehicle;
    }
    public int getPrice(){
        return price;
    }
    public int getNumberOfSeats(){
        return numberOfSeats;
    }
    public Option[] getOptions(){
        return options;
    }
}
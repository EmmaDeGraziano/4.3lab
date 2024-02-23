package edu.sdccd.cisc191;

public class Car extends Vehicle{
    private int numOfDoors;

    public Car(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, int numOfDoors){
        super(manufacturer, milesOnVehicle, price, numberOfSeats);
        this.numOfDoors = numOfDoors;
    }
    public int getNumberOfDoors(){
        return numOfDoors;
    }

}

package edu.sdccd.cisc191;

public class GasCar extends Car implements Combustible{
    private int fuelLevel;
    private int tankUp;
    public GasCar(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, int numOfDoors, int fuelLevel, int tankUp){
        super(manufacturer, milesOnVehicle, price,numberOfSeats,numOfDoors);
        this.fuelLevel = fuelLevel;
        this.tankUp = tankUp;
    }
    public void tankUp(){
        fuelLevel = 100;
    }
    public int getFuelLevel(){
        return fuelLevel;
    }
    public int getTankUp(){
        return tankUp;
    }
}

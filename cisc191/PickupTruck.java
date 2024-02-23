package edu.sdccd.cisc191;

public class PickupTruck extends Vehicle{
    private int cargoCapacity;
    public PickupTruck(){
    }
    public PickupTruck(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, int cargoCapacity){
        super(manufacturer, milesOnVehicle, price, numberOfSeats);
        this.cargoCapacity = cargoCapacity;
    }
    public int getCargoCapacity(){
    return cargoCapacity;
    }
}
package edu.sdccd.cisc191;

public class HybridCar extends Car implements Combustible, Chargeable{
    private int batteryCharge;
    private int fuelLevel;
    public HybridCar(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, int numOfDoors, int batteryCharge, int fuelLevel){
        super(manufacturer, milesOnVehicle, price,numberOfSeats,numOfDoors);
        this.fuelLevel = fuelLevel;
        this.batteryCharge = batteryCharge;
    }
    public int getBatteryCharge(){
        return batteryCharge;
    }
    public void tankUp(){
        fuelLevel = 100;
    }
    public void chargeUp(){
        batteryCharge = 100;
    }
    public int getFuelLevel(){
        return fuelLevel;
    }
}

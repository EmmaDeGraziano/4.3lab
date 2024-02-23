package edu.sdccd.cisc191;

public class ElectricCar extends Car implements Chargeable{
    private int batteryCharge;
    public ElectricCar(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, int
            numOfDoors, int charge){
        super(manufacturer, milesOnVehicle, price,numberOfSeats,numOfDoors);
        batteryCharge = charge;

    }
    public int getBatteryCharge(){
        return batteryCharge;
    }
    public void chargeUp(){
        batteryCharge = 100;
    }
}
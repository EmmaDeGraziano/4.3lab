package edu.sdccd.cisc191;

public class SportUtilityVehicle extends Vehicle{
    private int maxTowingWeight;
    public SportUtilityVehicle(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, int maxTowingWeight){
        super(manufacturer, milesOnVehicle, price,numberOfSeats);
        this.maxTowingWeight = maxTowingWeight;
    }
    public int getMaxTowingWeight(){
        return maxTowingWeight;
    }
}

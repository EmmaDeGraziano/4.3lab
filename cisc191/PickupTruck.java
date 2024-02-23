package edu.sdccd.cisc191;

/**
 * A vehicle including information on its cargo capacity.
 * @author Emma DeGraziano
 * @author Jared Canonizado
 */
public class PickupTruck extends Vehicle{
    private int cargoCapacity;

    /**
     * Creates a PickupTruck with the given manufacturer, mileage, price, seats, options, and cargo capacity.
     * @param manufacturer the manufacturer, e.g. Nissan, Jeep
     * @param milesOnVehicle the mileage
     * @param price the price
     * @param numberOfSeats how many seats
     * @param options an Option array
     * @param cargoCapacity how much it can carry
     */
    public PickupTruck(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int cargoCapacity){
        super(manufacturer, milesOnVehicle, price, numberOfSeats, options);
        this.cargoCapacity = cargoCapacity;
    }

    /**
     * @return the cargo capacity of the pickup truck
     */
    public int getCargoCapacity(){
    return cargoCapacity;
    }
}
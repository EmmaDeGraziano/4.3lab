package edu.sdccd.cisc191;

/**
 * A car powered by gas.
 * @author Emma DeGraziano
 * @author Jared Canonizado
 */
public class GasCar extends Car implements Combustible {
    private int fuelLevel;

    /**
     * Creates a GasCar with the given manufacturer, mileage, price, seats, options, and doors.
     * @param manufacturer the manufacturer, e.g. Volkswagen, BMW
     * @param milesOnVehicle the mileage
     * @param price the price
     * @param numberOfSeats how many seats
     * @param options an Option array
     * @param numberOfDoors how many doors
     */
    public GasCar(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturer, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
    }

    /**
     * @return the fuel level of the car.
     */
    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    /**
     * Fills the tank of the car to 100.
     */
    @Override
    public void tankUp() {
        fuelLevel = 100;
    }
}

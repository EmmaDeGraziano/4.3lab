package edu.sdccd.cisc191;

/**
 * A car powered by gas and a battery.
 * @author Emma DeGraziano
 * @author Jared Canonizado
 */
public class HybridCar extends Car implements Combustible, Chargeable {
    private int batteryCharge;
    private int fuelLevel;

    /**
     * Creates a HybridCar with the given manufacturer, mileage, price, seats, options, and doors.
     * @param manufacturer the manufacturer, e.g. Toyota, Hyundai
     * @param milesOnVehicle the mileage
     * @param price the price
     * @param numberOfSeats how many seats
     * @param options an Option array
     * @param numberOfDoors how many doors
     */
    public HybridCar(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
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

    /**
     * @return The battery charge of the car
     */
    @Override
    public int getBatteryCharge() {
        return batteryCharge;
    }

    /**
     * Charges the battery of the car to 100.
     */
    @Override
    public void chargeUp() {
        batteryCharge = 100;
    }
}

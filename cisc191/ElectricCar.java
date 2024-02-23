package edu.sdccd.cisc191;

/**
 * A car powered by a battery.
 * @author Emma DeGraziano
 * @author Jared Canonizado
 */
public class ElectricCar extends Car implements Chargeable{
    private int batteryCharge;

    /**
     * Creates a ElectricCar with the given manufacturer, mileage, price, seats, options, and doors.
     * @param manufacturer the manufacturer, e.g. Nissan, Tesla
     * @param milesOnVehicle the mileage
     * @param price the price
     * @param numberOfSeats how many seats
     * @param options an Option array
     * @param numberOfDoors how many doors
     */
    public ElectricCar(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturer, milesOnVehicle, price, numberOfSeats, options, numberOfDoors);
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
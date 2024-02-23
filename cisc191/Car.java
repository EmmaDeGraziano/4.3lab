package edu.sdccd.cisc191;

/**
 * A vehicle including information on the number of doors.
 * @author Emma DeGraziano
 * @author Jared Canonizado
 */
public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Creates a HybridCar with the given manufacturer, mileage, price, seats, options, and doors.
     * @param manufacturer the manufacturer, e.g. Toyota, Hyundai
     * @param milesOnVehicle the mileage
     * @param price the price
     * @param numberOfSeats how many seats
     * @param options an Option array
     * @param numberOfDoors how many doors
     */
    public Car(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int numberOfDoors) {
        super(manufacturer, milesOnVehicle, price, numberOfSeats, options);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * @return the number of seats in the vehicle
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}

package edu.sdccd.cisc191;

/**
 * A vehicle including information on its max towing weight.
 * @author Emma DeGraziano
 * @author Jared Canonizado
 */
public class SportUtilityVehicle extends Vehicle {
    private int maxTowingWeight;

    /**
     * Creates a SportUtilityVehicle with the given manufacturer, mileage, price, seats, options, and max towing weight.
     * @param manufacturer the manufacturer, e.g. Nissan, Jeep
     * @param milesOnVehicle the mileage
     * @param price the price
     * @param numberOfSeats how many seats
     * @param options an Option array
     * @param maxTowingWeight the maximum weight it can tow
     */
    public SportUtilityVehicle(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, Option[] options, int maxTowingWeight) {
        super(manufacturer, milesOnVehicle, price, numberOfSeats, options);
        this.maxTowingWeight = maxTowingWeight;
    }

    /**
     * @return the max towing weight of the SUV
     */
    public int getMaxTowingWeight() {
        return maxTowingWeight;
    }
}

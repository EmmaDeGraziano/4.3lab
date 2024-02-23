package edu.sdccd.cisc191;

/**
 * A base vehicle containing basic information about its manufacturer, mileage, price, seats, and options.
 * @author Emma DeGraziano
 * @author Jared Canonizado
 */
public class Vehicle {
    private String manufacturer;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private Option[] options;

    /**
     * Creates a Vehicle with the given manufacturer, mileage, price, seats, and options.
     * @param manufacturer the manufacturer, e.g. Nissan, Jeep
     * @param milesOnVehicle the mileage
     * @param price the price
     * @param numberOfSeats how many seats
     * @param options an Option array
     */
    public Vehicle(String manufacturer, int milesOnVehicle, int price, int numberOfSeats, Option[] options) {
        this.manufacturer = manufacturer;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.options = options;
    }

    /**
     * @return the manufacturer name of the vehicle, e.g. Toyota
     */
    public String getManufacturerName() {
        return manufacturer;
    }

    /**
     * @return the mileage of the vehicle
     */
    public int getMilesOnVehicle() {
        return milesOnVehicle;
    }

    /**
     * @return the price of the vehicle
     */
    public int getPrice() {
        return price;
    }

    /**
     * @return the number of seats in the vehicle
     */
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    /**
     * @return the options array of the vehicle
     */
    public Option[] getOptions() {
        return options;
    }
}
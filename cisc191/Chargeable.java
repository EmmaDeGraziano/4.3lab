package edu.sdccd.cisc191;

/**
 * Interface for chargeable cars.
 * @author Emma DeGraziano
 * @author Jared Canonizado
 */
public interface Chargeable {
    /**
     * @return The battery charge of the car
     */
    int getBatteryCharge();

    /**
     * Charges the battery of the car to 100.
     */
    void chargeUp();
}
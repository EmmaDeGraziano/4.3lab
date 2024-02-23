package edu.sdccd.cisc191;

/**
 * Interface for combustible cars.
 * @author Emma DeGraziano
 * @author Jared Canonizado
 */
public interface Combustible {
    /**
     * @return the fuel level of the car.
     */
    int getFuelLevel();

    /**
     * Fills the tank of the car to 100.
     */
    void tankUp();
}

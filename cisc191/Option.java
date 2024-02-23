package edu.sdccd.cisc191;

/**
 * An option containing details.
 * @author Emma DeGraziano
 * @author Jared Canonizado
 */
public class Option {
    private String details;

    /**
     * Creates an Option with the given details
     * @param details further information on the option
     */
    public Option(String details) {
        this.details = details;
    }

    /**
     * @return the details of the option
     */
    public String getDetails() {
        return details;
    }
}

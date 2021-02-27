package com.company.optional;

/**
 * Destination class
 * OPTIONAL
 * @author Asan Laurentiu A2
 */

public class Destination {

    private String name;
    private int demand;

    /**
     * Constructor
     * @param name given name for destination
     * @param demand given number representing demand
     */
    public Destination(String name, int demand) {
        this.name = name;
        this.demand = demand;
    }

    /**
     * Getter for name
     * @return name of the destionation
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for demand
     * @return number of demanding units
     */
    public int getDemand() {
        return demand;
    }

    /**
     * Overridden toString method
     * @return a prettier representation of the object
     */
    @Override
    public String toString() {
        return '(' + name  + ", " + demand + ')';
    }

}

package com.company.optional;

public class Variable {

    private int supply;
    private int demand;
    private double value;

    public Variable() {
        supply = 0;
        demand = 0;
        value = 0;
    }

    /**
     * Constructor
     * @param supply given capacity
     * @param demand given units demanded
     */
    public Variable(int supply, int demand) {
        this.supply = supply;
        this.demand = demand;
    }

    /**
     * Getter supply
     * @return value of supply
     */
    public int getSupply() {
        return supply;
    }

    /**
     * Setter for supply
     * @param supply given value for capacity of a source
     */
    public void setSupply(int supply) {
        this.supply = supply;
    }

    /**
     * Getter for demand
     * @return value of demand of a destination
     */
    public int getDemand() {
        return demand;
    }

    /**
     * Setter for demand
     * @param demand given value of demands
     */
    public void setDemand(int demand) {
        this.demand = demand;
    }

    /**
     * Getter for value
     * @return value of supplies allocated to a specific demand
     */
    public double getValue() {
        return value;
    }

    /**
     * Setter for value
     * @param value given number of supplies allocated to a demand
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Overridden toString method
     * @return String containing a representation of object Variable
     */
    @Override
    public String toString() {
        return (supply + 1) + "-> " + (demand + 1) + ": " + value;
    }
}

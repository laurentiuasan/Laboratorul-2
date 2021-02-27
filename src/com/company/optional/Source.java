package com.company.optional;

/**
 * Abstract Source class
 * OPTIONAL
 * @author  Asan Laurentiu A2
 */

public abstract class Source {

    protected String name;
    protected int capacity;

    /**
     * Constructor
     * @param name given source name
     * @param capacity given number represent how many destinations can supply
     */
    public Source(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    /**
     * Getter for source name
     * @return String containing name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for countSupply
     * @return integer representing size of a source
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Overridden toString method
     * @return String containing a representation of the object
     */
    @Override
    public abstract String toString();

    /**
     * Overridden equals method to do not allow duplicates
     * @param obj pointer to the object that will be used in comparation
     * @return true if objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Source)) {
            return false;
        }
        Source other = (Source) obj;
        return name.equals(other.name);
    }
}

package com.company.compulsory;

/**
 * Source Class
 * Compulsory
 * @author Asan Laurentiu A2
 */

public class Source {

    private String name;
    private SourceType type;
    private int capacity;

    /**
     * Constructor
     * @param name given source name
     * @param type given a specific SourceType
     * @param capacity given number represent how many destinations can supply
     */
    public Source(String name, SourceType type, int capacity) {
        this.name = name;
        this.type = type;
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
     * Getter for source type
     * @return SourceType enum
     */
    public SourceType getType() {
        return type;
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
    public String toString() {
        return '(' + name + ", " + type + ", " + capacity + ")";
    }
}

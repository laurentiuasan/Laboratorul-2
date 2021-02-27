package com.company.compulsory;

import java.util.Arrays;

/**
 * Problem Class
 * Compulsory
 * @author  Asan Laurentiu A2
 */

public class Problem {

    private Cost costs;
    private Source[] sources;
    private Destination[] destinations;
    private int sourcesCount;
    private int destinationsCount;

    /**
     * Default constructor
     */
    public Problem() {
        sources = null;
        destinations = null;
        sourcesCount = destinationsCount = 0;
        costs = null;
    }

    /**
     * Getter for costs matrix
     * @return pointer to the costs matrix
     */
    public Cost getCosts() {
        return costs;
    }

    /**
     * Getter for sources array
     * @return pointer to the sources array
     */
    public Source[] getSources() {
        return sources;
    }

    /**
     * Getter for destinations array
     * @return pointer to the destinations array
     */
    public Destination[] getDestinations() {
        return destinations;
    }

    /**
     * Setter for costs matrix
     * @param costs matrix with the transportation cost from source to the destination
     */
    public void setCosts(Cost costs) {
        this.costs = costs;
    }

    /**
     * Internal method used to resize the array
     * @param size required size for the new array
     */
    private void allocateDestinations(int size) {
        destinations = Arrays.copyOf(destinations, destinationsCount + size);
    }

    /**
     * Method used to add a new destination
     * @param destination pointer to a Destination object
     */
    public void addDestination(Destination destination) {
        if(destinations == null) {
            destinations = new Destination[1];
            destinationsCount = 1;
            destinations[0] = destination;
            return;
        }
        else {
            if(destinationsCount + 1 >= destinations.length) {
                allocateDestinations(1);
            }
        }
        destinations[destinationsCount++] = destination;
    }

    /**
     * Method used to add multiple new destinations
     * @param destinations pointer to array containing destinations objects
     */
    public void addDestinations(Destination... destinations) {
        for(Destination d : destinations) {
            addDestination(d);
        }
    }

    /**
     * Internal method used to resize the array
     * @param size required size for the new array
     */
    private void allocateSources(int size) {
        sources = Arrays.copyOf(sources, sourcesCount + size);
    }

    /**
     * Method used to add a new source
     * @param source pointer to a Source object
     */
    public void addSource(Source source) {
        if(sources == null) {
            sources = new Source[1];
            sourcesCount = 1;
            sources[0] = source;
            return;
        }
        else {
            if(sourcesCount + 1 >= sources.length) {
                allocateSources(1);
            }
        }
        sources[sourcesCount++] = source;
    }

    /**
     * Method used to add multiple new sources
     * @param sources pointer to array containing source objects
     */
    public void addSources(Source... sources) {
        for(Source s : sources) {
            addSource(s);
        }
    }

    /**
     * Overridden toString method
     * @return pretty representation of the Problem
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for(Source s : sources) {
            stringBuilder.append(s);
            stringBuilder.append(", ");
        }
        stringBuilder.append("\n");

        for(Destination d : destinations) {
            stringBuilder.append(d);
            stringBuilder.append(", ");
        }
        stringBuilder.append("\n");

        stringBuilder.append(costs);

        return stringBuilder.toString();
    }
}

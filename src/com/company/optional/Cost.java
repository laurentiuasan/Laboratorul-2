package com.company.optional;

public class Cost {

    private int[][] costs;
    private int countSources;
    private int countDestinations;

    /**
     * Defualt constructor
     */
    public Cost() {
        countDestinations = 0;
        countSources = 0;
        costs = new int[countDestinations][countSources];
    }

    /**
     * Constructor for cost class
     * @param costs matrix with cost values
     * @param countSources number of sources
     * @param countDestinations number of destinations
     */
    public Cost(int[][] costs, int countSources, int countDestinations) {
        this.costs = costs;
        this.countSources = countSources;
        this.countDestinations = countDestinations;
    }

    /**
     * Getter for a specific cost from the costs matrix
     * @param from index of the source
     * @param to index of the destination
     * @return cost value from a source to a destination
     */
    public int getCost(int from, int to) {
        return costs[from][to];
    }

    /**
     * Getter for costs matrix
     * @return pointer to the requested matrix
     */
    public int[][] getCosts() {
        return costs;
    }

    /**
     * Setter for costs matrix
     * @param costs matrix
     */
    public void setCosts(int[][] costs) {
        this.costs = costs;
    }

    /**
     * Getter for sources count
     * @return number of sources
     */
    public int getCountSources() {
        return countSources;
    }

    /**
     * Setter for sources count
     * @param countSources keep count of the sources number
     */
    public void setCountSources(int countSources) {
        this.countSources = countSources;
    }

    /**
     * Getter for destinations count
     * @return number of destinations
     */
    public int getCountDestinations() {
        return countDestinations;
    }

    /**
     * Setter for destinations count
     * @param countDestinations keep count of the destinations number
     */
    public void setCountDestinations(int countDestinations) {
        this.countDestinations = countDestinations;
    }

    /**
     * Overridden toString method
     * @return matrix costs as a String
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Costs:\n");
        for(int i = 0; i < countSources; i++) {
            for(int j = 0; j < countDestinations; j++) {
                sb.append(costs[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}

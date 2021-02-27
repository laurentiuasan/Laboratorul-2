package com.company.optional;

/**
 * Abstract Algorithm class
 * OPTIONAL
 * @author Asan Laurentiu A2
 */

public abstract class Algorithm {

    protected String name;
    protected Problem problem;

    /**
     * Constructor
     * @param name given name for algorithm
     * @param problem given problem for algorithm to solve
     */
    public Algorithm(String name, Problem problem) {
        this.name = name;
        this.problem = problem;
    }

    /**
     * Abstract method that runs an algorithm that solves the problem
     */
    public abstract void runAlgorithm();


}

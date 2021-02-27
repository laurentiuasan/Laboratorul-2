package com.company.optional;

import java.util.LinkedList;

/**
 * Solution class
 * OPTIONAL
 * @author  Asan Laurentiu A2
 */

public class Solution {

    private Problem problem;
    private NorthWestCornerMethod nwcMethod;
    private double result;
    private LinkedList<Variable> solution;

    /**
     * Constructor
     * @param problem pointer to the Problem object
     */
    public Solution(Problem problem) {
        this.problem = problem;
        nwcMethod = new NorthWestCornerMethod(problem);
        result = 0;
    }

    /**
     * Method that will run the algoritm and save the solution
     */
    public void runAlgorithm(){
        nwcMethod.runAlgorithm();
        solution = nwcMethod.getSolution();
    }

    /**
     * Method that will take the algorithm solution and will calculate the result
     */
    public void calculateResult() {

        int[][] problemCosts = problem.getCosts().getCosts();
        for(Variable v: solution) {
            result = result + v.getValue() * problemCosts[v.getSupply()][v.getDemand()];
        }
    }

    /**
     * Method that prints the solution given by algorithm
     */
    public void printSolution() {
        for(Variable v: solution) {
            if (v.getValue() != 0) {
                System.out.println(v);
            }
        }
    }

    /**
     * Overridden toString method
     * @return String representation of result
     */
    @Override
    public String toString() {
        return "Result= " + result;
    }
}

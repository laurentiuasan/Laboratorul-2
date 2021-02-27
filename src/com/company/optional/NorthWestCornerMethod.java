package com.company.optional;

import java.util.LinkedList;

/**
 * North-West Corner Method for The Transportation Problem
 * OPTIONAL
 * @author Asan Laurentiu A2
 */

public class NorthWestCornerMethod extends Algorithm{

    private LinkedList<Variable> solution;
    private int[] supplies;
    private int[] demands;

    /**
     * Constructor for algorithm
     * @param problem given problem that will be solved using algorithm
     */
    public NorthWestCornerMethod(Problem problem) {
        super("North West Corner Method", problem);
        demands = new int[problem.getDestinationsCount()];
        supplies = new int[problem.getSourcesCount()];
        solution = new LinkedList<>();

        for(int i = 0; i < demands.length; i++) {
            demands[i] = problem.getDestination(i).getDemand();
        }
        for(int i = 0; i < supplies.length; i++) {
            supplies[i] = problem.getSource(i).getCapacity();
        }

        for(int i = 0; i < (supplies.length + demands.length - 1); i++) {
            solution.add(new Variable());
        }
    }

    /**
     * Method that will solve the problem using the algorithm
     */
    @Override
    public void runAlgorithm() {
        int counter = 0;
        double minimumValue;

        /* Array that will tell us which constraints are satisfied */
        boolean[][] areConstraintsSatisfied = new boolean[supplies.length][demands.length];
        for(int i = 0; i < supplies.length; i++) {
            for(int j = 0; j < demands.length; j++) {
                areConstraintsSatisfied[i][j] = false;
            }
        }

        /* Iterating matrix by column-lines style for easy access on 'NW corner'*/
        for(int j = 0; j < demands.length; j++) {
            for(int i = 0; i < supplies.length; i++) {
                if(!areConstraintsSatisfied[i][j]) {
                    minimumValue = Math.min(demands[j], supplies[i]);

                    /* Writing it as solution*/
                    solution.get(counter).setSupply(i);
                    solution.get(counter).setDemand(j);
                    solution.get(counter).setValue(minimumValue);
                    counter++;

                    /* */
                    demands[j] -= minimumValue;
                    supplies[i] -= minimumValue;

                    if(supplies[i] == 0) {
                        for(int k = 0; k < demands.length; k++) {
                            areConstraintsSatisfied[i][k] = true;
                        }
                    }
                    if(demands[j] == 0) {
                        for(int k = 0; k < supplies.length; k++) {
                            areConstraintsSatisfied[k][j] = true;
                        }
                    }
                }
            }
        }
    }

    /**
     * Method to share the result
     * @return pointer to a LinkedList of multiple object Variable
     */
    public LinkedList<Variable> getSolution(){
        return solution;
    }
}

package com.company.optional;

/**
 * Main Class
 * OPTIONAL
 *
 * @author Asan Laurentiu A2
 */

public class Main {

    public static void main(String[] args) {

        /* Creating the problem */
        Problem problem = new Problem();

        /* Adding sources, destinations, costs */
        problem.addSources(
                new Factory("S1", 10),
                new Warehouse("S2", 35),
                new Warehouse("S3", 25)
        );

        problem.addDestinations(
                new Destination("D1", 20),
                new Destination("D2", 25),
                new Destination("D3", 25)
        );

        problem.setCosts(
                new Cost(new int[][]
                        {
                                {2, 3, 1},
                                {5, 4, 8},
                                {5, 6, 8}
                        }, 3, 3)
        );

        /* Printing out the problem */
        System.out.println(problem);

        /* Creating a solution and printing it */
        Solution solution = new Solution(problem);

        solution.runAlgorithm(); // runs the algorithm
        solution.printSolution(); // prints the solution found

        solution.calculateResult(); // calculates the result
        System.out.println(solution); // prints the result
    }
}

package com.company.compulsory;

/**
 * Main Class.
 * Compulsory
 * @author Asan Laurentiu A2
 */

public class Main {

    public static void main(String[] args) {

        /* Creating problem */
        Problem problem = new Problem();

        /* Creating and adding sources and destinations */
        problem.addSources(
                new Source("S1", SourceType.FACTORY, 10),
                new Source("S2", SourceType.WAREHOUSE, 35),
                new Source("S3", SourceType.WAREHOUSE, 25)
        );

        problem.addDestinations(
                new Destination("D1", 20),
                new Destination("D2", 25),
                new Destination("D3", 25)
                );

        /* Creating and adding cost matrix */
        int[][] costMatrix = new int[][]
                {
                        {2, 3, 1},
                        {5, 4, 8},
                        {5, 6, 8}
                };
        Cost cost = new Cost(costMatrix, 3, 3);
        problem.setCosts(cost);

        System.out.println("Our problem looks like this:\n" + problem);
    }
}

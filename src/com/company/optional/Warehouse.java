package com.company.optional;

/**
 * Warehouse class
 * OPTIONAL
 * @author  Asan Laurentiu A2
 */

public class Warehouse extends Source {

    public Warehouse(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public String toString() {
        return '(' + "Warehouse " + name + ",  " + capacity + ')';
    }
}

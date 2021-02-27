package com.company.optional;

/**
 * Factory class
 * OPTIONAL
 * @author  Asan Laurentiu A2
 */

public class Factory extends Source{

    public Factory(String name, int capacity) {
        super(name, capacity);
    }

    @Override
    public String toString() {
        return '(' + "Factory " + name + ", " + capacity + ')';
    }
}

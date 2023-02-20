package org.brew.test;

import org.brew.Coffee;

/**
 * This worked, but I don't like the "size:0" in the output
 * I would like it better if I could figure out how to make the size "null"
 */

class CoffeeValidationTest {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        c1.setSize(7);
        System.out.println("size:" + c1.getSize());
        c1.setSize(9);
        System.out.println("size:" + c1.getSize());
    }
}
package org.brew.test;

import org.brew.Coffee;

/**
 * This worked, but I don't like the "size:0" in the output
 * I would like it better if I could figure out how to make the size "null"
 *
 * JR: we learned this when we studied the wrapper classes, just use Integer instead
 */

/*
 * JR: incomplete.
 *
 * For proper testing of 'size', you need to check
 *  8, 12, 16, and one invalid value
 *
 * For 'brand' validation testing (which should have been an enum), you need to check
 *  "Stout Coffee House", "Fiddlers", "Reformed Roasters" and
 *  "INVALID" (or anything not in the list above)
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
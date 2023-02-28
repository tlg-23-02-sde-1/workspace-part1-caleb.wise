package org.brew.client;

import org.brew.Coffee;
import org.brew.Style;
import org.brew.TempType;

/*
 * JR: good basic test-drive of a few valid instances.
 */
class CoffeeClient {

    public static void main(String[] args) {

        System.out.println("There are " + Coffee.getOrderNumber() + " coffees ordered.");

        Coffee c1 = new Coffee(TempType.ICED, 12, "Fiddlers", Style.DRIP);

        Coffee c2 = new Coffee(TempType.HOT, 16, "Stout Coffee House", Style.AMERICANO);

        Coffee c3 = new Coffee(TempType.HOT, 8);

        System.out.println();

        c1.grind();
        c1.brew();
        c1.serve();
        System.out.println();

        c2.grind();
        c2.brew();
        c2.serve();
        System.out.println();

        c3.serve();
        System.out.println();

        c2.remind();
        System.out.println("Do you need room for cream?");
        System.out.println();
        System.out.println(); // Not sure if this is okay, but it helped read the output better
        // JR: for 2 blank lines, you could just print a newline character, i.e., "\n"

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println();

        System.out.println(Coffee.getOrderNumber() + " coffees were ordered.");

    }
}
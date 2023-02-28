package org.brew.client;

import org.brew.Coffee;
import org.brew.Style;
import org.brew.TempType;

import java.util.Arrays;

/*
 * JR: flawed in several areas.
 *
 * Usage and examples both specify 3 inputs (brand, size, temp),
 * but application is written to process 4 inputs (brand, size, temp, style).
 * Style is not mentioned at all in the usage banner.
 *
 * Avoid hardcoding the info in the 'noteN' information - we showed this in class.
 *  brand: Coffee.VALID_BRANDS (which should have been an enum)
 *  size:  okay here
 *  temp:  TempType.values()
 *  style: Style.values()
 *
 * The Coffee object created uses the inputs for brand and size, but ignores the provided
 * values for temp and style, hardcoding TempType.HOT and Style.AMERICANO instead.
 *  If user specifies this:
 *      Fiddlers 16 ICED LATTE
 *  They actually get this:
 *      Fiddlers, 16, HOT, AMERICANO
 *  More careful testing and inspection of the output would have revealed this bug.
 */
class CoffeeClientArgs {
    public static void main(String[] args) {
        if (args.length < 4) {
            String usage = "Usage: java CoffeeClientArgs <brand> <size> <temp> <style>";
            String example = "Example: java CoffeeClientArgs Fiddlers 16 HOT AMERICANO ";
            String note1 = "Note: Coffee Brands in stock are: " + Arrays.toString(Coffee.VALID_BRANDS);
            String note2 = "Note: Size options are 8, 12, and 16.";
            String note3 = "Note: Temperature options are: " + Arrays.toString(TempType.values());
            String note4 = "Note: Style options are: " + Arrays.toString(Style.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            System.out.println(note4);
            // JR: note4 was not printed
            return;
        }

        System.out.println("You provided " + args.length + " arguments.");

        String brand = args[0];
        int size = Integer.parseInt(args[1]);
        TempType temp = TempType.valueOf(args[2]);
        Style style = Style.valueOf(args[3]);

        // JR: 'temp' and 'style' inputs ignored, and user always get HOT and AMERICANO
        Coffee coffee = new Coffee(TempType.HOT, size, brand, Style.AMERICANO);

        // JR: incorrect, just print the actual Coffee object created, e.g., via its toString()
        System.out.printf("Your %s, %s, %s, %s is ready.", TempType.HOT, size, brand, Style.AMERICANO);
        System.out.println("Please enjoy your coffee!");
    }
}
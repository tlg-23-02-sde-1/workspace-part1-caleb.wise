package org.brew.client;

import org.brew.Coffee;
import org.brew.Style;
import org.brew.TempType;

class CoffeeClientArgs {
    public static void main(String[] args) {
        if (args.length < 4) {
            String usage = "Usage: java CoffeeClientArgs <brand> <size> <temp>";
            String example = "Example: java CoffeeClientArgs Fiddlers 16 HOT";
            String note1 = "Note: Coffee Brands in stock are Fiddlers, Stout Coffee House, and Reformed Roasters.";
            String note2 = "Note: Size options are 8, 12, and 16.";
            String note3 = "Note: Temperature options are HOT or ICED.";
            String note4 = "Note: Style options are Americano, Latte, Breve, Mocha, and Drip";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            return;
        }

        System.out.println("You provided " + args.length + " arguments.");

        String brand = args[0];
        int size = Integer.parseInt(args[1]);
        TempType temp = TempType.valueOf(args[2]);
        Style style = Style.valueOf(args[3]);

        Coffee coffee = new Coffee(brand, size, TempType.HOT, Style.AMERICANO);

        System.out.printf("Your %s, %s, %s, %s is ready.", brand, size, TempType.HOT, Style.AMERICANO);
        System.out.println("Please enjoy your coffee!");
    }
}
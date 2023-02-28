package org.brew;

import java.util.Arrays;

/**
 * JR: Demonstrates basic understanding of program concepts, but several improvements needed.
 * More attention to detail and careful inspection of the output would have exposed these flaws.

 * Validation testing is incomplete and ClientArgs is flawed in several areas.
 *
 * See comments below and in the other classes.
 *
 * Code is clean, readable, well-formatted, but note:
 *  Formatting: add a blank line between each method, otherwise looks too crowded.
 *
 * Class participation is adequate, but could still be improved.
 *
 * Class names, package names, and overall structure are correct.
 */
public class Coffee {

    // static constants
    /*
     * JR: if this is a renamed 'instanceCount' from the Television labs, better name needed:
     *  In my mind, every Coffee object would have its own order number, like in a deli or restaurant.
     */
    private static int orderNumber = 0;
    public static int getOrderNumber() {
        return orderNumber;
    }

    // JR: use enum here instead, e.g., Brand
    public static final String[] VALID_BRANDS =
            {"Stout Coffee House", "Fiddlers", "Reformed Roasters"};

    // - - - - - - - - - - - - - - - - - - - - - - - - -

    // properties
    public String brand = "Reformed Roasters";

    // JR: you want to use a default value here, since 0 (default for int) is not in [8,12,16]
    private int size = 8; // constraint: 8, 12, 16 oz
    private TempType temp = TempType.HOT;
    private Style style = Style.DRIP;

    // constructors
    public Coffee() {
        orderNumber++;
    }
    public Coffee(TempType temp) {
        this();
        setTemp(temp);
    }

    // JR: be consistent in sequencing ctor parameters
    // here, should be TempType, int - since ctor above leads with TempType
    public Coffee(TempType temp, int size) {
        this(temp);
        setSize(size);
    }

    // JR: better parameter sequence = TempType, int, String, Style
    public Coffee(TempType temp, int size, String brand, Style style) {
        this(temp, size);
        setBrand(brand);
        setStyle(style);
    }

    // methods
    // JR: when using printf(), remember to always add the "\n" at the end
    // Done only on the first one below.
    public void grind() {
        System.out.printf("Grinding your %s coffee.\n", getBrand());
    }

    public void brew() {
        System.out.println("Brewing your " + getSize() + "oz coffee.");
    }

    public void serve(){
        System.out.printf("Your %soz, %s, %s, %s, is served.\n", getSize(), getBrand(), getTemp(), getStyle());
    }

    public void remind() {
        System.out.printf("I have a %s oz, %s, %s, %s, for Jay? \n", getSize(), getTemp(), getBrand(), getStyle());
    }

    // Accessors
    public String getBrand() {
        return brand;
    }

    // data constraint: must be "Stout Coffee House", "Fiddlers", or "Reformed Roasters"
    // JR: unnecessary if enum used instead
    public void setBrand(String brand) {
        switch (brand) {
            case "Stout Coffee House":
            case "Fiddlers":
            case "Reformed Roasters":
                this.brand = brand;
                break;
            default:
                System.out.printf("Invalid Brand: %s . Only the brands: %s are currently in stock.",
                        brand, Arrays.toString(VALID_BRANDS));
        }
    }

    public int getSize() {
        return size;
    }

    // JR: include the client's provided value in the error message
    //  System.out.println("Invalid size: " + size + ", valid sizes are 8, 12, 16")
    public void setSize(int size) {
        if (size == 8 || size == 12 || size == 16) {
            this.size = size;
        }
        else {
            System.out.println("Invalid size: " + size + "Valid Sizes are: 8, 12, and 16");
        }
    }

    public TempType getTemp() {
        return temp;
    }

    public void setTemp(TempType temp) {
        this.temp = temp;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    // toString()
    public String toString() {
        return String.format("Coffee: brand = %s, size = %s, temp = %s, style = %s", getBrand(), getSize(), getTemp(), getStyle());
    }
}
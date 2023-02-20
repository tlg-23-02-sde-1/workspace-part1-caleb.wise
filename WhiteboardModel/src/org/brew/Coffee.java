package org.brew;

import java.util.Arrays;

public class Coffee {

    // static constants
    private static int orderNumber = 0;
    public static int getOrderNumber() {
        return orderNumber;
    }
    public static final String[] VALID_BRANDS =
            {"Stout Coffee House", "Fiddlers", "Reformed Roasters"};

    // - - - - - - - - - - - - - - - - - - - - - - - - -

    // properties
    public String brand = "Reformed Roasters";
    private int size; // constraint: 8, 12, 16 oz
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
    public Coffee(int size, TempType temp) {
        this(temp);
        setSize(size);
    }
    public Coffee(String brand, int size, TempType temp, Style style) {
        this(size, temp);
        setBrand(brand);
        setStyle(style);
    }

    // methods
    public void grind() {
        System.out.printf("Grinding your %s coffee.\n", getBrand());
    }
    public void brew() {
        System.out.println("Brewing your " + getSize() + "oz coffee.");
    }
    public void serve(){
        System.out.printf("Your %soz, %s, %s, %s, is served.", getSize(), getBrand(), getTemp(), getStyle());
    }
    public void remind() {
        System.out.printf("I have a %s oz, %s, %s, %s, for Jay? ", getSize(), getTemp(), getBrand(), getStyle());
    }

    // Accessors
    public String getBrand() {
        return brand;
    }

    // data constraint: must be "Stout Coffee House", "Fiddlers", or "Reformed Roasters"
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
    public void setSize(int size) {
        if (size == 8 || size == 12 || size == 16) {
            this.size = size;
        }
        else {
            System.out.println("Invalid size. Valid Sizes are: 8, 12, and 16");
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
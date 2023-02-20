package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Application "main-class" (class with the main method() class).
 * We'll create a few instances of Television and give them a basic test drive.
 */
class TelevisionClient {

    // STARTING point for any standalone Java application
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created.");
        System.out.println();

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);
        tv1.setDisplay(DisplayType.LCD);

        Television tv2 = new Television("Sony", Television.MIN_VOLUME, DisplayType.PLASMA);

        Television tv3 = new Television("LG");

        tv1.turnOn();
        tv1.turnOff();

        System.out.println();

        tv2.turnOn();
        tv2.turnOff();

        System.out.println();

        tv3.turnOn();
        tv3.turnOff();

        System.out.println();

        System.out.println(tv1); // toString() automatically called
        System.out.println(tv2);
        System.out.println(tv3);

        System.out.println();

        System.out.println(Television.getInstanceCount() + " instances have been created.");

    }
}
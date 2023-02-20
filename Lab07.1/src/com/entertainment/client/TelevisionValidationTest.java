package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();
        tv.setVolume(0);
        System.out.println("volume:" + tv.getVolume());
        tv.setVolume(100);
        System.out.println("volume:" + tv.getVolume());
        tv.setVolume(-1);
        System.out.println("volume:" + tv.getVolume());
        tv.setVolume(101);
        System.out.println("volume:" + tv.getVolume());
        System.out.println();

        tv.setBrand("Samsung");
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("LG");
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("Sony");
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("Toshiba");
        System.out.println("brand: " + tv.getBrand());

        tv.setBrand("INVALID");
        System.out.println("brand: " + tv.getBrand());
    }
}
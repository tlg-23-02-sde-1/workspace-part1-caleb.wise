/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 2250.0));
        dept.addEmployee(new HourlyEmployee("Julie",   LocalDate.of(2000, 2, 2), 65.0, 12.0));
        dept.addEmployee(new SalariedEmployee("Caleb", LocalDate.of(2016, 5, 16), 1600.0));
        dept.addEmployee(new HourlyEmployee("Hannah",  LocalDate.of(2018, 2, 25), 25.0, 20.0));
        dept.addEmployee(new Executive("Bobby",        LocalDate.of(2016, 05, 20), 75_000.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay all Employees
        System.out.println("\nPay employees:");
        dept.payEmployees();

        // holidayBreak
        System.out.println("\nHoliday break");
        dept.holidayBreak();
    }
}
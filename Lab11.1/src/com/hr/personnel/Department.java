/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    private Collection<Employee> employees = new ArrayList<>();

    // constructors
    public Department() { // a superclass ctor is always called, whether you say this or not!
        super();
    }

    public Department(String name, String location) {
        super();          // a superclass ctor is always called, whether you say this or not!
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (Employee emp : employees) {
            System.out.println(emp);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (Employee emp : employees) {
            emp.work();
        }
    }

    public void payEmployees() {
        for (Employee emp : employees) {
            emp.pay();
        }
    }

    /*
     * "Forced vacation." That is, for all employees that take vacation (salaried Employees),
     * make them take vacation. How can we find out what exact type we have here???
     */
    public void holidayBreak() {
        for (Employee emp : employees) {
            // downcast the Employee reference (employ[i]) to specific type SalariedEmployee
            // then we can call SalariedEmployee-specific methods (like takeVacation)
            // First, we ask employees[i], "Are you really a SalariedEmployee?"
            // instanceof is an "IS-A" check
            if(emp instanceof SalariedEmployee) {
                // downcast and method call in one shot
                // ((SalariedEmployee) employees[i]).takeVacation();

                SalariedEmployee semp = (SalariedEmployee) emp;
                semp.takeVacation();
            }
        }
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println(emp);
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name= " + getName() + ", location= " + getLocation();
    }
}
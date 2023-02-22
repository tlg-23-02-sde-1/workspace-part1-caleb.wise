package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    private double salary;

    // business methods
    @Override // interface TaxPayer
    public void pay() {
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    @Override // interface TaxPayer
    public void fileReturn() {
        System.out.println("Return filed electronically.");
    }

    @Override // interface TaxPayer
    public double getStandardDeduction() {
        return 10_000.0;
    }

    public void takeVacation() {
        System.out.println(getName() + " is on vacation.");
    }
    @Override   // interface TaxPayer
    public void payTaxes() {
        // double taxes = getSalary() * SALARIED_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + (getSalary() * TaxPayer.SALARIED_TAX_RATE));
    }

    // accessor methods
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); // delegate to superclass ctor for name, hireDate
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);  // delegate to neighboring ctor for name, hireDate
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary= " + getSalary();
    }
}
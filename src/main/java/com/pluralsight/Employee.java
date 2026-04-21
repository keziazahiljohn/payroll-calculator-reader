package com.pluralsight;

public class Employee {
    private int employeeId = 0;
    private String name = "";
    private double hoursWorked = 0.0;
    private double payRate = 0.0;

    public Employee(int id, String name, double hoursWorked, double payRate) {
        this.employeeId = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public String toString() {
        return employeeId + " | " + name + " | " + hoursWorked + " | " + payRate;
    }

    public double getGrossPay() {
        return hoursWorked * payRate;
    }
}

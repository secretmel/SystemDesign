package com.rental.customers;

import com.rental.vehicles.Vehicle;

public class Customer {
    private final String name;
    private final String customerID;

    // Static variable to keep track of the total number of customers
    private static int totalCustomers = 0;

    public Customer(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
        totalCustomers++;  // Increment the total customer count when a new customer is created
    }

    // Static method to get the total number of customers
    public static int getTotalCustomers() {
        return totalCustomers;
    }

    public String getName() {
        return name;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void rentVehicle(Vehicle vehicle) {
        System.out.println(name + " (ID: " + customerID + ") is trying to rent a " + vehicle.getVehicleType() + ".");
        vehicle.rent();
    }

    public void returnVehicle(Vehicle vehicle) {
        System.out.println(name + " (ID: " + customerID + ") is returning a " + vehicle.getVehicleType() + ".");
        vehicle.returnVehicle();
    }
}

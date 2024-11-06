package com.rental.vehicles;

public class Car extends Vehicle {

    public Car(String vehicleID, String make, String model) {
        super(vehicleID, make, model);  // Calling the superclass constructor
    }

    @Override
    public String getVehicleType() {
        return "Car";  // Specific implementation for Car
    }

    @Override
    public String getVehicleID() {
        return super.getVehicleID();  // Get the vehicle ID from the parent class
    }

    
    @Override
    public void scheduleMaintenance() {
        System.out.println("Scheduling maintenance for Car with ID: " + getVehicleID());
    }

    
    @Override
    public boolean isUnderMaintenance() {
        // Logic for checking if the car is under maintenance (dummy implementation)
        return false;  // Assume not under maintenance for now
    }
}

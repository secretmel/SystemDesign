package com.rental.vehicles;

public class Bike extends Vehicle {

    private final boolean hasCarrier;  // private field

    public Bike(String vehicleID, String make, String model) {
        super(vehicleID, make, model);
        this.hasCarrier = false;
    }

    public Bike(String vehicleID, String make, String model, boolean hasCarrier) {
        super(vehicleID, make, model);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public String getVehicleType() {
        return "Bike";  // Overriding the method from Vehicle class
    }

    public void displayInfo() {
        System.out.println("Vehicle Type: " + getVehicleType() + ", Make: " + getMake() + ", Model: " + getModel() + ", Carrier: " + (hasCarrier ? "Yes" : "No"));
    }

    // Protected method, accessible by subclasses
    protected void displayMaintenanceStatus() {
        System.out.println("Bike maintenance status: " + (hasCarrier ? "With Carrier" : "Without Carrier"));
    }

    // Private method, only accessible within the Bike class
    @SuppressWarnings("unused")
    private void performBikeSpecificMaintenance() {
        System.out.println("Performing specific bike maintenance...");
    }

    @Override
    public String getVehicleID() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void scheduleMaintenance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isUnderMaintenance() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

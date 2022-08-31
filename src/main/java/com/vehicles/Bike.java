/*
 * Author Name: Philip Meshach
 * Date: 31-08-2022
 * Praise The Lord
 */
package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle {
    // A private variable that is only accessible within the class.
    private int maxSpeed;

    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    // Overriding the method from the parent class.
    public String getManufacturer() {
        return "Bike{} " + super.toString();
    }

    @Override
    // A method that is overriding the method from the parent class.
    public int maxSpeed(String vehicleType) {
        if (vehicleType.equals("sportsBike")) {
            return 300;
        } else if (vehicleType.equals("cruiser")) {
            return 170;
        }
        return maxSpeed;
    }
}
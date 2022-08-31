/*
 * Author Name: Philip Meshach
 * Date: 31-08-2022
 * Praise The Lord
 */
package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle {
    // Declaring a variable.
    private int maxSpeed;

    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    // A method that returns an integer.
    public int maxSpeed(String vehicleType) {
        if (vehicleType.equals("SportsCar")) {
            return 250;
        } else if (vehicleType.equals("Sedan")) {
            return 170;
        }
        return maxSpeed;
    }

    @Override
    // A method that returns a string.
    public String getManufacturer() {
        return "Car" + super.toString();
    }
}

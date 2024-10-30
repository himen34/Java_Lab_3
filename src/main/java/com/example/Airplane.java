package com.example;


/**
 * The {@code Airplane} class represents an airplane with attributes such as 
 * model, capacity, range, fuel consumption, and manufacturer.
 * <p>
 * Example usage:
 * <pre>
 *     Airplane airplane = new Airplane("Boeing 747", 366, 13800, 4.8, "Boeing");
 * </pre>
 * </p>
 */
public class Airplane {
    private String model;         // The model of the airplane (e.g., "Boeing 747")
    private int capacity;         // The passenger capacity of the airplane
    private int range;            // The range of the airplane in kilometers
    private double fuelConsumption; // Fuel consumption in liters per kilometer
    private String manufacturer;  // The manufacturer of the airplane (e.g., "Boeing")

    /**
     * Constructs an {@code Airplane} object with the specified attributes.
     *
     * @param model            The model of the airplane. Must be between 1 and 50 characters.
     * @param capacity         The passenger capacity. Must be between 1 and 1000.
     * @param range            The range of the airplane. Must be between 1 and 20000.
     * @param fuelConsumption  The fuel consumption in liters per kilometer. Must be positive.
     * @param manufacturer     The manufacturer of the airplane. Must be between 1 and 50 characters.
     * @throws IllegalArgumentException If any of the parameters are out of the specified ranges.
     */
    public Airplane(String model, int capacity, int range, double fuelConsumption, String manufacturer) {
        if (model == null || model.length() < 1 || model.length() > 50) {
            throw new IllegalArgumentException("Model must be between 1 and 50 characters.");
        }
        if (capacity < 1 || capacity > 1000) {
            throw new IllegalArgumentException("Capacity must be between 1 and 1000.");
        }
        if (range < 1 || range > 20000) {
            throw new IllegalArgumentException("Range must be between 1 and 20000 kilometers.");
        }
        if (fuelConsumption <= 0) {
            throw new IllegalArgumentException("Fuel consumption must be positive.");
        }
        if (manufacturer == null || manufacturer.length() < 1 || manufacturer.length() > 50) {
            throw new IllegalArgumentException("Manufacturer must be between 1 and 50 characters.");
        }

        this.model = model;
        this.capacity = capacity;
        this.range = range;
        this.fuelConsumption = fuelConsumption;
        this.manufacturer = manufacturer;
    }

    // Getters for each field
    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRange() {
        return range;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}

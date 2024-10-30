package com.example;

import java.util.Arrays;
import java.util.Comparator;

/**
 * The {@code AirplaneManager} class provides methods for managing and manipulating 
 * arrays of {@code Airplane} objects. It includes functionality for sorting 
 * and finding specific airplane objects.
 */
public class AirplaneManager {

    /**
     * Sorts an array of {@code Airplane} objects first by model in ascending order, 
     * and then by range in descending order if models are equal.
     *
     * @param airplanes The array of {@code Airplane} objects to be sorted. 
     *                  The array must not be null.
     */
    public void sortAirplanes(Airplane[] airplanes) {
        Arrays.sort(airplanes, Comparator
            .comparingInt(Airplane::getRange) // Sort by model in ascending order.
            .thenComparing(Comparator.comparingDouble(Airplane::getFuelConsumption).reversed())); // Sort by range in descending order.
    }

    /**
     * Finds a specific {@code Airplane} object in an array by comparing all relevant attributes.
     *
     * @param airplanes The array of {@code Airplane} objects to search. 
     *                  The array must not be null.
     * @param target    The {@code Airplane} object to find in the array. 
     *                  It must not be null.
     * @return The matching {@code Airplane} object if found, or null if not found.
     * @throws IllegalArgumentException if target is null.
     */
    public Airplane findAirplane(Airplane[] airplanes, Airplane target) {
        if (target == null) {
            throw new IllegalArgumentException("Target airplane cannot be null.");
        }
        
        for (Airplane airplane : airplanes) {
            if (airplane.getModel().equals(target.getModel()) &&
                airplane.getCapacity() == target.getCapacity() &&
                airplane.getRange() == target.getRange() &&
                airplane.getFuelConsumption() == target.getFuelConsumption() &&
                airplane.getManufacturer().equals(target.getManufacturer())) {
                return airplane;
            }
        }
        return null;
    }

    /**
     * Prints the details of an {@code Airplane} object to the standard output.
     *
     * @param airplane The {@code Airplane} object to print. 
     *                 It can be null.
     */
    public void printAirplane(Airplane airplane) {
        if (airplane != null) {
            System.out.println(airplane.getModel() + ", " 
                    + airplane.getCapacity() + ", " 
                    + airplane.getRange() + ", " 
                    + airplane.getFuelConsumption() + ", " 
                    + airplane.getManufacturer());
        } else {
            System.out.println("Airplane is null.");
        }
    }
}

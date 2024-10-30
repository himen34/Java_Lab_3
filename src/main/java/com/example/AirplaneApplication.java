package com.example;

/**
 * The {@code AirplaneApplication} class serves as the entry point for the airplane 
 * management application. It demonstrates the functionality of the 
 * {@code Airplane} and {@code AirplaneManager} classes by creating airplane 
 * objects, sorting them, and finding a specific airplane.
 */
public class AirplaneApplication {

    public static void main(String[] args) {
        try {
            // Create an array of Airplane objects
            Airplane[] airplanes = {
                new Airplane("Boeing 747", 366, 13800, 4.8, "Boeing"),
                new Airplane("Airbus A380", 555, 15000, 5.5, "Airbus"),
                new Airplane("Boeing 737", 200, 7800, 2.9, "Boeing"),
                new Airplane("Airbus A320", 180, 6100, 2.5, "Airbus"),
                new Airplane("Embraer E190", 106, 4500, 2.0, "Embraer"),
                new Airplane("Safran A900", 250, 4500, 3.0, "Safran"),
                new Airplane("Lockheed A900", 250, 7800, 3.5, "Lockheed"),
            };
            
            // Create an instance of AirplaneManager
            AirplaneManager airplaneManager = new AirplaneManager();

            System.out.println("\n---Sorting---");
            System.out.println("\n* based on fields: 1) Range (ascending), 2) Fuel Consumption (descending) *\n");

            // Sort the array of airplane objects
            System.out.println("\nBefore sorting:");
            printAirplaneArray(airplanes, airplaneManager);

            airplaneManager.sortAirplanes(airplanes);

            System.out.println("\nAfter sorting:");
            printAirplaneArray(airplanes, airplaneManager);

            System.out.println("\n---Finding identical object---");

            // Create a target Airplane object to find
            Airplane targetAirplane = new Airplane("Boeing 737", 200, 7800, 2.9, "Boeing");
            System.out.println("\nThe target airplane: ");
            airplaneManager.printAirplane(targetAirplane);

            // Find the target airplane in the array
            Airplane foundAirplane = airplaneManager.findAirplane(airplanes, targetAirplane);

            // Display the result of the search
            if (foundAirplane != null) {
                System.out.println("\nFound the target airplane: ");
                airplaneManager.printAirplane(foundAirplane);
            } else {
                System.out.println("\nTarget airplane not found.");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("\n\nError: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }
    }

    /**
     * Helper method to print the array of {@code Airplane} objects 
     * using the {@code AirplaneManager}'s printAirplane method.
     *
     * @param airplanes The array of {@code Airplane} objects to print.
     * @param airplaneManager The {@code AirplaneManager} instance used for printing.
     */
    private static void printAirplaneArray(Airplane[] airplanes, AirplaneManager airplaneManager) {
        for (Airplane airplane : airplanes) {
            airplaneManager.printAirplane(airplane);
        }
    }
}

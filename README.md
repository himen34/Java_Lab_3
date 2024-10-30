# Lab Work 3: Classes in Java

### Overview
This lab work implements an airplane management system that allows users to create airplane objects, sort them based on specified criteria, and find identical airplanes. It helps in understanding class management in Java by creating and utilizing custom classes, along with built-in Java classes like `Arrays` and `Comparator`.

The lab work is done for Variant № 24.

### Features
- Creates airplane objects with attributes such as model, capacity, range, airline, and year of manufacture. 
- Sorts airplane objects primarily by range in ascending order and secondarily by fuel consumption in descending order.
- Searches for a specific airplane object in an array based on all attributes.
- Exception handling for:
  - Invalid input for airplane attributes.
  - Capacity limits ranging from 1 to 1000.
  - Character limits for string attributes (1 to 100 characters).
- Includes the following classes: `Airplane`, `AirplaneManager`, `AirplaneApplication`.

### Usage
Modify the airplane objects in the `AirplaneApplication` file to create different airplane instances as needed. You can also change the parameters, based on which the sorting is done, in the `sortAirplanes()` method in `AirplaneManager` file.
Save the file, recompile, and run the application to see the results in the command line interface (CLI).

## How to run the project

To run this project, you need to have [Maven](https://maven.apache.org/) installed on your computer. Follow the steps below to get started:

### 1. Clone the repository:

```bash
git clone https://github.com/himen34/Java_Lab_1.git
cd Java_Lab_3
```

### 2. Build the project:

```bash
mvn package
```

### 3. Run the project:

```bash
mvn clean compile exec:java
```

## Requirements

- Java 17 or higher
- Maven 3.6.0 or higher
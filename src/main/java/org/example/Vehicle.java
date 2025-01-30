package org.example;

public class Vehicle {
    public int numberOfWheels;
    public String color;
    public float engineSize;
    public String fuelType;

    /*
    Parameterized constructor for the vehicle class.
     */
    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType ) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    /*
    Default constructor for the vehicle class.
     */
    public Vehicle() {
        numberOfWheels = 4;
        color = "Silver";
        engineSize = 3.0f;
        fuelType = "Gasoline";
    }
    /*
    Setter method for the number of wheels.
     */
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    /*
    Setter method for the vehicle color.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /*
    Setter method for the vehicle engine size.
     */
    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    /*
    Setter method for the fuel type.
     */
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    /*
    Getter method for the number of wheels.
     */
    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    /*
    Getter method for the color.
     */
    public String getColor() {
        return color;
    }

    /*
    Getter method for the engine size.
     */
    public float getEngineSize() {
        return engineSize;
    }

    /*
    Getter method for the fuel type.
     */
    public String getFuelType() {
        return fuelType;
    }

    /*
    displayInfo() method displays all the fields of the object.
     */
    public void displayInfo(){
        System.out.println("Vehicle Class");
        System.out.println("Number of wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Fuel Type: " + fuelType);
    }
}

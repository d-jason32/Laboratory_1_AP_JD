package org.example;

public class Vehicle {
    public int numberOfWheels;
    public String color;
    public float engineSize;
    public String fuelType;

    public Vehicle(int numberOfWheels, String color, float engineSize, String fuelType ) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public Vehicle() {
        numberOfWheels = 4;
        color = "Silver";
        engineSize = 3.0f;
        fuelType = "Gasoline";
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo(){
        System.out.println("Vehicle Class");
        System.out.println("Number of wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Fuel Type: " + fuelType);
    }
}

package org.example;

public class Car extends Vehicle{
    public String brand;

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.brand = brand;
    }

    public Car() {
        numberOfWheels = 4;
        color = "Red";
        engineSize = 2.2f;
        fuelType = "Gasoline";
        brand = "Honda";
    }

    public void honk(){
        System.out.println("Honk, honk!");
    }
    @Override
    public void displayInfo(){
        System.out.println("Car Class");
        System.out.println("Number of wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Brand: " + brand);
    }
}
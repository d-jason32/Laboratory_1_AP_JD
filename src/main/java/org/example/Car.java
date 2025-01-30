package org.example;

public class Car extends Vehicle{
    public String brand;

    /*
    Parameterized constructor for car.
     */

    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.brand = brand;
    }

    /*
    Default constructor for car.
     */
    public Car() {
        numberOfWheels = 4;
        color = "Red";
        engineSize = 2.2f;
        fuelType = "Gasoline";
        brand = "Honda";
    }

    /*
    Honk method that prints out honk, honk.
     */
    public void honk(){
        System.out.println("Honk, honk!");
    }

    /*
    Display info method for car class, including the brand of the car.
     */
    @Override
    public void displayInfo(){
        System.out.println("Car Class: Display info");
        System.out.println("Number of wheels: " + numberOfWheels);
        System.out.println("Color: " + color);
        System.out.println("Engine Size: " + engineSize);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Brand: " + brand);
        System.out.printf("\n");
    }
}
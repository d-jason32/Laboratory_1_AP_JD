package org.example;

public class Car extends Vehicle{
    public String brand;

    Car(){

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
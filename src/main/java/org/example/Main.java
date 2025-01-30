package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a new Vehicle Class!");
        Vehicle truck = new Vehicle();
        truck.displayInfo();
        truck.setNumberOfWheels(5);
        truck.setColor("Orange");
        truck.setEngineSize(5.5f);
        truck.setFuelType("Diesel");
        truck.displayInfo();

        System.out.println("Get Methods:");
        System.out.println("Number of Wheels: " + truck.getNumberOfWheels() + "\n");
        System.out.println("Color: " + truck.getColor() + "\n");
        System.out.println("Engine Size: " + truck.getEngineSize() + "\n");
        System.out.println("Fuel Type: " + truck.getFuelType() + "\n");

        System.out.println("Creating a new Car class!");
        Car honda = new Car();
        honda.displayInfo();
        honda.honk();

        honda.setNumberOfWheels(2);
        honda.setColor("Black");
        honda.setEngineSize(0);
        honda.setFuelType("Electric");
        honda.displayInfo();

        System.out.println("Get Methods:");
        System.out.println("Number of Wheels: " + honda.getNumberOfWheels() + "\n");
        System.out.println("Color: " + honda.getColor() + "\n");
        System.out.println("Engine Size: " + honda.getEngineSize() + "\n");
        System.out.println("Fuel Type: " + honda.getFuelType() + "\n");
        }
    }

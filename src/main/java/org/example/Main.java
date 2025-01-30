package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehicle truck = new Vehicle();
        truck.displayInfo();


        System.out.println("Creating a new Car class!");
        Car honda = new Car();
        honda.displayInfo();
        honda.honk();
        }
    }

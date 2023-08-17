package edu.hillel.lesson5_preparation.abstraction;

public abstract class Car {

    public Car() {
        System.out.println("The current speed is " + getSpeed() + " km/h");
    }

    abstract int getSpeed();

    void switchOnEngine() {
        System.out.println("Engine is switching on...");
    }
}

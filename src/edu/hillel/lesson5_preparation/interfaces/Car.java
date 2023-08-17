package edu.hillel.lesson5_preparation.interfaces;

public interface Car extends Vehicle{

    int DEFAULT_SPEED = 60;

    int getSpeed();

    void startEngine();

    static void switchOnEngine() {
        System.out.println("Engine is switching on... ");
    }
}

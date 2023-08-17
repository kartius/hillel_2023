package edu.hillel.lesson5_preparation.overloading;

public interface Car extends Vehicle {

    int DEFAULT_SPEED = 60;

    int getSpeed();

    void startEngine();
    void startEngine(int initTime);
    void startEngine(int initTime, String notificationMessage);

    static void switchOnEngine() {
        System.out.println("Engine is switching on... ");
    }
}

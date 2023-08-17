package edu.hillel.lesson5_preparation.overloading;

public class Tesla implements Car {
    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void startEngine() {
        Car.switchOnEngine();
        System.out.println("start engine implementation");
    }

    @Override
    public void startEngine(int initTime) {
        try {
            Thread.sleep(initTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        startEngine();
    }

    @Override
    public void startEngine(int initTime, String notificationMessage) {
        System.out.println(notificationMessage);
        startEngine(initTime);
    }


    @Override
    public void run() {

    }
}

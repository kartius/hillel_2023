package edu.hillel.lesson5_preparation.polimorfism.persons;

import edu.hillel.lesson5_preparation.polimorfism.vehicals.Tesla;

public class Policemen {

    private Tesla tesla;

    public void checkSpeed() {
        final int currentSpeed = tesla.getSpeed();
        useRadar(currentSpeed);
        if (currentSpeed > 130) {
            stopCar();
        }
    }

    public void setTesla(Tesla tesla) {
        this.tesla = tesla;
    }

    private void useRadar(int speed) {
        System.out.println("Current speed is " + speed + " km/h");
    }

    private void stopCar() {
        System.out.println("Policemen is trying to stop the car...");
    }
}

package edu.hillel.lesson5_preparation.polimorfism.vehicals;

import java.util.Random;

public class Tesla extends Car {
    private final Random r = new Random();

    public Tesla() {
        autoPilot();
    }

    private int speed;

    @Override
    public int getSpeed() {
        System.out.println("Tesla");
        return speed;
    }

    private void autoPilot() {
        int min = 50;
        int max = 300;
        speed = r.nextInt(max - min) + min;
    }
}

package edu.hillel.lesson5_preparation.polimorfism.vehicals;

public class Deo extends Car{


    @Override
    public int getSpeed() {
        System.out.println("DEO");
        return super.getSpeed();
    }
}

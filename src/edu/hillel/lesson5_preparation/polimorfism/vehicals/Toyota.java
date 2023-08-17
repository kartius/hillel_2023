package edu.hillel.lesson5_preparation.polimorfism.vehicals;


public class Toyota extends Car {

    @Override
    public int getSpeed() {
        System.out.println("Toyota");
        return 90;
    }
}

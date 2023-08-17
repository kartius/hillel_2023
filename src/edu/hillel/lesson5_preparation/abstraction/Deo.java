package edu.hillel.lesson5_preparation.abstraction;


public class Deo extends Car {
    @Override
    int getSpeed() {
        System.out.println("Deo");
        return 50;
    }
}

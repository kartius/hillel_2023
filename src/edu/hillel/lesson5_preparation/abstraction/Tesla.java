package edu.hillel.lesson5_preparation.abstraction;


public class Tesla extends Car {
    @Override
    int getSpeed() {
        System.out.println("Tesla");
        return 150;
    }
}

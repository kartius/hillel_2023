package edu.hillel.lesson6.hometask;

public class Cat {

    private Counter counter;

    public Cat(Counter counter) {
        this.counter = counter;
        this.counter.catIncrement();

    }
}

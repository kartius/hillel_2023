package edu.hillel.lesson3.association;

public class Car {
    private Engine engine;
    private BortComputer bortComputer;

    private Passenger passenger;

    public Car(Passenger passenger) {
        engine = new Engine();
        bortComputer = new BortComputer();
        this.passenger = passenger;
    }
}

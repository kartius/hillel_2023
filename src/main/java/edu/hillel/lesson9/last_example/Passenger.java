package edu.hillel.lesson9.last_example;

public class Passenger {

    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                '}';
    }
}

package edu.hillel.lesson9.last_example;

import java.util.Arrays;
import java.util.List;

public class PassengersSitToCarProcessor extends Processor<List<Passenger>, Car>{
    public PassengersSitToCarProcessor(String id, List<Passenger> data) {
        super(id, data);
    }

    @Override
    public Car process() {
        return new Car(getData());
    }


    public static void main(String[] args) {
        final List<Passenger> passengers = Arrays.asList(new Passenger("Bob"), new Passenger("Dave"), new Passenger("Jon"));

        PassengersSitToCarProcessor passengersSitToCarProcessor = new PassengersSitToCarProcessor("id", passengers);

        System.out.println(passengersSitToCarProcessor.process());
    }
}

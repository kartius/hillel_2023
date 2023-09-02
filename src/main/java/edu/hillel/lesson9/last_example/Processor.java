package edu.hillel.lesson9.last_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Processor<T, V> {
    private final String id;
    private final T data;


    public Processor(String id, T data) {
        this.id = id;
        this.data = data;
    }

    public abstract V process();

    public String getId() {
        return id;
    }

    public T getData() {
        return data;
    }


    public static void main(String[] args) {
        final List<Passenger> passengers = Arrays.asList(new Passenger("Bob"), new Passenger("Dave"), new Passenger("Jon"));
        PassengersSitToCarProcessor passengersSitToCarProcessor = new PassengersSitToCarProcessor("id", passengers);

        WordSplitProcessor wordSplitProcessor = new WordSplitProcessor("id", "Generics cool or not?");


        List<Processor> processors = new ArrayList<>();

        processors.add(passengersSitToCarProcessor);
        processors.add(wordSplitProcessor);

        for (Processor processor : processors) {
            System.out.println(processor.process());
        }


    }
}

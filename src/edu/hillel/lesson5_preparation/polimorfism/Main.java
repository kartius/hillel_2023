package edu.hillel.lesson5_preparation.polimorfism;

import edu.hillel.lesson5_preparation.polimorfism.persons.Policemen;
import edu.hillel.lesson5_preparation.polimorfism.vehicals.Tesla;

public class Main {

    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        Policemen policemen = new Policemen();
        policemen.setTesla(tesla);
        policemen.checkSpeed();
    }
}

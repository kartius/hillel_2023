package edu.hillel.lesson2;

import edu.hillel.lesson2.persons.Policemen;
import edu.hillel.lesson2.vehicals.Tesla;

public class Main {

    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        Policemen policemen = new Policemen();
        policemen.setTesla(tesla);
        policemen.checkSpeed();
    }
}

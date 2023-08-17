package edu.hillel.lesson4.objectmethods;

public class Animal {

    private static int count = 0;

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }
}

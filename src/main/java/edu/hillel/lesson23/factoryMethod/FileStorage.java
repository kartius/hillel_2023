package edu.hillel.lesson23.factoryMethod;

public class FileStorage implements DataStorage {
    @Override
    public void store(String data) {
        System.out.println("File storage "+ data);
    }
}

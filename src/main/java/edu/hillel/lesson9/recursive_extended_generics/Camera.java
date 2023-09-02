package edu.hillel.lesson9.recursive_extended_generics;

public class Camera extends Product<Camera> {

    @Override
    public int compareTo(Camera p) {
        System.out.println("try comparing...");
        return 0;
    }
}

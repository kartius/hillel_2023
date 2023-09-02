package edu.hillel.lesson9.extended_generics;

public class Camera extends Product implements Comparable<Camera>{


    public Camera(int id) {
        super(id);
    }

    @Override
    public int compareTo(Camera o) {
        return 0;
    }


}

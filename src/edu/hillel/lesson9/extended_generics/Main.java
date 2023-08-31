package edu.hillel.lesson9.extended_generics;

import edu.hillel.lesson8.C;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Container<Camera> container = new Container<>();

        List<Camera> cameras = new ArrayList<>();
        cameras.add(new Camera(4));

        final Camera camera = new Camera(1);

        System.out.println(container.find(cameras, camera));

    }
}

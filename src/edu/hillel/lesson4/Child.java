package edu.hillel.lesson4;

public class Child extends Parent{

    public Child(int age) {
//        super(age);
        this();
    }

    public Child() {
        System.out.println("Child");
    }
}

package edu.hillel.lesson4;

public class B extends A {

    static {
        System.out.println("Static block intitilization B");
    }


    {
        System.out.println("Block intitilization B");
    }

    public B() {
        System.out.println("Class B");
    }


    @Override
    public void print() {
        System.out.println("method b");
    }
}

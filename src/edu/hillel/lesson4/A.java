package edu.hillel.lesson4;

public class A {

    static {
        System.out.println("Static Block intitilization A");
    }

    {
        System.out.println("Block intitilization A");
    }

    public A() {
        System.out.println("Class A");
    }

    public void print(){
        System.out.println("method A");
    }
}

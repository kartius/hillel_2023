package edu.hillel.lesson5_preparation.abstraction;

public class Main {


    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        Deo deo = new Deo();

        System.out.println(tesla.getClass());




        Car car = new Car() {
            @Override
            int getSpeed() {
                return 123;
            }
        };
        System.out.println(car.getClass());
    }
}

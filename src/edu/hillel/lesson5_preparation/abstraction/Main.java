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


        Car teslaModelX = new Car() {
            @Override
            int getSpeed() {
                System.out.println("Tesla model X");
                return 150;
            }
        };

        Car deoMatiz = new Car() {
            @Override
            int getSpeed() {
                System.out.println("Deo Matiz");
                return 60;
            }
        };
    }
}

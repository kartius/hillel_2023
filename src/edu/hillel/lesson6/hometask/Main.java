package edu.hillel.lesson6.hometask;

public class Main {



    public static void main(String[] args) {
        Counter counter = new Counter();


        Cat cat1 = new Cat(counter);




        Cat cat2 = new Cat(counter);




        System.out.println(counter.getCatAmount());

    }




}

package edu.hillel.lesson5_preparation.home_task.good;

public class Cat extends Animal {
    private static int catCounter;

    public Cat() {
        catCounter++;
    }

    public int getCatCounter() {
        return catCounter;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.print(name + " пробежал " + distance + " метров." + "\n");
        } else {
            System.out.print(name + " остановился через " + 200 + " метров." + "\n");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.print(name + " не умеет плавать." + "\n");
    }
}

package edu.hillel.lesson5_preparation.home_task.good;

public class Dog extends Animal {
    private static int dogCounter;

    public Dog() {
        dogCounter++;
    }

    public int getDogCounter() {
        return dogCounter;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.print(name + " пробежал " + distance + " метров." + "\n");
        } else {
            System.out.print(name + " остановился через " + 500 + " метров." + "\n");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.print(name + " проплыл " + distance + " метров." + "\n");
        } else {
            System.out.print(name + " остановился через " + 10 + " метров." + "\n");
        }
    }
}

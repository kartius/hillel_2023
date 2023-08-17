package edu.hillel.lesson5_preparation.home_task.good;


public class Animal {
    protected String name;
    private static int animalCounter;

    public Animal() {
        animalCounter++;
    }
    public int getAnimalCounter() {
        return animalCounter;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(int distance) {
        if (distance <= 0) {
            System.out.print(name + " пробежал " + distance + " метров." + "\n");
        } else {
            System.out.print(name + " остановился через " + 0 + " метров." + "\n");
        }
    }

    public void swim(int distance) {
        if (distance <= 0) {
            System.out.print(name + " проплыл " + distance + " метров." + "\n");
        } else {
            System.out.print(name + " остановился через " + 0 + " метров." + "\n");
        }
    }
}

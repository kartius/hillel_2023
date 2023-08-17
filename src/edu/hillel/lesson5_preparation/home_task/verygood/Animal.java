package edu.hillel.lesson5_preparation.home_task.verygood;


public class Animal {
    final private int runThreshold;
    final private int swimThreshold;

    final private String name;

    public Animal(Counter counter,String name,int runThreshold, int swimThreshold) {
        counter.animalIncrement();
        this.runThreshold=runThreshold;
        this.swimThreshold=swimThreshold;
        this.name=name;
    }

    public void run(int block){
        if (block<= runThreshold) {
            System.out.println(this+" run "+block);
        }
        else {
            System.out.println(this+" can't run "+block);
        }
    }
    public void swim(int block){
        if (block<= swimThreshold) {
            System.out.println(this+" swim "+block);
        }
        else {
            System.out.println(this+" can't swim "+block);
        }
    }

    public String getName() {
        return name;
    }

}

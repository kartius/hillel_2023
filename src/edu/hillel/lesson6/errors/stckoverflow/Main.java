package edu.hillel.lesson6.errors.stckoverflow;

public class Main {


    public int calculateFactorial(int number) {
        return number * calculateFactorial(number - 1);
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.calculateFactorial(1);
    }
}

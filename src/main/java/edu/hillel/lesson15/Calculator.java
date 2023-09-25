package edu.hillel.lesson15;

import edu.hillel.lesson8.C;

public class Calculator {

    int result(TestInterface testInterface, int a1, int a2) {
        return testInterface.calculate(a1, a2);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.result(Integer::sum, 2, 4));
        System.out.println(calculator.result((a1, a2) -> a1 - a2, 1232, 4));
        System.out.println(calculator.result((a1, a2) -> a1 * a2, 1232, 4));
        System.out.println(calculator.result((a1, a2) -> a1 / a2, 1232, 4));
    }
}

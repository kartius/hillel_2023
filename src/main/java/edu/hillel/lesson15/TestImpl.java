package edu.hillel.lesson15;

public class TestImpl implements TestInterface, TestInterface2 {
    @Override
    public int calculate(int a1, int a2) {
        System.out.println(getConstant());
        return a1 + a2;
    }

    @Override
    public String getConstant() {
        return TestInterface2.super.getConstant();
    }
}

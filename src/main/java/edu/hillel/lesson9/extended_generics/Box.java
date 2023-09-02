package edu.hillel.lesson9.extended_generics;

public class Box<T extends Number> {

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<Double> doubleBox = new Box<>();
        doubleBox.setItem(34.5);

        Box<Integer> intBox = new Box<>();
        intBox.setItem(3);

        final double sum = doubleBox.getItem() + intBox.getItem();
        System.out.println(sum);
    }
}

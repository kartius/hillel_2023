package edu.hillel.lesson9.with_generics;

import java.util.ArrayList;

public class Box<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public <V> void print (V v){
        System.out.println(v);
    }

    public void setItem(T item) {
        this.item = item;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(Integer.valueOf(45));


        Box<String> strBox = new Box<>();

        strBox.setItem(new String("reret"));

        intBox.print("sdfdsfsdf");
        intBox.print(234324);
        intBox.print(new Object());
        intBox.print(new ArrayList<>());
    }
}

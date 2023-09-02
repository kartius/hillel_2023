package edu.hillel.lesson9.extended_generics;

import java.util.List;

public class Container<T extends Product & Comparable<T>> {


    public boolean find(List<? extends Product> products, Product p) {
        for (Product product : products) {
            if (product.equals(p)) {
                return true;
            }
        }
        return false;
    }
}

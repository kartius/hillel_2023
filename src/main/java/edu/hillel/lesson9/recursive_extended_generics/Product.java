package edu.hillel.lesson9.recursive_extended_generics;


import java.util.Objects;

public abstract class Product<T extends Product<T>> implements Comparable<T> {

    private String id;

    @Override
    public abstract int compareTo(T p);


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Product product)) {
            return false;
        }
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                '}';
    }
}

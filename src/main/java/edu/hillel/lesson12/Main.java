package edu.hillel.lesson12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Dummy dummy = new Dummy();
//        List<String> list = new ArrayList<>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.add("E");
//
//        final Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//
//        System.out.println("--------------------------");
//
//
//        final ListIterator<String> stringListIterator = list.listIterator();
//
//        while (stringListIterator.hasNext()) {
//            final String next = stringListIterator.next();
//            stringListIterator.set(next + " +");
//        }
//
//        final ListIterator<String> stringListIteratorAfterChange = list.listIterator();
//
//
//        while (stringListIteratorAfterChange.hasNext()) {
//            System.out.println(stringListIteratorAfterChange.next());
//        }
//
//        System.out.println("-----------------------------");
//
//        while(stringListIterator.hasPrevious()) {
//            System.out.println(stringListIterator.previous());
//        }


//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        System.out.println("Before removing: " + list.size());


//        for (Integer integer : list) {
//            if (integer.equals(3)) {
//                list.remove(integer);
//            }
//        }

//        final Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            if (iterator.next().equals(3)) {
//                iterator.remove();
//            }
//        }

//        List<Integer> toRemove = new ArrayList<>();
//
//        for (Integer integer : list) {
//            if (integer.equals(3)) {
//                toRemove.add(integer);
//            }
//        }
//
//        list.removeAll(toRemove);
//
//        System.out.println("After removing: " + list.size());


        // Compare with default capacity and without


        for (int i = 0; i < 1000000; i++) {
            dummy.m();
        }


//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>(10000000);
//
//        long start = System.nanoTime();
//
//        for (int i = 0; i < 10000000; i++) {
//            list1.add(i);
//        }
//
//        long result = System.nanoTime() - start;
//
//        System.out.println("Time of adding to list with default capacity: " + result / 1000000 + " ms");
//
//
//        long start1 = System.nanoTime();
//        for (int i = 0; i < 10000000; i++) {
//            list2.add(i);
//        }
//
//        long result1 = System.nanoTime() - start1;
//
//        System.out.println("Time of adding to list with initial capacity: " + result1 / 1000000 + " ms");


//        List<Integer> list1 = new ArrayList<>(10000000);
//        List<Integer> list2 = new LinkedList<>();
//
//        long start = System.nanoTime();
//
//        for (int i = 0; i < 10000000; i++) {
//            list1.add(i);
//        }
//
//        long result = System.nanoTime() - start;
//
//        System.out.println("Time of adding to array list: " + result / 1000000 + " ms");
//
//
//        long start1 = System.nanoTime();
//        for (int i = 0; i < 10000000; i++) {
//            list2.add(i);
//        }
//
//        long result1 = System.nanoTime() - start1;
//
//        System.out.println("Time of adding to linked list: " + result1 / 1000000 + " ms");


//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new LinkedList<>();
//
//        for (int i = 0; i < 50; i++) {
//            list1.add(i);
//        }
//
//        for (int i = 0; i < 50; i++) {
//            list2.add(i);
//        }
//
//        long start = System.nanoTime();
//
//        for (int i = 0; i < 10000000; i++) {
//            list1.add(i + 20, i);
//        }
//
//        long result = System.nanoTime() - start;
//
//        System.out.println("Time of adding to array list: " + result / 1000000 + " ms");
//
//
//        long start1 = System.nanoTime();
//        for (int i = 0; i < 10000000; i++) {
//            list2.add(i + 20, i);
//        }
//
//        long result1 = System.nanoTime() - start1;
//
//        System.out.println("Time of adding to linked list: " + result1 / 1000000 + " ms");



        int[] array = new int[50000];
        List<Integer> list1 = new ArrayList<>(50000);
        List<Integer> list2 = new LinkedList<>();

        for (int i = 0; i < 50000; i++) {
            array[i] = i;
        }

        for (int i = 0; i < 50000; i++) {
            list1.add(i);
        }

        for (int i = 0; i < 50000; i++) {
            list2.add(i);
        }


        long start3 = System.nanoTime();
        int i1;
        for (int i = 0; i <array.length; i++) {
            i1 = array[i];
        }

        long result3 = System.nanoTime() - start3;

        System.out.println("Time of getting from array: " + result3);

        long start = System.nanoTime();

        for (int i = 0; i < list1.size(); i++) {
            list1.get(i);
        }

        long result = System.nanoTime() - start;

        System.out.println("Time of getting from array list: " + result);


        long start1 = System.nanoTime();
        for (int i = 0; i < list2.size(); i++) {
            list2.get(i);
        }

        long result1 = System.nanoTime() - start1;

        System.out.println("Time of getting from linked list: " + result1);
    }
}

package edu.hillel.lesson14;

import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {


    public static void main(String[] args) {
        Queue<Integer> queueLinkedList = new LinkedList<>();

        queueLinkedList.add(1);
        queueLinkedList.add(2);
        queueLinkedList.add(3);

        System.out.println(queueLinkedList);

        queueLinkedList.poll();

        System.out.println(queueLinkedList);


        Deque<Integer> dequeueLinkedList = new LinkedList<>();

        dequeueLinkedList.add(1);
        dequeueLinkedList.add(2);
        dequeueLinkedList.add(3);

        dequeueLinkedList.pollLast();

        Queue<Integer> priorityQueue = new PriorityQueue<>(Integer::compare);

        priorityQueue.add(5);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(4);



        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);

    }
}

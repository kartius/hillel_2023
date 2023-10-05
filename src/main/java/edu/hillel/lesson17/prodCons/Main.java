package edu.hillel.lesson17.prodCons;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();


        List<Thread> producers = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            producers.add(new Thread(() -> IntStream.range(0, 10).forEach(n -> queue.add(randomValue()))));
        }


        List<Thread> consumers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            consumers.add(new Thread(() -> IntStream.range(0,10).forEach(n-> System.out.println(queue.poll()))));
        }


        for (Thread producer : producers) {
            producer.start();
        }

        for (Thread consumer : consumers) {
            consumer.start();
        }

    }

    private static Integer randomValue() {
        int min = 0;
        int max = 10000;
        return ThreadLocalRandom.current().nextInt(min, max - 1);
    }
}

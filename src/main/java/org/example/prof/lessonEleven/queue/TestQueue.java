package org.example.prof.lessonEleven.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new PriorityQueue<>();
        integerQueue.add(1);
        integerQueue.add(5);
        integerQueue.add(2);
        System.out.println(integerQueue);

        System.out.println(integerQueue.peek());
        System.out.println(integerQueue);
        System.out.println(integerQueue.poll());
        System.out.println(integerQueue);

    }
}

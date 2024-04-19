package org.example.prof.lessonEleven.queue.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExampleArrayDeque {
    // FIFO

    public static void main(String[] args) {
        Deque<String> strings = new ArrayDeque<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        //three->two-one


        strings.addFirst("Four");
        strings.addLast("Five");
        System.out.println(strings);
        //three ; two ; one

        System.out.println(strings.pollFirst());
        System.out.println(strings.pollLast());
        System.out.println(strings.poll());
        System.out.println(strings.poll());
        System.out.println(strings.poll());


    }
}

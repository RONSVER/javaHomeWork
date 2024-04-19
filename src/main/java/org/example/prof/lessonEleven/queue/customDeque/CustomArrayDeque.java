package org.example.prof.lessonEleven.queue.customDeque;

import java.util.Iterator;

public class CustomArrayDeque implements MyDeque {

    private final Integer[] elements;

    private int head;
    private int tail;

    public CustomArrayDeque(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("capacity must be more than 1");
        }
        this.elements = new Integer[capacity];
        this.head = (capacity - 1) / 2;
        this.tail = head;
    }

    @Override
    public void addToHead(Integer element) {
        if (isEmpty()) {
            head = elements.length / 2;
            tail = head;
        }
        if (head == 0) {
            throw new IllegalStateException("Deque is full");
        }
        head--;
        elements[head] = element;
    }

    @Override
    public void addToTail(Integer element) {
        if (tail == elements.length - 1) {
            throw new IllegalStateException("Deque is full");
        }
        elements[tail] = element;
        tail++;
    }

    @Override
    public Integer pollHead() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        Integer element = elements[head];
        head++;
        return element;
    }

    @Override
    public Integer pollTail() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        tail--;
        Integer element = elements[tail];
        return element;
    }

    @Override
    public Integer peekHead() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return elements[head];
    }

    @Override
    public Integer peekTail() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return elements[tail - 1];
    }

    @Override
    public boolean isEmpty() {
        return head == tail;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = tail - 1; i >= head; i--) {
            sb.append(elements[i]).append(" ");
        }
        return sb.toString();
    }




}

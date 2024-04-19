package org.example.prof.lessonEleven.queue.customDeque;

import java.util.ArrayDeque;

public class HomeWorkTestDequeApp {
    public static void main(String[] args) {
        CustomArrayDeque customDeque = new CustomArrayDeque(30); // Увеличиваем емкость до 30
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // Добавляем 10 элементов в начало обеих очередей
        for (int i = 0; i < 10; i++) {
            customDeque.addToHead(i);
            arrayDeque.addFirst(i);
        }

        // Добавляем 12 элементов в конец обеих очередей
        for (int i = 10; i < 22; i++) {
            customDeque.addToTail(i);
            arrayDeque.addLast(i);
        }

        // Удаляем 4 элемента с хвоста обеих очередей
        for (int i = 0; i < 4; i++) {
            customDeque.pollTail();
            arrayDeque.pollLast();
        }

        // Удаляем 2 элемента с головы обеих очередей
        for (int i = 0; i < 2; i++) {
            customDeque.pollHead();
            arrayDeque.pollFirst();
        }

        // Выводим результаты
        System.out.println("CustomArrayDeque: " + customDeque);
        System.out.println("ArrayDeque: " + arrayDeque);
    }
}

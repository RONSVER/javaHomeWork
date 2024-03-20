package org.example.prof.lessonEight.custom;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class TestMySecondCustomLinkedList {
    public static void main(String[] args) {
        MySecondLinkedList list = new MySecondLinkedList();

        // Добавляем элементы
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Выводим исходный список
        System.out.println("Исходный список: " + list);

        // Создаем итератор
        ListIterator<MySecondNode> iterator = list.listIterator();

        // Выводим элементы в прямом порядке с помощью итератора
        System.out.println("Прямой обход с помощью итератора:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Возвращаемся к последнему элементу
        System.out.println("Обратный обход с помощью итератора:");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }
        System.out.println();

        // Добавляем новый элемент
        list.add(5);
        System.out.println("Список после добавления нового элемента: " + list);

        // Удаляем элемент
        list.remove(2);
        System.out.println("Список после удаления элемента: " + list);

        // Добавляем элемент по индексу
        list.add(2, 6);
        System.out.println("Список после добавления элемента по индексу: " + list);

        // Заменяем текущий элемент
        iterator.next();
        iterator.set(new MySecondNode(7, null, null));
        System.out.println("Список после замены текущего элемента: " + list);

        // Добавляем элемент в начало списка
        list.addFirst(0);
        System.out.println("Список после добавления элемента в начало: " + list);

        // Выводим размер списка
        System.out.println("Размер списка: " + list.size());
    }
}

package org.example.prof.lessonEight.custom;

import java.util.Iterator;

public class TestCustomLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(5);
        list.add(4);
        list.add(7);
        list.add(2);
        System.out.println(list);

        list.addFirst(10);
        list.addFirst(15);

        System.out.println(list);
        System.out.println("size of my linkedList: " + list.size());

        list.add(1, 20);
        System.out.println(list);
        list.add(4, 30);
        System.out.println(list);
        System.out.println(list.size());

        list.remove(6);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


    }
}

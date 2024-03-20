package org.example.prof.lessonEight.custom;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList {

    private MyNode head;
    private int size;

    public Iterator<MyNode> iterator() {
        return new ItrCustomList();
    }

    public void add(int data) {
        // Создаем новый элемент
        size++;
        MyNode newNode = new MyNode(data, null);

        // если связаный список пустой, то выполнится условие ниже

        if (head == null) {
            head = newNode;
            return;
        }


        // Доходим до конца связного списка и присваиваем конечному
        // элементу ссылку на новый элемент
        // O(n) - n count of elements
        MyNode current = head;
        while(current.getNext() != null) {
            current = current.getNext();

        }
        current.setNext(newNode);
    }

    public void add(int index, int data) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }

        size++;

        //index 0 1 2 3 4
        //data  5 4 6 7 8
        //add by index 2

        // new el
        MyNode newNode = new MyNode(data, null);
        MyNode current = head;
        int counter = 0;
        while(counter < index -1) {
            current = current.getNext();
            counter++;
        }
        MyNode next = current.getNext();
        newNode.setNext(next);
        current.setNext(newNode);
    }




    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }

        size--;

        if (index == 0) {
            head = head.getNext();
        }

        MyNode current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }

        MyNode next = current.getNext();
        current.setNext(next.getNext());
    }





    // O(n)
    private String print() {
        StringBuilder sb = new StringBuilder();
        MyNode current = head;
        while (current != null) {
            sb.append(current.getData()).append(" ");
            current = current.getNext();
        }

        return sb.toString();
    }

    public int size() {
        return size;
    }


    @Override
    public String toString() {
        return print();
    }

    public void addFirst(int data) {
        MyNode newNode = new MyNode(data, null);
        size++;
        // если связаный список пустой, то выполнится условие ниже

        if (head == null) {
            head = newNode;
            return;
        }

        // если связаный список уже имеет эелементы
        newNode.setNext(head);
        head = newNode;

    }

    public class ItrCustomList implements Iterator<MyNode> {

        private MyNode currentEl = head;

        @Override
        public MyNode next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            MyNode elNow = currentEl;
            currentEl = currentEl.getNext();;

            return elNow;
        }

        @Override
        public boolean hasNext() {
            return currentEl != null;
        }
    }




}

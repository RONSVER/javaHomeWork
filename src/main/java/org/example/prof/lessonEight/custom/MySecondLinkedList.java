package org.example.prof.lessonEight.custom;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MySecondLinkedList {
    private MySecondNode head;
    private MySecondNode tail;
    private int size;

    public ListIterator<MySecondNode> listIterator() {
        return new ItrCustomListTwo();
    }

    public void add(int data) {
        // Создаем новый элемент
        size++;
        MySecondNode newNode = new MySecondNode(data, null, null);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
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
        MySecondNode newNode = new MySecondNode(data, null, null);
        MySecondNode current = head;
        int counter = 0;

        while (counter < index - 1) {
            current = current.getNext();
            counter++;
        }

        // nextEl хранит в себе следующий элемент после тоесть firstEl newEl SecondEl(NextEl)
        MySecondNode nextEl = current.getNext();
        newNode.setNext(nextEl);
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

        MySecondNode current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }

        MySecondNode next = current.getNext();
        current.setNext(next.getNext());
    }





    // O(n)
    private String print() {
        StringBuilder sb = new StringBuilder();
        MySecondNode current = head;
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
        MySecondNode newNode = new MySecondNode(data, head, null);
        size++;
        // если связаный список пустой, то выполнится условие ниже

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        } else {
            head.setPrev(newNode);
        }

        // если связаный список уже имеет эелементы
        head = newNode;

    }

    public class ItrCustomListTwo implements ListIterator<MySecondNode> {

        private MySecondNode currentElHead;
        private MySecondNode currentElTail;

        public ItrCustomListTwo() {
            this.currentElHead = head;
            this.currentElTail = tail;
        }

        @Override
        public MySecondNode next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            MySecondNode elNow = currentElHead;
            currentElHead = currentElHead.getNext();
            currentElTail = currentElHead != null ? currentElHead.getPrev() : tail; // Обновляем currentElTail
            return elNow;
        }


        @Override
        public boolean hasNext() {
            return currentElHead != null;
        }

        @Override
        public boolean hasPrevious() {
            return currentElTail != null;
        }

        @Override
        public MySecondNode previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }

            MySecondNode elNow = currentElTail;
            currentElTail = currentElTail.getPrev();
            currentElHead = currentElTail != null ? currentElTail.getNext() : head; // Обновляем currentElHead
            return elNow;
        }

        @Override
        public int nextIndex() {

            int counter = 0; // Начинаем счет с 0
            MySecondNode temp = currentElHead; // Начинаем с головного элемента
            while (temp != null) {
                if (temp == currentElHead) {
                    return counter;
                }

                counter++;
                temp = temp.getNext(); // Переходим к следующему элементу
            }
            return counter; // Возвращаем текущий индекс
        }


        @Override
        public int previousIndex() {

            int counter = size - 1;
            MySecondNode temp = currentElTail;
            while (temp != null) {
                if (temp == currentElTail) {
                    return counter;
                }

                counter--;
                temp = temp.getPrev();
            }
            return counter;
        }

        @Override
        public void remove() {
            if (currentElTail == null) {
                throw new IllegalStateException("No element to remove");
            }

            MySecondNode prevNode = currentElTail.getPrev();
            MySecondNode nextNode = currentElTail.getNext();

            if (prevNode != null) {
                prevNode.setNext(nextNode);
            } else {
                head = nextNode;
            }

            if (nextNode != null) {
                nextNode.setPrev(prevNode);
            } else {
                tail = prevNode;
            }

            currentElHead = prevNode;
            currentElTail = nextNode; // Обновляем текущий хвост
            size--;
        }





        @Override
        public void set(MySecondNode mySecondNode) {
           if (currentElHead != null) {
               currentElHead.setData(mySecondNode.getData());
           } else {
               System.out.println("No current element to set");
           }
        }

        @Override
        public void add(MySecondNode mySecondNode) {
            if (head == null) {
                currentElHead = mySecondNode;
                currentElTail = mySecondNode;
            } else {
                currentElTail.setNext(mySecondNode);
                mySecondNode.setPrev(currentElTail);
                currentElTail = mySecondNode;
            }
        }
    }
}
package org.example.prof.lessonSeven.homeWorkSeven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TaskOne {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }

        long startTime;
        long endTime;

//      --------------------

        startTime = System.currentTimeMillis();
        for (int i : list) {
            int temp = i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("1. for-each loop: " + (endTime - startTime) + " ms");

//        --------------------

        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("2. Classic for, вызываем list.size(): " + (endTime - startTime) + " ms");

//        --------------------
        int size = list.size();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("3. Classic for, определяем list.size() в переменную: " + (endTime - startTime) + " ms");

//        --------------------

        int sizeTwo = list.size();
        startTime = System.currentTimeMillis();
        for (int i = sizeTwo - 1; i >= 0; i--) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("4. Classic for, определяем list.size() в переменную, перебираем с конца: " + (endTime - startTime) + " ms");

    //        --------------------

        startTime = System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("5. использование Iterator: " + (endTime - startTime) + " ms");

        //        --------------------

        startTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("6. использование ListIterator: " + (endTime - startTime) + " ms");
    }
}

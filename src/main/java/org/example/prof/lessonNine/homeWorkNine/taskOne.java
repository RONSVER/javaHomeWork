package org.example.prof.lessonNine.homeWorkNine;

import java.util.*;

public class taskOne {
//    Задание 1 :
//    Генерировать список из 100 целочисленных элементов
//    Достаточно создать объект Random random = new Random();
//    И в цикле добавлять случайное значение в список в виде int element = random.nextInt(10);

//    Имея данный список и знания полученный об интерфейсе Set ,
//    вывести в консоль:

//      1)отсортированный набор уникальных элементов
//      2)набор только уникальных элементов

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> arrayList = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            int el = random.nextInt(10);
            arrayList.add(el);
        }

        Set<Integer> treeSet = new TreeSet();

        for (int el : arrayList) {
            treeSet.add(el);
        }

        System.out.println(treeSet);
        System.out.println(treeSet.size());


        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        for (int el : arrayList) {
            linkedHashSet.add(el);
        }

        System.out.println();
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.size());
    }


}

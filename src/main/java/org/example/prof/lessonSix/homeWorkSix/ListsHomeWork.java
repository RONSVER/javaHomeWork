package org.example.prof.lessonSix.homeWorkSix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsHomeWork {


    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<String> stringList = new ArrayList<>(Arrays.asList("Hi", "Hello", "Hey", "Buenos", "Hi", "Hello", "Hey", "Buenos"));
        System.out.println(noCopyFilter(stringList));

    }


    public static List<Integer> multiplyList(List<Integer> originalList) {
        List<Integer> newList = new ArrayList<>();

        for (int el : originalList) {
            newList.add(el * 2);
        }

        return newList;
    }

    public static List<Integer> sizeElStrList(List<String> strList) {
        List<Integer> sizeList = new ArrayList<>();

        for (String el : strList) {
            sizeList.add(el.length());
        }

        return sizeList;
    }

    public static List<Integer> evenListFilter (List<Integer> notEvenList) {
        List<Integer> evenList = new ArrayList<>();

        for (int el : notEvenList) {
            if (el % 2 != 0) {
                evenList.add(el);
            }
        }

        return evenList;
    }


    public static List<String> noCopyFilter (List<String> notFilterList) {
        List<String> noCopyList = new ArrayList<>();

        for (String el : notFilterList) {
            if (!noCopyList.contains(el)) {
                noCopyList.add(el);
            }
        }

        return noCopyList;
    }
}

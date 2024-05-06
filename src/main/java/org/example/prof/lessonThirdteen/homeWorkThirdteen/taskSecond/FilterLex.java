package org.example.prof.lessonThirdteen.homeWorkThirdteen.taskSecond;

import java.util.Arrays;
import java.util.List;

public class FilterLex {
/*
                                          Задание 2.
    Задан массив строк.
    Используя средства Stream API отсортировать строки в лексикографическом порядке.
*/

    public static void main(String[] args) {
        List<String> listFilterLex = Arrays.asList(
                "horse",
                "banana",
                "cat",
                "fish",
                "elephant",
                "apple",
                "jackal",
                "dog",
                "iguana",
                "grape"
        );

        listFilterLex.stream()
                .sorted(String::compareTo)
                .forEach(System.out::println);
    }


}

package org.example.prof.lessonThirdteen.homeWorkThirdteen.taskOne;

import java.util.Arrays;
import java.util.List;

public class FindLetterSurnameApp {
/*
                                           Задание 1.
    Задан список фамилий сотрудников.
    Разработать программу, которая отображает все фамилии, начинающиеся на букву «K».
    Задачу решить с использованием Stream API.
*/

    public static void main(String[] args) {
        List<String> listSurnameEmployees = Arrays.asList(
                "Kirkland",
                "Kendall",
                "Carver",
                "Franklin",
                "Kingston",
                "Cane",
                "Carpenter"
        );

        listSurnameEmployees.stream()
                .filter(el -> el.startsWith("K"))
                .forEach(System.out::println);
    }
}

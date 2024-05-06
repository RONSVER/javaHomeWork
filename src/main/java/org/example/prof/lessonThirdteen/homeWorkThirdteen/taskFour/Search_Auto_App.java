package org.example.prof.lessonThirdteen.homeWorkThirdteen.taskFour;

import java.util.Arrays;
import java.util.List;


public class Search_Auto_App {

/*
                                                Задание 4.
    Дан список автомобилей,
    10 штук, класс Auto имеет поля - номер авто, цвет, марка, пробег и цена (цена в диапазоне от 10 до 50 тысяч)
    Вывести список всех автомобилей ,которые имеют черный цвет и нулевой пробег.
    Вывести количество уникальных марок в ценовом диапазоне от 30 до 50 тысяч.
    Задачу решить с использованием Stream API.
*/

    public static void main(String[] args) {
        List<Auto> autoList = Arrays.asList(
                new Auto("Y100", "Black", "Toyota", 0, 20000),
                new Auto("X200", "Red", "Honda", 15000, 35000),
                new Auto("Z300", "Black", "Ford", 10000, 45000),
                new Auto("A400", "Black", "Chevrolet", 10000, 40000),
                new Auto("B500", "Blue", "Nissan", 20000, 30000),
                new Auto("C600", "White", "Bentley", 30000, 50000),
                new Auto("D700", "Black", "Lamborghini", 0, 48000),
                new Auto("E800", "Black", "Honda", 25000, 42000),
                new Auto("F900", "Black", "Ford", 0, 38000),
                new Auto("G1000", "Black", "Toyota", 0, 47000)
        );

        List<Auto> newBlacksCars = autoList.stream()
                .filter(el -> "Black".equals(el.getColor()))
                .filter(el -> el.getMileage() == 0)
                .toList();


        System.out.println(newBlacksCars);

        System.out.println();
        autoList.stream()
                .filter(el -> el.getPrice() >= 30000 && el.getPrice() <= 50000)
                .map(Auto::getMark)
                .distinct()
                .forEach(System.out::println);
    }

}

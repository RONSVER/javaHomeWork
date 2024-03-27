package org.example.prof.lessonNine.homeWorkNine.miniGame;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AppMiniGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Set<City> citySet = new HashSet<>();
        AppMiniGame appMiniGame = new AppMiniGame();

        appMiniGame.startGame(citySet);
    }

    public void startGame(Set<City> citySet) {
        System.out.println("Игра в города. Напишите слово 'Start', если готовы, или 'Quit' для выхода.");
        String readyOrNo = scanner.nextLine();

        if ("start".equalsIgnoreCase(readyOrNo)) {
            System.out.println("Пишите названия городов, пока не повторите хотя бы один город до 5 раз. " +
                    "После этого игра окончится и выведутся результаты.");

            playGame(citySet);
        } else if ("quit".equalsIgnoreCase(readyOrNo)) {
            System.out.println("GAME OVER!");
        } else {
            System.out.println("Неверные данные. Ошибка.");
        }
    }

    public void playGame(Set<City> citySet) {
        while(true) {
            System.out.print("Введите название города: ");
            City cityName = new City(scanner.nextLine());

            if (citySet.contains(cityName)) {
                for (City city : citySet) {
                    if (city.equals(cityName)) {
                        city.setRepeats(city.getRepeats() + 1);
                        if (city.getRepeats() == 5) {
                            System.out.println();
                            System.out.println("------------------------------");
                            System.out.println("Игра окончена! Достигнут порог повторений города " + cityName.getCityName() + ".");
                            printCities(citySet);
                            return;
                        }
                    }
                }
            } else {
                citySet.add(cityName);
            }
        }
    }

    public void printCities(Set<City> citySet) {
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Список всех названных городов:");
        for(City city : citySet) {
            System.out.println(city.getCityName() + " " + city.getRepeats());
        }

        System.out.println("------------------------------");

        System.out.println("Список городов, названных дважды или более:");
        for (City city : citySet) {
            if (city.getRepeats() >= 2) {
                System.out.println(city.getCityName() + " " + city.getRepeats());
            }
        }
        System.out.println("------------------------------");
    }
}

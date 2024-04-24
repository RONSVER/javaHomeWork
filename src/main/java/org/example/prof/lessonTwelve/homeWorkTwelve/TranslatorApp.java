package org.example.prof.lessonTwelve.homeWorkTwelve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    Создайте программу-переводчик с английского языка.
    Пользователь вводит слово на английском языке, переводчик показывает перевод.
    Если переводчик не обнаружил в словаре введённое слово, то он просит пользователя ввести перевод,
    после чего сохраняет слово и его перевод в словарь. Добавить возможность просмотра всего словаря
*/

public class TranslatorApp {
    final private static Map<String, String> dictionary = new HashMap<>();
    final private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Введите слово на английском языке (напишите 'exit' или 'выход' для выхода): ");
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("exit") || word.equalsIgnoreCase("выход")) {
                System.out.println("Вы вышли из программы. Удачи!");
                break;
            } else if (word.matches("^[А-Яа-я]+$")) {
                System.out.println("Некоректный язык!");
                break;
            }

            String translationWord = dictionary.get(word);

            if (translationWord != null) {
                System.out.println("Перевод слова " + word + ": " + translationWord);
            } else {
                System.out.println("Слово не найдено в словаре.");
                System.out.print("Введите перевод слова '" + word + "': ");
                String newTranslationWord = scanner.nextLine();
                if (newTranslationWord.matches("[A-Za-z]+")) {
                    System.out.println("Некоректный язык!");
                    break;
                }
                dictionary.put(word, newTranslationWord);
                System.out.println("Слово '" + word + "' добавлено в словарь.");
            }

            printDictionary();
        }
    }

    public static void printDictionary() {
        if (dictionary.isEmpty()) {
            System.out.println("Словарь пуст!");
        } else {
            System.out.println("--------");
            for (Map.Entry<String, String> entry : dictionary.entrySet()) {
                System.out.println("Слово на английском: " + entry.getKey() + " перевод слова: " + entry.getValue());
            }
            System.out.println("--------");
        }
    }
}

package org.example.prof.lessonNine.homeWorkNine;

import java.util.*;

public class taskTwo {
    /*
    Задание 2:
    Взять две строки случайных символов ,длина каждой строки от 20 до 50 символов.
    Вывести в консоль список символов которые встречаются только один раз на все две строки.
    */

    public static void main(String[] args) {
        taskTwo taskTwo = new taskTwo();
        String strOne = taskTwo.generateRandomString(20, 50);
        String strTwo = taskTwo.generateRandomString(20, 50);
        Map<Character, Integer> map = new HashMap<>();
        System.out.println("first str " + strOne);
        System.out.println("second str " + strTwo);
        System.out.println();

        taskTwo.countCharacters(strOne, map);
        taskTwo.countCharacters(strTwo, map);

        System.out.println("Characters occurring only once in both strings:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
                System.out.println(entry.getValue());
            }
        }
    }

    public String generateRandomString(int minLength, int maxLength) {
        Random random = new Random();
        int length = random.nextInt(maxLength - minLength + 1) + minLength;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char el = (char) (random.nextInt(26) + 'a');
            stringBuilder.append(el);
        }

        return stringBuilder.toString();
    }

    public void countCharacters(String str, Map<Character, Integer> hashMap) {
        for (char charEl : str.toCharArray()) {
            hashMap.put(charEl, hashMap.getOrDefault(charEl, 0) + 1);
        }
    }
    public void fillCharacters(String str, Set<Character> hashSet) {
        for (char charEl : str.toCharArray()) {
            hashSet.add(charEl);
        }
    }
}

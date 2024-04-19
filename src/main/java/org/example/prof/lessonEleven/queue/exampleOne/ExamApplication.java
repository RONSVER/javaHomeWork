package org.example.prof.lessonEleven.queue.exampleOne;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;

public class ExamApplication {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Alex"),
                new Student("Oleg"),
                new Student("Max"),
                new Student("Egor"),
                new Student("Slava")
        );

        Random random = new Random();

        // Присваиваем случайные оценки студентам от 0 до 99
        for (Student student : studentList) {
            student.setRate(random.nextInt(100));
        }

        System.out.println("Список студентов:");
        System.out.println(studentList);

        // Создаем приоритетную очередь и добавляем студентов в нее
        PriorityQueue<Student> studentsQueue = new PriorityQueue<>(new RateComporator());
        studentsQueue.addAll(studentList);

        System.out.println("\nПриоритетная очередь студентов:");
        System.out.println(studentsQueue);

        // Выводим топ-3 студентов
        System.out.println("\nТоп-3 студентов:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " место: " + studentsQueue.poll());
        }
    }
}

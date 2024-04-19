package org.example.prof.lessonEleven.homeWorkEleven.taskTwo;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PassengerApp {
/*
  2) Имеется очередь пассажиров(класс Passenger), часть из которых является клиентами 1 ого класса, которые
   должны идти на посадку первыми.
   Написать приложение, которое создаст 10 пассажиров, из них 3 пассажира 1 ого класса.
   Отправить всех в одну очередь, разбирать очередь пока она не станет пустая.
   Пассажиры 1 ого класса должны быть в очереди первыми.
*/
    public static void main(String[] args) {
        // Использовал тип очереди PriorityQueue для установки приоритетов с помощью компаратора.

        // Компаратор:
        // Использовал оператор ! для инвертирования значений и установки правильной логики в компараторе.
        // 1 - Если результат положительный, это означает, что первый элемент должен идти после второго в отсортированной последовательности.
        // -1 - Если результат отрицательный, это означает, что первый элемент должен идти перед вторым.
        // 0 - Если результат равен нулю, это означает, что оба элемента равны по сортировочному критерию.

        // (o1, o2) -> Boolean.compare(!o1.getFirstClassPassenger(), !o2.getFirstClassPassenger())

        // 1 - (если o1 - true, o2 - false)
        // -1 - (если o1 - false, o2 - true)
        // 0 - (если o1 - true и o2 - true, или o1 - false и o2 - false)

        Queue<Passenger> passengerQueue = new PriorityQueue<>((o1, o2) -> Boolean.compare(!o1.getFirstClassPassenger(), !o2.getFirstClassPassenger()));
        Random random = new Random();

        // Циклом добавлены пассажиры, причем каждый рандомно может быть пассажиром первого класса.
        for (int i = 0; i < 10; i++) {
            boolean isFirstClass = random.nextBoolean();
            Passenger passenger = new Passenger("Passenger:" + i, isFirstClass);
            passengerQueue.add(passenger);
        }

        // Вывод пассажиров.
        while (!passengerQueue.isEmpty()) {
            System.out.println(passengerQueue.poll());
        }
    }
}

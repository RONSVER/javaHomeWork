package org.example.prof.lessonThirdteen.homeWorkThirdteen.taskThree;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class Phone_App_Stream_HomeWork {
/*
                                          Задание 3.

    Вывести в консоль самого взрослого клиента, который использует стационарный телефон.
    Задачу решить с использованием Stream API.
*/

    public static void main(String[] args) {
        List<Client> clientList = Arrays.asList(
                new Client(1, "Mark", 23, Arrays.asList(
                        new PhoneHomeWorkStreams("+1 234543", "stationary"),
                        new PhoneHomeWorkStreams("+2 45647847", "mobile")
                )),
                new Client(2, "Petr", 43, Arrays.asList(
                        new PhoneHomeWorkStreams("+3 256757893", "stationary"),
                        new PhoneHomeWorkStreams("+4 90007", "stationary")
                )),
                new Client(3, "Kiril", 99, Arrays.asList(
                        new PhoneHomeWorkStreams("+5 7893", "stationary"),
                        new PhoneHomeWorkStreams("+6 1007", "mobile")
                )),
                new Client(4, "Semen", 33, Arrays.asList(
                        new PhoneHomeWorkStreams("+7 73", "stationary"),
                        new PhoneHomeWorkStreams("+8 107", "stationary")
                )),
                new Client(5, "Kiril", 11, Arrays.asList(
                        new PhoneHomeWorkStreams("+9 7893", "stationary"),
                        new PhoneHomeWorkStreams("+10 1007", "mobile")
                )),
                new Client(6, "Semen", 73, Arrays.asList(
                        new PhoneHomeWorkStreams("+11 39", "stationary"),
                        new PhoneHomeWorkStreams("+19 377779", "stationary"),
                        new PhoneHomeWorkStreams("+12 87", "stationary")
                ))
        );

        Client oldClient = clientList.stream()
                .filter(client -> client.getListPhone()
                        .stream()
                        .anyMatch(phone -> "stationary".equals(phone.getType())))
                .max((c1, c2) -> c1.getAge() - c2.getAge())
                .orElseThrow(() -> new NoSuchElementException("Нет клиентов, у которых все телефоны стационарные"));


        System.out.println(oldClient);

    }
}

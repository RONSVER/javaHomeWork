package org.example.prof.lessonEleven.homeWorkEleven.taskThreeHospital;

import java.util.Random;

/*
 3) Приложение больница : Имеется регистратура(класс) , в которую обращаются пациенты (класс),
    пациентов больше 15, очередь в регистратуру может составлять 7 человек, заполнять очередь, пока в ней есть места
    как только мест не хватает , остановить заполнения и начать обслуживать пациентов в очереди, назначать им терапию(класс)
    и отправлять в очередь к доктору, очередь доктора должна обслуживать сначала критичных пациентов, потом обычных
    Когда все пациенты из очереди разобраны в регистратуре, запустить новых и повторить процесс.
    На каждом этапе выводить в консоль состояние пациента, (в регистратуре, у доктора, свободен)
*/

public class HospitalApp {
    public static void main(String[] args) {
        Registry registry = new Registry();
        Random random = new Random();

        registry.addToRegistry(new Patient("Петя", random.nextBoolean()));
        registry.addToRegistry(new Patient("Вася", random.nextBoolean()));
        registry.addToRegistry(new Patient("Маша", random.nextBoolean()));
        registry.addToRegistry(new Patient("Катя", random.nextBoolean()));
        registry.addToRegistry(new Patient("Иван", random.nextBoolean()));
        registry.addToRegistry(new Patient("Аня", random.nextBoolean()));
        registry.addToRegistry(new Patient("Саша", random.nextBoolean()));
        registry.addToRegistry(new Patient("Дима", random.nextBoolean()));
        registry.addToRegistry(new Patient("Оля", random.nextBoolean()));
        registry.addToRegistry(new Patient("Коля", random.nextBoolean()));
        registry.addToRegistry(new Patient("Таня", random.nextBoolean()));
        registry.addToRegistry(new Patient("Рома", random.nextBoolean()));
        registry.addToRegistry(new Patient("Галя", random.nextBoolean()));
        registry.addToRegistry(new Patient("Ира", random.nextBoolean()));
        registry.addToRegistry(new Patient("Лена", random.nextBoolean()));

        Therapy therapy = new Therapy();
        Doctor doctor = new Doctor();

        registry.processPatient(therapy, doctor);

        System.out.println("Новая волна клиентов");

        registry.addToRegistry(new Patient("Миша", true));
        registry.addToRegistry(new Patient("Алена", false));

        registry.processPatient(therapy, doctor);
    }
}

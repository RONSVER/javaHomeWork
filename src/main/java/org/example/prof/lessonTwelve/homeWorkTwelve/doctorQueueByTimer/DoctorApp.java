package org.example.prof.lessonTwelve.homeWorkTwelve.doctorQueueByTimer;

public class DoctorApp {

    /*
        Используя одну из коллекций, напишите программу «Очередь к врачу».
        Пациенты могут бронировать любой временной слот
        (например, 1 - 9:00, 2 - 9:30, 3 - 10:00 и т.д.) для приёма у доктора,
        при этом указывая в записи своё имя.
        В день приёма программа должна выводить врачу имя следующего пациента строго в порядке номера временного слота.
    */

    public static void main(String[] args) {
        DoctorQueue doctorQueue = new DoctorQueue();

        doctorQueue.setInDocQueue("9:00", "Иванов");
        doctorQueue.setInDocQueue("9:30", "Петров");
        doctorQueue.setInDocQueue("10:00", "Сидоров");
        doctorQueue.setInDocQueue("8:20", "Максимов");
        doctorQueue.setInDocQueue("8:05", "Никитен");

        doctorQueue.printDocQueue();
        System.out.println();

        System.out.println("--------");

        doctorQueue.nextPatient();  // Ожидается вывод "Next patient for the doctor: Иванов"


        System.out.println();
        doctorQueue.printDocQueue();
    }
}
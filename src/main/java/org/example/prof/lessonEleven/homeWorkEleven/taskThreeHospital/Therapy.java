package org.example.prof.lessonEleven.homeWorkEleven.taskThreeHospital;

import java.util.LinkedList;
import java.util.Queue;

// Класс назначения терапии

public class Therapy {

    // Очередь терапии
    private Queue<Patient> queue = new LinkedList<>();

    // Добавления в очередь терапии
    public void addToTherapy(Patient patient) {
        queue.add(patient);
        System.out.println(patient.getName() + " назначена терапия.");
    }

    // Визуализация процесса терапии
    public void processPatient() {
        while (!queue.isEmpty()) {
            Patient patient = queue.poll();
            System.out.println("Пациент " + patient.getName() + " проходит терапию.");
        }
    }

}
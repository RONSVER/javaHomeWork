package org.example.prof.lessonEleven.homeWorkEleven.taskThreeHospital;

import java.util.PriorityQueue;
import java.util.Queue;

// Класс доктора
public class Doctor {
    // Приоритетная очередь - использую компаратор для выставления приоритета
    Queue<Patient> queue = new PriorityQueue<>(((o1, o2) -> Boolean.compare(!o1.isCritical(), !o2.isCritical())));

    // Метод добавления в очередь доктора
    public void addToDoctor(Patient patient) {
        queue.add(patient);
        System.out.println(patient.getName() + " добавлен в очередь к доктору.");
    }

    // Метод
    public void processPatient() {
        while(!queue.isEmpty()) {
            Patient patient = queue.poll();
            System.out.println("Доктор обслуживает " + (patient.isCritical() ? "Критического " : "обычного ") + "пациента " + patient.getName());
        }
    }
}
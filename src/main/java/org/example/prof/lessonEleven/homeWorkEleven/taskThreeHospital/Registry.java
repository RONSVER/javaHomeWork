package org.example.prof.lessonEleven.homeWorkEleven.taskThreeHospital;

import java.util.LinkedList;
import java.util.Queue;

// Класс регистратуры
public class Registry {
    // Класс регистратуры
    private Queue<Patient> queue = new LinkedList<>();

    // Максимальная длинна очереди
    int maxSizeQueue = 7;

    // Добавление в регистратуру
    public void addToRegistry(Patient patient) {
        if (queue.size() < maxSizeQueue) {
            queue.add(patient);
            System.out.println(patient.getName() + " добавлен в очередь в регистратуру.");
        } else {
            System.out.println("Очередь в регистратуре переполнена. Обслуживание начинается.");
            processPatient(new Therapy(), new Doctor());
        }
    }


    // Процесс отправки пациентов к доктору и назаначения терапий
    public void processPatient(Therapy therapy, Doctor doctor) {
        while(!queue.isEmpty()) {
            Patient patient = queue.poll();
            System.out.println("Пациент " + patient.getName() + " обслуживается в регистратуре.");
            therapy.addToTherapy(patient);
            doctor.addToDoctor(patient);
        }
    }
}
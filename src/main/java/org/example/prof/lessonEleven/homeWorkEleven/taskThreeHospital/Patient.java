package org.example.prof.lessonEleven.homeWorkEleven.taskThreeHospital;

// Класс пацинета
public class Patient {
    private final String name;
    private final boolean isCritical;

    public Patient(String name, boolean isCritical) {
        this.name = name;
        this.isCritical = isCritical;
    }

    public String getName() {
        return name;
    }

    public boolean isCritical() {
        return isCritical;
    }
}

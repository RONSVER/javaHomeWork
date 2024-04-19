package org.example.prof.lessonEleven.homeWorkEleven.taskTwo;

public class Passenger {
    private String namePassenger;
    private boolean firstClassPassenger;

    public Passenger(String namePassenger, boolean firstClassPassenger) {
        this.namePassenger = namePassenger;
        this.firstClassPassenger = firstClassPassenger;
    }

    public boolean getFirstClassPassenger() {
        return firstClassPassenger;
    }

    @Override
    public String toString() {
        return namePassenger + " isFirstClass: " + firstClassPassenger;
    }
}

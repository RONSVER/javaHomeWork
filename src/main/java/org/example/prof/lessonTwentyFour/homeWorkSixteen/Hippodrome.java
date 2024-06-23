package org.example.prof.lessonTwentyFour.homeWorkSixteen;

public class Hippodrome {

    public static void main(String[] args) {
        Horse alice = new Horse(100, 10);
        Horse mark = new Horse(200, 10);
        Horse carl = new Horse(300, 10);
        Horse bryan = new Horse(400, 10);
        Horse phil = new Horse(500, 10);

        new Thread(alice).start();
        new Thread(mark).start();
        new Thread(carl).start();
        new Thread(bryan).start();
        new Thread(phil).start();
    }
}

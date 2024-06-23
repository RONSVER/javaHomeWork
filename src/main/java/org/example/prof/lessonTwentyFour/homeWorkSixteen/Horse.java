package org.example.prof.lessonTwentyFour.homeWorkSixteen;

public class Horse implements Runnable {

    private final int number;

    private final int finish;

    private int currentSteps = 0;


    public Horse(int number, int finish) {
        this.number = number;
        this.finish = finish;
    }

    @Override
    public void run() {
        long timeStart = System.currentTimeMillis();
        System.out.println("Horse with number: " + number + " starts running in the loop");

          // through a for loop a fixed iterator for each
//        for (int i = 0; i < finish; i++) {
//            System.out.println("Horse with number: " + number + " is running " + (i + 1) + " time");
//            sleepHorse(2000);
//        }

        while (currentSteps < finish) {
            sleepHorse(10);
            System.out.println("Horse with number: " + number + " is running " + (currentSteps + 1) + " time");
            currentSteps += 1;
        }

        long timeEnd = System.currentTimeMillis() - timeStart;
        System.out.println("Horse with number: " + number + " ends running in the loop at time: " + timeEnd);
    }

    public void sleepHorse(int sec) {
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int getCurrentSteps() {
        return currentSteps;
    }
}

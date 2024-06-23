package org.example.prof.lessonTwentyFour.homeWorkSixteen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HorseTest {

    private Horse horse;
    private final int horseNumber = 1;
    private final int finish = 5;

    @BeforeEach
    void setUp() {
        horse = new Horse(horseNumber, finish);
    }

    @Test
    void testHorseRun() {
        // Run the horse in a separate thread
        Thread thread = new Thread(horse);
        thread.start();

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            fail("Thread was interrupted");
        }

        // Verify that the horse ran the correct number of steps
        assertEquals(finish, horse.getCurrentSteps(), "Horse did not finish the expected number of steps");
    }

    @Test
    void testSleepHorse() {
        long start = System.currentTimeMillis();
        horse.sleepHorse(100); // Sleep for 100 milliseconds
        long duration = System.currentTimeMillis() - start;

        // Allowing some margin for thread scheduling
        assertTrue(duration >= 100, "Sleep duration was too short");
        assertTrue(duration < 200, "Sleep duration was too long");
    }

}
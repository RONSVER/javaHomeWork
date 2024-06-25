package org.example.prof.lessonTwentyFive.homeWorkSeventeen;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.junit.jupiter.api.Assertions.*;

class EventCreatorTest {

    @Test
    void testEventCreate() throws InterruptedException {
        List<Event> eventList = new ArrayList<>();
        AtomicBoolean stopSignal = new AtomicBoolean(false);

        // Create event with thread
        Thread creatorThread = new Thread(new EventCreator(stopSignal, eventList));
        creatorThread.start();

        Thread.sleep(500);

        stopSignal.set(true);
        creatorThread.join();

        assertFalse(eventList.isEmpty());
    }

}
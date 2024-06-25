package org.example.prof.lessonTwentyFive.homeWorkSeventeen;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

class FirewallEventListenerTest {

    @Test
    void testFirewallEventListener() throws InterruptedException {
        List<Event> eventList = new ArrayList<>();
        List<String> logList = new ArrayList<>();
        AtomicBoolean stopSignal = new AtomicBoolean(false);
        AtomicInteger currentIndex = new AtomicInteger(0);

        for (int i = 0; i < 10; i++) {
            eventList.add(new Event("User" + i, "192.168.1." + i, LocalDate.now(), EventState.SUCCESS));
        }

        Thread thread = new Thread(new FirewallEventListener("Listener", eventList, logList, currentIndex, stopSignal));
        thread.start();

        Thread.sleep(500);

        stopSignal.set(true);
        thread.join();

        assertEquals(50, logList.size());
    }

}
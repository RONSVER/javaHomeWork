package org.example.prof.lessonTwentyFive.homeWorkSeventeen;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class EventCreator implements Runnable {

    private static final String[] USER_NAMES = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Ivy", "Jack"};
    private static final String[] USER_IPS = {"192.168.1.1", "192.168.1.2", "192.168.1.3", "192.168.1.4", "192.168.1.5", "192.168.1.6", "192.168.1.7", "192.168.1.8", "192.168.1.9", "192.168.1.10"};
    private static final EventState[] STATES = EventState.values();

    private final AtomicBoolean stopSignal;
    private final List<Event> eventList;

    public EventCreator(AtomicBoolean stopSignal, List<Event> eventList) {
        this.stopSignal = stopSignal;
        this.eventList = eventList;
    }

    @Override
    public void run() {
        while (!stopSignal.get()) {
            int randomIndex = (int) (Math.random() * USER_NAMES.length);
            Event event = new Event(USER_NAMES[randomIndex], USER_IPS[randomIndex], LocalDate.now(), randomEventState());

            synchronized (eventList) {
                eventList.add(event);
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    private EventState randomEventState() {
        return STATES[(int) (Math.random() * STATES.length)];
    }
}

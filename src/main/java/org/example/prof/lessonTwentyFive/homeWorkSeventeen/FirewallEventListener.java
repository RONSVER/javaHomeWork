package org.example.prof.lessonTwentyFive.homeWorkSeventeen;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;

public class FirewallEventListener implements Runnable {

    private final String name;

    private final List<Event> eventList;

    private final List<String> logList;

    private final AtomicInteger currentIndex;

    private final AtomicBoolean stopSignal;

    public FirewallEventListener(String name, List<Event> eventList, List<String> logList, AtomicInteger currentIndex, AtomicBoolean stopSignal) {
        this.name = name;
        this.eventList = eventList;
        this.logList = logList;
        this.currentIndex = currentIndex;
        this.stopSignal = stopSignal;
    }

    @Override
    public void run() {
        while (!stopSignal.get() || currentIndex.get() < eventList.size()) {
            int index = currentIndex.getAndIncrement();
            if (index < eventList.size()) {
                Event event = eventList.get(index);
                logEvent(event);
            }
        }
    }

    private void logEvent(Event event) {
        synchronized (logList) {
            logList.add("Обработчик " + name + " " + event.getEventId() + " " + event.getUserName());
            sleep(1);
            logList.add("Обработчик " + name + " " + event.getEventId() + " " + event.getUserIp());
            sleep(1);
            logList.add("Обработчик " + name + " " + event.getEventId() + " " + event.getEventDate());
            sleep(1);
            logList.add("Обработчик " + name + " " + event.getEventId() + " " + event.getEventState());
            sleep(1);
            logList.add("--------------------------");
        }
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

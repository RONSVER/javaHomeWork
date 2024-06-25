package org.example.prof.lessonTwentyFive.homeWorkSeventeen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class EventApp {

    public static void main(String[] args) {
        // vars
        List<Event> eventList = new ArrayList<>();
        List<String> logList = new ArrayList<>();
        AtomicBoolean stopSignal = new AtomicBoolean(false);
        AtomicInteger currentIndex = new AtomicInteger(0);

        // Create event with thread
        Thread creatorThread = new Thread(new EventCreator(stopSignal, eventList));
        creatorThread.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        Thread listenerThread1 = new Thread(new FirewallEventListener("Listener1", eventList, logList, currentIndex, stopSignal));
        Thread listenerThread2 = new Thread(new FirewallEventListener("Listener2", eventList, logList, currentIndex, stopSignal));
        Thread listenerThread3 = new Thread(new FirewallEventListener("Listener3", eventList, logList, currentIndex, stopSignal));
        Thread listenerThread4 = new Thread(new FirewallEventListener("Listener4", eventList, logList, currentIndex, stopSignal));

        listenerThread1.start();
        listenerThread2.start();
        listenerThread3.start();
        listenerThread4.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        stopSignal.set(true);

        try {
            creatorThread.join();
            listenerThread1.join();
            listenerThread2.join();
            listenerThread3.join();
            listenerThread4.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        logList.forEach(System.out::println);
    }
}

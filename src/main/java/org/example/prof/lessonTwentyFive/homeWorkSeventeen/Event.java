package org.example.prof.lessonTwentyFive.homeWorkSeventeen;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Event {

    private static int globalEventId = 0;

    private final int eventId;

    private final String userName;

    private final String userIp;

    private final LocalDate eventDate;

    private final EventState eventState;

    public Event(String userName, String userIp, LocalDate eventDate, EventState eventState) {
        synchronized (Event.class) {
            this.eventId = ++globalEventId;
        }
        this.userName = userName;
        this.userIp = userIp;
        this.eventDate = eventDate;
        this.eventState = eventState;
    }

}

package org.example.prof.lessonEleven.queue.exampleOne;

import java.util.Comparator;

public class RateComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (-1) * (o1.getRate() - o2.getRate());
    }
}

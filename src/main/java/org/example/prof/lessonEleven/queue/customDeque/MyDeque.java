package org.example.prof.lessonEleven.queue.customDeque;

import java.util.Iterator;

public interface MyDeque {
    void  addToHead(Integer element);
    void  addToTail(Integer element);

    Integer pollHead();
    Integer pollTail();

    Integer peekHead();
    Integer peekTail();

    boolean isEmpty();

    Iterator<Integer> iterator();
}

package org.example.prof.lessonSeven.homeWorkSeven;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomIterator implements Iterator {
    private int[] integers;
    private int indexIterator;

    public CustomIterator(int[] intArr) {
        this.integers = intArr;
        this.indexIterator = 0;
    }

    @Override
    public boolean hasNext() {
        return indexIterator < integers.length;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return integers[indexIterator++];
    }
}

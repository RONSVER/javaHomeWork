package org.example.prof.lessonTwentyThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {

    private ArrayService service = new ArrayService();

    @Test
    public void testMax() {
        int[] arr = {1, 2, 4, 6, 0};
        assertEquals(6, service.findMax(arr));
    }

    @Test
    public void testMin() {
        int[] arr = {1, 2, 4, 6, 0};
        assertEquals(0, service.findMin(arr));
    }

    @Test
    public void testMinWhenArrayIsEmpty() {
        assertThrows(ArrayInputException.class, () -> service.findMin(new int[0]));
    }

    @Test
    public void testMaxWhenArrayIsEmpty() {
        assertThrows(ArrayInputException.class, () -> service.findMax(new int[0]));
    }

    @Test
    public void testMaxWhenArrayIsNull() {
        assertThrows(ArrayInputException.class, () -> service.findMax(null));
    }

    @Test
    public void testMinWhenArrayIsNull() {
        assertThrows(ArrayInputException.class, () -> service.findMin(null));
    }
}
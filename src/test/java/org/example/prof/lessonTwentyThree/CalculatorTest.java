package org.example.prof.lessonTwentyThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    //assertEquals(то что должно быть, то что получилось)
    @Test
    public void testAdd() {
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    public void testSub() {
        assertEquals(8, calculator.sub(10, 2));
    }

}
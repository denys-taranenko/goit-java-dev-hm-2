package org.goit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    public void setUp() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testSumWithOne() {
        assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    public void testSumWithThree() {
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    public void testSumWithZero() {
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
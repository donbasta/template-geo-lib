package com.geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineTest {
    private static final double EPS = 1e-9;

    @Test
    void coincidePointsShouldReturnZeroLength() {
        Line line = new Line(1, 1, 1, 1);
        double length = line.getLength();
        assertEquals(0, length, EPS);
    }

    @Test
    void horizontalLineShouldReturnCorrectLength() {
        Line line = new Line(2, 1, 3, 1);
        double length = line.getLength();
        assertEquals(1, length, EPS);
    }

    @Test
    void verticalLineShouldReturnCorrectLength() {
        Line line = new Line(2, 1, 2, 3);
        double length = line.getLength();
        assertEquals(2, length, EPS);
    }
}

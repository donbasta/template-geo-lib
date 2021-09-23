package com.geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    void coincidePointsShouldReturnZeroLength() {
        Line line = new Line(1, 1, 1, 1);
        double length = line.getLength();
        assertEquals(0, length, 0.0001);
    }
}

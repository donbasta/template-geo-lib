package com.geometry;

public class Line {
    private final int x1;
    private final int x2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public double getLength() {
        return Math.abs(x1 - x2);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Shape {
    private Point start;
    private Point right;
    private Point left;

    public Triangle(Point start, Point right, Point left) {
        this.start = start;
        this.right = right;
        this.left = left;
    }

    @Override
    public List<Point> draw() {
        List<Point> points = new ArrayList<>();

        for (int i = left.x; i <= right.x; i++) {
            points.add(new Point(i, left.y));

        }
        for (int i = start.y; i <= left.y; i++) {
            points.add(new Point(left.x, i));

        }

        for (int i = start.x; i <= right.x ; i++) {
            points.add(new Point(i, i));

        }

        return points;
    }
}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class FilledRectangle implements Shape {
    private Point start;
    private Point end;

    public FilledRectangle(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public List<Point> draw() {
        List<Point> points = new ArrayList<>();

        for (int i = start.x; i <= end.x; i++) {
            for (int j = start.y; j <= end.y; j++) {
                points.add(new Point(i, j));

            }

        }
        return points;
    }
}



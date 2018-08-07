package com.company;

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Shape {

    private Point start;
    private Point end;

    @Override
    public List<Point> draw() {
        List <Point> points = new ArrayList<>();

        for (int i = start.x; i <= end.x; i++) {
            points.add(new Point(i, start.y));
            points.add(new Point(i, end.y));

        }

        for (int i = start.y; i <= end.y; i++) {
            points.add(new Point(start.x, i));
            points.add(new Point(end.x, i));

        }
        return points;
    }

    public Rectangle(Point start, Point end) {
        this.start = start;
        this.end = end;
    }


}

package com.company;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;
import java.util.List;

public class UI {
    Terminal terminal;
    public UI(Terminal terminal) {
        this.terminal = terminal;
    }

    public void drawShapes(List<Shape> list) {
        for (var shape : list) {
            List<Point> points = shape.draw();

            for (var point : points) {
                terminal.moveCursor(point.x, point.y);
                terminal.putCharacter('O');

            }
        }
        terminal.moveCursor(0, 0);
    }
}

package com.company;
import com.googlecode.lanterna.terminal.Terminal;
import java.util.List;

public class ZoomedUI implements UI {

    Terminal terminal;
    public ZoomedUI(Terminal terminal) {
        this.terminal = terminal;
    }

    @Override
    public void drawShapes(List<Shape> list) {
        for (var shape : list) {
            List<Point> points = shape.draw();

            for (var point : points) {
                int x = point.x*2;
                int y = point.y*2;
                terminal.moveCursor(x, y);
                terminal.putCharacter('O');
                terminal.moveCursor(x+1, y);
                terminal.putCharacter('O');
                terminal.moveCursor(x, y+1);
                terminal.putCharacter('O');
                terminal.moveCursor(x+1, y+1);
                terminal.putCharacter('O');


            }
        }
        terminal.moveCursor(0, 0);
    }
}

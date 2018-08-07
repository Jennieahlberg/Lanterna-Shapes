package com.company;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.terminal.Terminal;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();
        terminal.applyForegroundColor(Terminal.Color.RED);
        terminal.applyBackgroundColor(Terminal.Color.BLUE);
        terminal.setCursorVisible(false);

        Shape shape1 = new Rectangle(new Point(8,5), new Point (15,10));
        Shape shape2 = new Rectangle(new Point(2,2), new Point (5,8));
        Shape shape3 = new FilledRectangle(new Point(5,12), new Point (20,16));
        Shape shape4 = new Triangle(new Point(20, 20), new Point(30, 30), new Point(20, 30));

        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape1);
        shapes.add(shape2);
        shapes.add(shape3);
        shapes.add(shape4);

        UI gui = new StandardUI(terminal);
        gui.drawShapes(shapes);

//        UI gu = new ZoomedUI(terminal);
//        gu.drawShapes(shapes);


    }

}

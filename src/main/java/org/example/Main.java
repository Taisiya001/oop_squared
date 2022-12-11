package org.example;

import org.example.contrpller.Controller;
import org.example.model.Rectangle;
import org.example.model.Squared;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.addFigure(new Rectangle(3.0,4.0));
        controller.addFigure(new Squared(4.2));
        controller.sendOnConsole();
        controller.getAllAreas();
        controller.getAllPerimeter();
    }
}
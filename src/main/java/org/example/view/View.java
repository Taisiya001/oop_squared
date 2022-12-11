package org.example.view;

import org.example.model.Figure;

import java.util.List;

public class View {
    public void sendOnConsole(List<Figure> figures){
        for (Figure item: figures) {
            System.out.println(item);
        }
    }
    public  void sendArea(Double area){
        System.out.println("Area= " + area);
    }
    public  void sendPerimeter(Double perimeter){
        System.out.println("Perimeter= " + perimeter);
    }
}

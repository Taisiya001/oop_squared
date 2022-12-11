package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class RepositoryFigure implements Repository {
    List <Figure> figures;
    public RepositoryFigure(){
        this.figures = new ArrayList<>();
    }

    public double  getAllPerimeter() {
        double a = 0.0;
        for (Figure item : figures) {
            a = a + item.countPerimeter();
        }
        return a;
    }
    public double  getAllArea() {
        double b = 0.0;
        for (Figure item:figures) {
            b = b + item.countArea();
        }
        return b;
    }

    @Override
    public void add(Figure value) {
        this.figures.add(value);

    }
    public List<Figure> getFigures(){
        return figures;
    }
}

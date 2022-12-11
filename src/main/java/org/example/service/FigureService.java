package org.example.service;

import org.example.model.Figure;

import java.util.ArrayList;
import java.util.List;

public class FigureService {
    private final List<Figure> Figures;

   public FigureService(){
       this.Figures = new ArrayList<>();}

    public List<Figure> getFigures(){
       return Figures;
    }
}

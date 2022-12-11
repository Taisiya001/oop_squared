package org.example.contrpller;

import org.example.model.Figure;
import org.example.model.RepositoryFigure;
import org.example.service.FigureService;
import org.example.view.View;

import java.util.List;

public class Controller {
    private final RepositoryFigure repositoryFigure;
    private final View view;

    public Controller() {
        this.repositoryFigure = new RepositoryFigure();
        this.view = new View();
    }
    public void sendOnConsole(){
        view.sendOnConsole(this.repositoryFigure.getFigures());
        view.sendArea(this.repositoryFigure.getAllArea());
    }
    public void addFigure(Figure figure){
        this.repositoryFigure.add(figure);
    }
    public void getAllAreas(){
        this.repositoryFigure.getAllArea();
    }
    public void getAllPerimeter(){
        view.sendPerimeter(this.repositoryFigure.getAllPerimeter());
    }
    //private final FigureService figureService = new FigureService();
    //public void putFigure(){
    //    this.figureService.getFigures();
    //}
    //double area = this.repositoryFigure.getAllArea();
    //double perimeter = this.repositoryFigure.getAllPerimeter();
    //public double countArea(){
    //    return area;

    //}
    //public double countPerimeter(){
    //    return perimeter;
    //}
    //private final FigureService figureService;
//
    //public Controller() {
    //    this.figureService = new FigureService();
    //}
//
    //public void putFigure(Figure figure) {
    //    this.figureService.getFigures().add(figure);
    //}
//
    //public void countArea() {
    //    List<Figure> figureList = this.figureService.getFigures();
    //    for (Figure item:figureList) {
    //        System.out.println(item.countArea());
    //    }
    //}
//
    //public void countPerimeter() {
    //    List<Figure> figureList = this.figureService.getFigures();
    //    for (Figure item:figureList) {
    //        System.out.println(item.countPerimeter());;
    //    }
    //}
}//


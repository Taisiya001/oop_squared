package org.example.model;

public class Rectangle extends Polygon{
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide,double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double countPerimeter() {
        double res = (this.firstSide+this.secondSide)*2;
        return res;
    }

    @Override
    public double countArea() {
        double res = this.firstSide*this.secondSide;
        return res;
    }

    public double getFirstSide() {
        return firstSide;
    }


    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                '}' + "area= " + countArea() + "perimeter= " + countPerimeter();
    }
}

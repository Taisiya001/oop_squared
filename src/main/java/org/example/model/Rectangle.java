package org.example.model;

public class Rectangle extends Polygon{
    private double firstSide;
    private double secondSide;

    public Rectangle(double firstSide,double secondSide) {
        super(new double[]{firstSide,secondSide});
    }

    @Override
    public double countPerimetre() {
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


}

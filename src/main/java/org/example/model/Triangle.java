package org.example.model;

public class Triangle extends Polygon{
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide,double secondSide,double thirdSide) {
        this.firstSide = firstSide;this.secondSide = secondSide;
        this.thirdSide = thirdSide;}

    @Override
    public double countPerimeter() {
        return this.firstSide+this.secondSide+this.thirdSide;
    }

    @Override
    public double countArea() {
        return Math.sqrt(countPerimeter()*(countPerimeter()-this.firstSide)*
                (countPerimeter()-this.secondSide)*(countPerimeter()-this.thirdSide));
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getThirdSide() {
        return thirdSide;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                '}' + "area " + countArea() + "perimeter " + countPerimeter();
    }
}


package org.example.model;

public class Squared extends Rectangle{
    private double firstSide;

    public Squared(double firstSide) {
        super(firstSide,firstSide);
        this.firstSide = firstSide;
    }
    @Override
    public double countPerimeter() {
        double res = (this.firstSide)*4;
        return res;
    }

    @Override
    public double countArea() {
        double res = this.firstSide*this.firstSide;
        return res;
    }

    public double getFirstSide() {
        return firstSide;
    }

    @Override
    public String toString() {
        return "Squared{" +
                "firstSide=" + firstSide +
                '}' + "area= " + countArea() + "perimeter= " + countPerimeter();
    }
}


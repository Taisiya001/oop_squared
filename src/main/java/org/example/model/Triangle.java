package org.example.model;

public class Triangle extends Polygon{
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide,double secondSide,double thirdSide) {
        super(new double[]{firstSide,secondSide,thirdSide});
    }

    @Override
    public double countPerimetre() {
        return this.firstSide+this.secondSide+this.thirdSide;
    }

    @Override
    public double countArea() {
        return Math.sqrt(countPerimetre()*(countPerimetre()-this.firstSide)*
                (countPerimetre()-this.secondSide)*(countPerimetre()-this.thirdSide));
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
}

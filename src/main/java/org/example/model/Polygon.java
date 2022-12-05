package org.example.model;

public class Polygon implements Figure {
    private double[] sides;

    public Polygon(double[] sides) {
        this.sides = sides;
    }

    public double countPerimetre(){
        return 0;
    }


    @Override
    public double countArea() {
        return 0;
    }
}

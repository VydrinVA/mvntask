package ru.vydrin.work;

public class Cube extends SolidFigure{

    private double side;

    public Cube(double side) {
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0)
            this.side = side;
        else
            throw new IllegalArgumentException("Cube side must be greater then 0");
    }

    @Override
    public double getSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }
}

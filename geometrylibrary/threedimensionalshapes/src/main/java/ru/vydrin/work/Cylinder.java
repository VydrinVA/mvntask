package ru.vydrin.work;

public class Cylinder extends SolidFigure{

    private double height;

    private double radius;

    public Cylinder(double height, double radius) {
        setHeight(height);
        setRadius(radius);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException("Height must be greater than 0");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("Radius must be greater than 0");
    }

    @Override
    public double getSurfaceArea() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }
}

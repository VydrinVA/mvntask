package ru.vydrin.work;

public class Sphere extends SolidFigure{

    private double radius;

    public Sphere(double radius) {
        setRadius(radius);
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
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.8 * Math.PI * radius * radius * radius;
    }
}

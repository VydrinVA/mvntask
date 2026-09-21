package ru.vydrin.work.twodimensional;

public class Rectangle extends PlainShape {

    private double width;

    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return getName() +
                ": width = " +
                width +
                " height = " +
                height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            throw new IllegalArgumentException("Width must be greater than 0");
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
}

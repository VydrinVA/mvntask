package ru.vydrin.work.twodimensional;

public class Triangle extends PlainShape{

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (b + c > a)
            this.a = a;
        else
            throw new IllegalArgumentException("Side must be shorter than sum of other sides (%.2f)"
                    .formatted(b+c));
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (a + c > b)
            this.b = b;
        else
            throw new IllegalArgumentException("Side must be shorter than sum of other sides (%.2f)"
                    .formatted(a+c));

    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (a + b > c)
            this.c = c;
        else
            throw new IllegalArgumentException("Side must be shorter than sum of other sides (%.2f)"
                    .formatted(a+b));
    }
}

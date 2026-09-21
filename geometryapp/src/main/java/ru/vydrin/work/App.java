package ru.vydrin.work;

import ru.vydrin.work.twodimensional.Circle;
import ru.vydrin.work.twodimensional.Rectangle;
import ru.vydrin.work.twodimensional.Triangle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        createAndShowCircle();
        createAndShowRectangle();
        createAndShowTriangle();
    }

    private static void createAndShowTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }

    private static void createAndShowCircle() {
        Circle circle = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }

    private static void createAndShowRectangle() {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}

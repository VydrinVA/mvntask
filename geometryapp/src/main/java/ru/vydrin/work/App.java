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
        System.out.println("Test Circle");
        createAndShowCircle();
        System.out.println("Test Rectangle");
        createAndShowRectangle();
        System.out.println("Test Triangle");
        createAndShowTriangle();
        System.out.println("Test GeometryUtils");
        testGeometryUtils();
    }

    private static void createAndShowTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }

    private static void createAndShowCircle() {
        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }

    private static void createAndShowRectangle() {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }

    private static void testGeometryUtils() {
        Rectangle rectangle = new Rectangle(15, 15);
        Circle circle = new Circle(15);
        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(GeometryUtils.largerByArea(rectangle, circle) + " is larger by Area");
    }
}

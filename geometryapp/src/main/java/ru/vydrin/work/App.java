package ru.vydrin.work;

import ru.vydrin.work.twodimensional.Circle;
import ru.vydrin.work.twodimensional.PlainShape;
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
        System.out.println("Test Threedimensional");
        testThreedimensional();
    }

    private static void createAndShowTriangle() {
        PlainShape triangle = new Triangle(3, 4, 5);
        System.out.println(triangle);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }

    private static void createAndShowCircle() {
        PlainShape circle = new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }

    private static void createAndShowRectangle() {
        PlainShape rectangle = new Rectangle(5, 10);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }

    private static void testGeometryUtils() {
        PlainShape rectangle = new Rectangle(15, 15);
        Circle circle = new Circle(15);
        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(GeometryUtils.largerByArea(rectangle, circle) + " is larger by Area");
    }

    private static void testThreedimensional() {
        SolidFigure sphere = new Sphere(15);
        System.out.println(sphere);
        System.out.println(sphere.getSurfaceArea());
        System.out.println(sphere.getVolume());
    }

    private static void testCylinder() {
        SolidFigure cylinder = new Cylinder(10, 5);
        System.out.println(cylinder);
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getSurfaceArea());
    }
}

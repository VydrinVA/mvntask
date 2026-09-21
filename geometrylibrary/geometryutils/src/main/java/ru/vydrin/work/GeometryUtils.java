package ru.vydrin.work;

import ru.vydrin.work.twodimensional.PlainShape;

public final class GeometryUtils {

    private GeometryUtils() { }

    public static double centimetersInInches(double cm) {
        return cm * 2.54;
    }

    public static PlainShape largerByArea(PlainShape one, PlainShape two) {
        return one.getArea() >= two.getArea() ? one : two;
    }
}

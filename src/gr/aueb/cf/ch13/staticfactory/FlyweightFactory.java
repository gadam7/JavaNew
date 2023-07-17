package gr.aueb.cf.ch13.staticfactory;

import gr.aueb.cf.ch11.immutable.ImmutablePoint;

import java.util.ArrayList;
import java.util.List;

/**
 * No instances of this class should be available (Utility class).
 * <br>
 * This is also a facade design pattern. It provides a simplified
 * interface (i.e. factory) to a set of classes: {@link ImmutablePoint}
 * and {@link ImmutableCircle}
 * <br>
 * At the same time, this specific implementation
 * of facade, implements the Flyweight pattern
 */
public class FlyweightFactory {
    //  The following lists are acting like caches of the generated objects
    private static final List<ImmutablePoint> points = new ArrayList<>();
    private static final List<ImmutableCircle> circles = new ArrayList<>();

    private FlyweightFactory() {}

    public static ImmutablePoint getPoint(int x, int y) {
        ImmutablePoint point = null;

        if (!pointExists(x, y, point)) {
            point = new ImmutablePoint(x, y);
            points.add(point);
        }

        return point;
    }

    public static ImmutableCircle getCircle(ImmutablePoint center, int radius) {
        ImmutableCircle circle = null;

        if (!circleExists(center, radius, circle)) {
            circle = new ImmutableCircle(center, radius);
            circles.add(circle);
        }

        return circle;
    }

    private static boolean pointExists(int x, int y, ImmutablePoint point) {
        boolean found = false;
        point = null;

        for (ImmutablePoint p : points) {
            if ((p.getX() == x) && (p.getY() == y)) {
                point = p;
                found = true;
                break;
            }
        }

        return found;
    }

    private static boolean circleExists(ImmutablePoint point, int radius, ImmutableCircle circle) {
        boolean found = false;
        circle = null;

        for (ImmutableCircle c : circles) {
            if ((c.getCenter() == point) && (c.getRadius() == radius)) {
                circle = c;
                found = true;
                break;
            }
        }

        return found;
    }
}

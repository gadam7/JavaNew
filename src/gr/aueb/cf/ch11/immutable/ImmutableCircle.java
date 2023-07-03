package gr.aueb.cf.ch11.immutable;

import gr.aueb.cf.ch11.immutable.Point;

/**
 * Immutable Circle with Composition
 * of mutable object.
 */
public final class ImmutableCircle {
    private final Point center;     // Mutable point στο center
    private final int radius;

    public ImmutableCircle() {
        center = new Point();
        radius = 0;
    }

    public ImmutableCircle(Point center, int radius) {      // Προσοχή στον overloaded constructor, κάνουμε deep copy
        this.center = new Point(center.getX(), center.getY());
        this.radius = radius;
    }

    public Point getCenter() {      // Προσοχή στον getter, επιστρέφουμε deep copy
        return new Point(center.getX(), center.getY());
    }

    public int getRadius() {
        return radius;
    }

    public String convertToString() {
        return "Center: " + center.convertToString() + "Radius: " + radius;
    }
}

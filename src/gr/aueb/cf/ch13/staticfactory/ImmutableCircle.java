package gr.aueb.cf.ch13.staticfactory;

import gr.aueb.cf.ch11.immutable.ImmutablePoint;

/**
 * Defines an immutable circle.
 */
public final class ImmutableCircle {
    private final ImmutablePoint center;
    private final int radius;

    ImmutableCircle() {
        center = new ImmutablePoint();
        radius = 0;
    }

    ImmutableCircle(ImmutablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public ImmutablePoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "ImmutableCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}

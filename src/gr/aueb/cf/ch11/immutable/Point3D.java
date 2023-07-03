package gr.aueb.cf.ch11.immutable;

/**
 * Immutable Point3D.
 *
 * Point field refers to mutable object.
 * 1. Never initialize such a field
 *    to a client-provided reference
 * 2. Never return this field from
 *    an accessor (getter)
 *
 *    Make deep copies, instead.
 */
public class Point3D {
    private final Point point;
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY());
        this.z = z;
    }

    public Point getPoint() {
        return new Point(point.getX(), point.getY());
    }

    public int getZ() {
        return z;
    }

    public String convertToString() {
        return point.convertToString() + ", " + z;
    }
}

package gr.aueb.cf.ch11.immutable;

/**
 * Immutable 3D Point that contains an immutable Point.
 */
public final class Point3DImmutable {
    private final ImmutablePoint point;
    private final int z;

    public Point3DImmutable() {
        point = new ImmutablePoint();
        z = 0;
    }

    public Point3DImmutable(ImmutablePoint point, int z) {
        this.point = point;
        this.z = z;
    }

    public ImmutablePoint getPoint() {
        return point;
    }

    public int getZ() {
        return z;
    }

    public String convertToString() {
        return point.convertToString() + ", " + z;
    }
}

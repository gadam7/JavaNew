package gr.aueb.cf.ch11;

/**
 * Defines an immutable Point
 */
final class ImmutablePoint {
    private final int x;
    private final int y;

    ImmutablePoint() {
        x = 0;
        y = 0;
    }

    ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

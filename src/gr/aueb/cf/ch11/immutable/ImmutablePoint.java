package gr.aueb.cf.ch11.immutable;

/**
 * Immutable Point.
 */
public class ImmutablePoint {

    private final int x; // immutable
    private final int y;

    public ImmutablePoint() {
        x = 0;
        y = 0;
    }

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String convertToString() {
        return "(" + x + ", " + y + ")";
    }
}

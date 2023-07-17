package gr.aueb.cf.ch11;

import java.util.Random;

/**
 * A simple {@link Point} Java Bean.
 *
 * @version 1.1
 * @since 0.1
 * @author adminmacbook
 */
public class Point {
    private int x;
    private int y;

    /**
     * Initializes a newly created point,
     * so that it represents a (0, 0) point.
     */
    public Point() {}

    /**
     * Constructs a new Point with specific
     * (x, y) coordinates.
     *
     * @param x the x coordinate
     * @param y the y coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Static factory method.
     *
     * @return  a new Point instance.
     */
    public static Point getInstance() {
        return new Point();
    }

    public static Point getPoint() {
        return new Point();
    }

    /**
     * A static factory that returns
     * a (0, 0) new point.
     *
     * @return  a (0, 0) new point
     */
    public static Point getZeroPoint() {
        return new Point();
    }

    /**
     * A static factory that returns a random point
     * between (0..100, 0..100).
     *
     * @return  a random point between (0..100, 0..100)
     */
    public static Point getRandomPoint() {
        Random rnd = new Random(System.currentTimeMillis());
        return new Point(rnd.nextInt(101), rnd.nextInt(101));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String pointToString() {
        return "(" + x + ", " + y + ")";
    }
}

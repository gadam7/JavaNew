package gr.aueb.cf.ch12.model;

/**
 * The point class represents <i>points</i> in a
 * two-dimensional space, where <b>x</b> and <b>y</b>
 * coordinates are considered integers. All points,
 * such as (0, 0) or (5, 74) could be implemented as
 * instances of this class.
 *
 * Point Java Bean.
 */
public class Point {

    private int x;
    private int y;

    /**
     * Initializes a newly created point,
     * so hat it represents a (0, 0) point.
     */
    public Point() {}

    /**
     * Constructs a new Point with specific
     * (x, y) coordinates.
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets x-coordinate
     *
     * @return   the value of x-coordinate
     */
    public int getX() {
        return x;
    }

    /**
     * Sets x-coordinate
     *
     * @param x     the x-coordinate
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets y-coordinate
     *
     * @return   the value of y-coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * Sets y-coordinate
     *
     * @param y     the y-coordinate
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Returns the state of this point.
     *
     * @return  the x and y coordinates transformed into String (x, y).
     */
    public String pointToString() {
        return "(" + x + ", " + y + ")";
    }
}

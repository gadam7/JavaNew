package gr.aueb.cf.Projects.ch12;

/**
 * Represents a point in 3D space with coordinates (x, y, z).
 */
public class PointXYZ {
    private int x;
    private int y;
    private int z;

    /**
     * Default constructor. Initializes the point to (0, 0, 0).
     */
    public PointXYZ() {}

    /**
     * Overloaded Constructor with the specified coordinates.
     *
     * @param x The x-coordinate of the point.
     * @param y The y-coordinate of the point.
     * @param z The z-coordinate of the point.
     */
    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Gets the x-coordinate of the point.
     *
     * @return  the value of x-coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the x-coordinate of the point.
     *
     * @param x the new x-coordinate value.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets the y-coordinate of the point.
     *
     * @return the y-coordinate of the point.
     */
    public int getY() {
        return y;
    }

    /**
     * Sets the y-coordinate of the point.
     *
     * @param y the new y-coordinate value.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Gets the z-coordinate of the point.
     *
     * @return the z-coordinate of the point.
     */
    public int getZ() {
        return z;
    }

    /**
     * Sets the z-coordinate of the point.
     *
     * @param z the new z-coordinate value.
     */
    public void setZ(int z) {
        this.z = z;
    }

    /**
     * Converts the PointXYZ object to a string representation.
     *
     * @return a string representation of the PointXYZ object in the format "(x, y, z)".
     */
    public String convertToString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

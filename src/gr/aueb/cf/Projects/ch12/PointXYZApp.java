package gr.aueb.cf.Projects.ch12;

/**
 * A simple application to create PointXYZ points and call their methods.
 */
public class PointXYZApp {
    /**
     * The main entry point of the application.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Create PointXYZ instances
        PointXYZ point1 = new PointXYZ(1, 2, 3);
        PointXYZ point2 = new PointXYZ(4,5, 6);

        // Call convertToString() method and print the points
        System.out.println("Point 1: " + point1.convertToString());
        System.out.println("Point 2: " + point2.convertToString());
    }
}


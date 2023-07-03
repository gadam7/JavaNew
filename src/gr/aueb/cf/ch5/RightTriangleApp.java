package gr.aueb.cf.ch5;

import java.util.Scanner;
/**
 * Λαμβάνει 3 τιμές από τον χρήστη, τις
 * a, b, c όπου a είναι η υποτείνουσα και
 * b, c οι δύο πλευρές.
 *
 * Ελέγχει αν το τρίγωνο είναι ορθογώνιο, δηλαδή
 * a^2 == b^^2 + c^2.
 *
 * Έστω EPSILON = 0.000005 (έξι σημαντικά ψηφία)
 */
import java.util.Scanner;

public class RightTriangleApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of a (hypotenuse): ");
        double a = scanner.nextDouble();

        System.out.println("Enter the value of b (side): ");
        double b = scanner.nextDouble();

        System.out.println("Enter the value of c (side): ");
        double c = scanner.nextDouble();

        // Check if the triangle is right-angled
        boolean isRightAngled = isRightAngledTriangle(a, b, c);

        if (isRightAngled) {
            System.out.println("The triangle is right-angled.");
        } else {
            System.out.println("The triangle is not right-angled.");
        }
    }

    public static boolean isRightAngledTriangle(double a, double b, double c) {
        final double EPSILON = 0.000005; // Define epsilon value
        // Check if the triangle is right-angled using the condition a^2 == b^2 + c^2
        return Math.abs(a * a - (b * b + c * c)) < EPSILON;
    }
}

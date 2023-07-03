package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * Ο frog βρίσκεται στη θέση X και θέλει να φτάσει στη
 * θέση Y (ή σε θέση > Y). Ο frog jumps a fixed distance, D.
 *
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο small frog πρέπει
 * να κάνει ώστε να φτάσει (ή να ξεπεράσει) τον στόχο.
 *
 * Για παράδειγμα, αν έχουμε:
 * X = 10
 * Y = 85
 * D = 30,
 *
 * τότε ο small frog θα χρειαστεί 3 jumps, γιατί:
 * Starts at 10, και μετά το 1ο jump πάει στη θέση 10 + 30 = 40
 * Στο 2ο jump, πάει 40 + 30 = 70
 * Και στο 3ο jump, 70 + 30 = 100
 */
public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startPointX;
        int endPointY;
        int jump;
        int jumpsCount = 0;

        System.out.println("Please type X:, Y: and D:");
        startPointX = in.nextInt();
        endPointY = in.nextInt();
        jump = in.nextInt();

        for (int i = startPointX; i < endPointY; i = i + jump) {
            jumpsCount++;
        }

        System.out.println("Jumps Count: " + jumpsCount);
    }
}

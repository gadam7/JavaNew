package gr.aueb.cf.ch2;

/**
 * Calculates and prints the sum of i, j.
 */
public class IntPrint2Demo {

    public static void main(String[] args) {

        int i = 10;
        int j = 5;
        int sum;

        sum = i + j;

        System.out.println("The sum of " + i + " and " + j + " is: " + sum + ".");
        System.out.printf("The sum of %d and %d is: %d.%n", i, j, sum);
    }
}

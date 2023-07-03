package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Counts a^b.
 */
public class Power2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        int result = 1;
        int i =1;

        System.out.println("Please insert a and b");
        a = in.nextInt();
        b = in.nextInt();

        while (i <= b) {
            result *= a;
            i++;
        }

        System.out.printf("%d ^ %d = %d", a, b, result);
    }
}

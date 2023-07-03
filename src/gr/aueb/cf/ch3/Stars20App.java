package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Prints 20 stars.
 */
public class Stars20App {

    public static void main(String[] args) {

//        int i = 1;
//
//        while (i <= 20) {
//            System.out.print("*\n");
//            i++;
//        }

        Scanner in = new Scanner(System.in);
        int i = 1;
        int n;

        System.out.println("Insert number of iterations");
        n = in.nextInt();

        while (i <= n) {
            System.out.print("*\n");
            i++;
        }
    }
}

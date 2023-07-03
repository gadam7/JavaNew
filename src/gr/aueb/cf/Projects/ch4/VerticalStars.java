package gr.aueb.cf.Projects.ch4;

import java.util.Scanner;

public class VerticalStars {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of stars: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}

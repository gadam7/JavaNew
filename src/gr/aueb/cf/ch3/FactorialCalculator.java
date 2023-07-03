package gr.aueb.cf.ch3;

import java.util.Scanner;
public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();

        // Calculate the factorial of n
        int factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        // Print the factorial
        System.out.println(n + "! = " + factorial);
    }
}

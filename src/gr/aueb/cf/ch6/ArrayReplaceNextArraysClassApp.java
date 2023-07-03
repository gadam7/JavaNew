package gr.aueb.cf.ch6;

import java.util.Arrays;

public class ArrayReplaceNextArraysClassApp {

    public static void main(String[] args) {
        int[] ages = {20, 22, 23, 24, 26};

        // Truncates one item at RHS (Right Hand Side)
        ages = Arrays.copyOf(ages, ages.length - 1);

        // Adding and Padding with zero one position at RHS
        ages = Arrays.copyOf(ages, ages.length + 1);

        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}

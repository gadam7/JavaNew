package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * It takes as input the total score
 * and the number of courses and calculates
 * the average. Then gives feedback, 9-10 excellent,
 * 7-8 very good, 5-6 good, and below 5 fail.
 */
public class NestedIfApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int modulesCount;
        int totalMarks;
        int average;

        System.out.println("Please insert the sum of grades:");
        totalMarks = in.nextInt();

        System.out.println("Please insert modules count:");
        modulesCount = in.nextInt();

        if (modulesCount !=0) {
            average = totalMarks / modulesCount;

            if ((average >= 9) && (average <= 10)) {
                System.out.println("Excellent: " + average);
            } else if ((average >= 7) && (average <=8)) {
                System.out.println("Very Good: " + average);
            } else if ((average >= 5) && (average <= 6)) {
                System.out.println("Good: " + average);
            } else if ((average >= 0) && (average <= 4)) {
                System.out.println("Fail: " + average);
            } else {
                System.out.println("Error in input data");
            }
        } else {
            System.out.println("Modules count can not be zero");
        }
    }
}

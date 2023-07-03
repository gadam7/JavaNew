package gr.aueb.cf.Projects.ch9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This program reads student information, calculates the average, and saves the results to a file.
 */

public class StudentGradesApp {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int numStudents = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            PrintWriter logWriter = new PrintWriter(new FileWriter("/Users/adminmacbook/IdeaProjects/log.txt"));
            PrintWriter resultWriter = new PrintWriter(new FileWriter("/Users/adminmacbook/IdeaProjects/primOut.txt"));

            for (int i = 1; i <= numStudents; i++) {
                System.out.println("Student " + i + ":");

                System.out.print("Enter First Name: ");
                String firstName = sc.nextLine();

                System.out.print("Enter Last Name: ");
                String lastName = sc.nextLine();

                System.out.print("Enter Grade 1: ");
                int grade1 = sc.nextInt();

                System.out.print("Enter Grade 2: ");
                int grade2 = sc.nextInt();
                sc.nextLine(); // Consume the newline character

                // Calculate average
                double average = (grade1 + grade2) / 2.0;

                // Print to result file
                resultWriter.println("First Name: " + firstName);
                resultWriter.println("Last Name: " + lastName);
                resultWriter.println("Average: " + average);
                resultWriter.println();
            }

            logWriter.close();
            resultWriter.close();

            System.out.println("Results saved to primOut.txt");
            System.out.println("Log saved to log.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while processing the files.");
        }
    }
}


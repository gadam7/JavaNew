package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Εκτυπώνει σε αρχείο χαρακτήρες με τη χρήση
 * των PrintStream και PrintWriter.
 *
 * @author adminmacbook
 */
public class IOFilePrint {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("/Users/adminmacbook/IdeaProjects/IOSimpletest1.txt");
             PrintWriter pw = new PrintWriter("/Users/adminmacbook/IdeaProjects/IOSimpletest2.txt"))
        {
            ps.println("Hello World2! from PrintStream");
            pw.println("Hello World2! from PrintWriter");
        } catch (FileNotFoundException e) {
            System.out.println("Το αρχείο δεν βρέθηκε");
        }
    }
}

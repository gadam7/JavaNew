package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Prints text with PrintWriter.
 */

public class WriterApp {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("/Users/adminmacbook/test1.txt");
             PrintWriter pw = new PrintWriter("/Users/adminmacbook/test2.txt")) {
            ps.println("Hello CF! from print stream");
            pw.println("Hello CF! from print writer");
            pw.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File path not found");
        }
    }
}

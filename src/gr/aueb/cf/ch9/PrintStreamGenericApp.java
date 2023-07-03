package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamGenericApp {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("/Users/adminmacbook/cf.txt");

        printMessage(ps, "Hello World!");                       //  Prints to ps
        printMessage(System.out, "Hello Coding Factory!");      //  Prints to stdout
    }

    /**
     * Prints a string message to PrintStream.
     *
     * @param ps            the PrintStream object
     * @param message       the message to print
     */
    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}

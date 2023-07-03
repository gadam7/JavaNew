package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Flush2App {

    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("/Users/adminmacbook/IdeaProjects/flush-file.txt");
            pw.print("Hello");
            pw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

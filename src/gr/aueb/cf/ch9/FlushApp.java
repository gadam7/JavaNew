package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FlushApp {

    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("/Users/adminmacbook/IdeaProjects/flush-file.txt");
            pw.print("Hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

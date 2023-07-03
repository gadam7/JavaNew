package gr.aueb.cf.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MethodExceptions {

    public static void main(String[] args) {
        try {
            final Scanner in = getFileDescriptor("/Users/adminmacbook/random.txt");
            try (in) {
                String s = in.nextLine();
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error in file name");
        }
    }

    public static Scanner getFileDescriptor(String s) throws FileNotFoundException {
        File fd = new File(s);

        try {
            return new Scanner(fd);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw e;
        }
    }
}

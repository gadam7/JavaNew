package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyRawDataApp {

    public static void main(String[] args) {

        int b = 0;
        int count = 0;
        byte[] buffer = new byte[8192];
        long start, end;
        double elapsed;

        try (FileInputStream in = new FileInputStream("/Users/adminmacbook/IdeaProjects/trailer.mp4");
        FileOutputStream out = new FileOutputStream("/Users/adminmacbook/IdeaProjects/trailerout.mp4")) {

            start = System.currentTimeMillis();
            while ((b = in.read(buffer)) != -1) {
                out.write(buffer, 0, b);
                count += b;
            }
            end = System.currentTimeMillis();
            elapsed = (end - start) / 1000.0;
            System.out.println(elapsed + " secs");
            System.out.printf("%,.2f KB", Math.ceil((double) count / 1024));

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}

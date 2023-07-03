package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 * Checked exceptions could be addressed
 * using try/catch
 */
public class ThrowsVsTryCatch {

    public static void main(String[] args) {
        try {
            char ch = (char) System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Checked exceptions could be addressed
     * throwing the exception to the caller.
     *
     * @param args
     * @throws IOException
     */
    //public static void main(String[] args) throws IOException {
      //  char ch = (char) System.in.read();
    //}
}

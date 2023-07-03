package gr.aueb.cf.ch8;

import java.io.IOException;

/**
 *
 */
public class MethodReadCharException {

    public static void main(String[] args) {
        char ch;

        try {
            ch = readChar();
            System.out.println(ch);
        } catch (IOException e) {
            System.out.println("char read error");      //user friendly message
        }
    }

    public static char readChar() throws IOException {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            e.printStackTrace();        //  logging
            throw e;                    //  rethrow to caller
        }
    }
}

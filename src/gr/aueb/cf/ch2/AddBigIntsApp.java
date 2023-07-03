package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Demonstrates BigInteger class.
 */
public class AddBigIntsApp {

    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("2147483647");
        BigInteger bigNum2 = new BigInteger("2147483647");
        BigInteger result = bigNum1.add(bigNum2);

        System.out.printf("%,d", result);
    }
}

package gr.aueb.cf.ch2;

/**
 * Εμφανίζει τους τύπους δεδομένων
 * ακεραίων, το μέγεθος, και τα
 * MIN - MAX values.
 */
public class IntApp {

    public static void main(String[] args) {

        System.out.printf("Type: %s, Size: %d, Min: %,d, Max: %,d\n",
                Integer.TYPE, Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.printf("Type: %s, Size: %d, Min: %,d, Max: %,d\n",
                Byte.TYPE, Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);

        System.out.printf("Type: %s, Size: %d, Min: %,d, Max: %,d\n",
                Short.TYPE, Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("Type: %s, Size: %d, Min: %,d, Max: %,d\n",
                Long.TYPE, Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}

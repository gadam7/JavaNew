package gr.aueb.cf.ch5;

/**
 * Υπολογίζει το a^n αναδρομικά.
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {

    }

    /**
     * Recursive a^n.
     *
     * @param a     the base.
     * @param n     the power.
     * @return      the power of a .
     */
    public static float power(float a, float n) {
        if (n < 0) {
            return 1 / a * power(a, -n);
        }
        
        if (n == 0) return 1;

        return a * power(a, n-1);

    }
}

package gr.aueb.cf.ch3;

/**
 * Shows break and continue.
 */
public class BreakAndContinueDemo {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int result = 0;

        while (true) {
            if (i == 10) break;
            i++;
        }

        while (j <= 10) {
            j++;
            if (j == 5) continue;
            result += j;
        }
    }
}

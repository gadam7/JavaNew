package gr.aueb.cf.ch3;

/**
 * Counts the summary of ten first numbers,
 * 1 - 10.
 */
public class Sum10 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}

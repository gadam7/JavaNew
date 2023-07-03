package gr.aueb.cf.ch7;

/**
 * Prints repeated stars.
 */
public class RepeatMethod {

    public static void main(String[] args) {

        //  20 horizontal stars
        System.out.println("*" .repeat(20));

        // 10x10 stars
        for (int i = 1; i <= 10; i++) {
            System.out.println("*" .repeat(10));
        }
    }
}

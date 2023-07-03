package gr.aueb.cf.ch2;

/**
 * Uses class Math.random() that generates random decimal
 * numbers between 0 - 0.9, for example 0 <= randomNum < 1,
 * to give us random values between 1 - 6, like a die.
 */
public class RandomDemo {

    public static void main(String[] args) {

        int die = (int) (Math.random() * 6) + 1;
        System.out.println(die);
    }
}

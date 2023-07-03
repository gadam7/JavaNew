package gr.aueb.cf.ch6;

/**
 * Δήλωση πίνακα ακεραίων 3 θέσεων, populate (αρχικοποίηση τιμών) και εκτύπωση τιμών.
 */
public class ArrayApp {

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] =12;

        System.out.println("arr[0] = " + arr[0] + ", arr[1] = " + arr[1] + ", arr[2] = " + arr[2]);
    }
}

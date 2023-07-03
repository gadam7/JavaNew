package gr.aueb.cf.ch6;

/**
 * Searches for a key number in an array of ints.
 */

public class ArraySearchApp {

    public static void main(String[] args) {
        final int SECRET = 12;
        int[] arr = {1, 5, 9, 3, 12};
        boolean secretIsFound = false;

//        for (int item : arr) {
//            if (item == SECRET) {
//                secretIsFound = true;
//                break;
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            if (SECRET == arr[i]) {
                secretIsFound = true;
                break;
            }
        }

        if (secretIsFound) {
            System.out.println("Secret key was found");
        } else {
            System.out.println("Secret key was not found");
        }
    }
}

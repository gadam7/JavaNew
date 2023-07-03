package gr.aueb.cf.ch6;

/**
 * Finds the min pos and val of an int-array
 * based on a generic method.
 *
 * @author adminmacbook
 */
public class ArrayMinGenericMethodApp {

    public static void main(String[] args) {
        int[] grades = {4, 8, 10, 3, 6, 2, 1, 4};
        int minPosition = 0;

        minPosition = getMinPosition(grades, 0, grades.length - 1);

        // Κάνουμε μια διόρθωση στο minPosition (+1, οπότε) για να είναι user-friendly
        System.out.printf("Min Value %d, Min Position: %d", grades[minPosition], minPosition + 1);
    }

    /**
     * Returns the position of the min value in a source array.
     *
     * @param arr       the source array
     * @param low       starting position in the array
     * @param high      ending position in the array
     * @return          the position of the array containing the least element value
     */
    public static int getMinPosition(int[] arr, int low, int high) {
        int minPosition = low;
        int minValue;

        if ((low < 0) || (high > arr.length - 1 )) {
            System.out.println("Error in array dimensions");
            return -1;      // Returns an invalid position
        }

        minValue = arr[low];
        for (int i = low; i <= high; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }

        return minPosition;
    }
}

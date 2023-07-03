package gr.aueb.cf.ch10;

/**
 * Finds the second min of an array of integers.
 */
public class ProjectSecondMin {

    public static void main(String[] args) {

    }

    public static int getSecondMinPosition(int[] arr) {
        int min = 0;
        int secondMin = 0;
        int minVal = 0;
        int secondMinVal = 0;

        if (arr == null) return -1;
        if (arr.length < 2) return -1;

        minVal = arr[0];
        secondMinVal = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal && arr[i] < secondMinVal) {
                secondMin = min;
                secondMinVal = minVal;
                min = i;
                minVal = arr[i];

            } else if (arr[i] > minVal && arr[i] < secondMinVal) {
                secondMin = i;
                secondMinVal = arr[i];
            }
        }

        return secondMin;
    }
}

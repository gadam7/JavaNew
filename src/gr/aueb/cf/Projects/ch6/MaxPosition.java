package gr.aueb.cf.Projects.ch6;

/**
 * Develops a generic method for finding the maximum of an array getMaxPosition(int[] arr, int low, int high),
 * that returns the position in array arr of the maximum element of the array
 */
public class MaxPosition {

    public static void main(String[] args) {
        int[] arr = {25, 33, 9, 12, 18, 7};
        int maxPosition = getMaxPosition(arr, 0, arr.length - 1);

        System.out.println("Max element is at position " + maxPosition);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        if (low == high) {
            return low;
        }

        int mid = (low + high) / 2;
        int leftMaxPosition = getMaxPosition(arr, low, mid);
        int rightMaxPosition = getMaxPosition(arr, mid + 1, high);

        if (arr[leftMaxPosition] > arr[rightMaxPosition]) {
            return leftMaxPosition;
        } else {
            return rightMaxPosition;
        }
    }
}

package gr.aueb.cf.ch10;

/**
 * Finds the position in an array of the max element
 * of the array.
 */
public class ProjectCh6 {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 6, 8, 14, 9};
        int maxPos;

        maxPos = getMaxPosition(arr, 0, arr.length - 1);
        if (maxPos == -1) {
            System.out.println("Error");
            System.exit(-1);
        }

        System.out.printf("Position: %d, Value: %d", maxPos, arr[maxPos]);
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int maxPos = 0;
        int maxVal = 0;

        if (arr == null || arr.length == 0 || low < 0 || high > arr.length -1 || low > high)
            return -1;

        maxVal = arr[low];
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                maxPos = i;
            }
        }

        return maxPos;
    }
}

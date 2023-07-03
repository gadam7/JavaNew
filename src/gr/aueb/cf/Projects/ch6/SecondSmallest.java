package gr.aueb.cf.Projects.ch6;

/**
 * Develops a program that finds the 2nd smallest element of an array,
 * i.e. the element immediately larger than the smallest element
 */
public class SecondSmallest {

    public static void main(String[] args) {
        int[] arr = {14, 20, 5, 10, 13};
        int secondSmallest = findSecondSmallest(arr);

        System.out.println("The second smallest element in the array is " + secondSmallest);
    }

    public static int findSecondSmallest(int[] arr) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;


        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest;
    }
}

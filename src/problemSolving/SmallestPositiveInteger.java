package problemSolving;

import java.util.Arrays;

public class SmallestPositiveInteger {
    /*
    Find the smallest positive integer value that cannot be represented as sum of any subset of a given array
     */
    static int findSmallestNumber(int[] arr) {

        int maxPossible = arr[0];
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxPossible + 1) {
                return maxPossible + 1;
            } else maxPossible += arr[i];
        }
        return maxPossible + 1;
    }

    public static void main(String[] args) {
//        int[] arr = new int[] {1, 10, 3, 11, 6, 15};
//        int[] arr = new int[] {1, 1, 1, 1};
//        int[] arr = new int[]{1, 1, 3, 4};
//        int[] arr = new int[]{1, 2, 5, 10, 20, 40};
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(findSmallestNumber(arr));
    }
}

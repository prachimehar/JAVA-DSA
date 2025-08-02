package Arrays;

import java.util.Arrays;

public class sort1HalfInAscendingAnd2HalfInDescending {
    public static void main(String[] args) {
        // by Brute Force
        int[] arr = {1, 90, 34, 89, 7, 9};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length/2; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = arr.length-1; i >= arr.length/2; i--) {
            System.out.print(arr[i]+" ");
        }

    }
}

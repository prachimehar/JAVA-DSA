package Arrays;

import java.util.Arrays;

public class SortColors {
    //Sort 0s, 1s, and 2s (Dutch National Flag)
    private static void sortColors(int[] arr) {
        int i = 0, j = 0, k = arr.length-1;
        while(i <= k){
            if(arr[i] == 0){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j++;
            }
            else if(arr[i] == 1){
                i++;
            }
            else{
                int t = arr[i];
                arr[i] = arr[k];
                arr[k] = t;
                k--;
            }
        }
    }

    public static void main(String[] args) {
        int[]  nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

package Arrays;

import java.util.Arrays;

public class sorting{
    public static void main(String[] args) {
        int[] arr = {1,4,7,2,5};
        for (int i = 0; i <arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

package Arrays;

import java.util.Arrays;

public class pushAllZerosToEnd {
    public static void pushZerosToEnd(int[] arr) {
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }

    }
    public static void main(String[] args) {
        int[] arr = {0,2,0,0,8};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}

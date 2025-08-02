package Arrays;

import java.util.Arrays;

public class rev {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        // Method 1 by rev for loop
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
        // Method 2 By 2 pointers
        int s = 0,e = arr.length-1;
        while(s <= e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));
        //by recursion
        rev(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println((arr[i]+" "));
        }
    }
    //Method 3 by recursion
    public static void rev(int[] arr , int s,int e){
        if(s >= e) return;
        int t = arr[s];
        arr[s] = arr[e];
        arr[e] = t;
        rev(arr,s+1,e-1);
    }
}

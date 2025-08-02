package Arrays;

import java.util.Scanner;

public class secondSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                secMin = min;
                min = arr[i];
            }
            else if(arr[i] < secMin && arr[i] != min){
                secMin = arr[i];
            }
        }
        System.out.println( secMin);
    }
}

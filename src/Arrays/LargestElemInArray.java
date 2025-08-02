package Arrays;

import java.util.Scanner;

public class LargestElemInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        System.out.println("Maximum element is  "+ arr[max] +" at index "+ max);
    }
}

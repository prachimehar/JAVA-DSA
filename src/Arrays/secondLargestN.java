package Arrays;

import java.util.Scanner;

public class secondLargestN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max){
                 secMax = max;
                 max = arr[i];
            }
            if(arr[i] != max && arr[i] > secMax){
                secMax = arr[i];
            }
        }
        System.out.println(secMax);

    }
}

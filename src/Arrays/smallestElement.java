package Arrays;

import java.util.Scanner;

public class smallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int min = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        System.out.println("Smallest Element is  "+ arr[min] +" at index "+ min);
    }
}

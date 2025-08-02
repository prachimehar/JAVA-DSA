package Arrays;

import java.util.Scanner;

public class sumOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is :"+ sum);
        int ans = sum(arr,arr.length-1);

        System.out.println("Sum by recursion  : "+ ans);
        int ans1 = sumR(arr,0);

        System.out.println("Sum by recursion  : "+ ans1);
    }
    // by using recursion bottom up approach
    public static int sum(int[ ]arr,int i){
        if(i < 0) return 0;
        return arr[i] + sum(arr,i-1);
    }

    // by using recursion bottom up approach
    public static int sumR(int[ ]arr,int i){
        if(i >= arr.length) return 0;
        return arr[i] + sumR(arr,i+1);
    }
}

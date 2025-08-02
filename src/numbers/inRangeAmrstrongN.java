package numbers;

import java.util.Scanner;

public class inRangeAmrstrongN {
    public static void main(String[] args) {
        // Time complexity - O(N*D) and Space complexity - O(1) ---------------
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i = start; i <= end; i++){
            int sum = 0;
            int temp = i , len = length(i);
            while( temp != 0){
                int rem = temp % 10;
                sum += (int)Math.pow(rem,len);
                temp /= 10;
            }
            if(sum == i){
                System.out.println(sum + " ");
            }
        }
    }
    public static int length(int n){
        if(n == 0) return 1;
        n = Math.abs(n);

        int c = 0;
        while(n != 0){
            n = n/10;
            c++;
        }
        return c;
    }

    // By Recursion --

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int start = sc.nextInt();
//        int end = sc.nextInt();
//        for(int i = start; i<= end; i++){
//            int len = length(i);
//            if(i == armStrongN(i,len)){
//                System.out.println(i+" ");
//            }
//        }
//
//    }
//    public static int length(int n){
//        if(n == 0) return 1;
//        n = Math.abs(n);
//        int c=0;
//        while( n!=0 ){
//            n/=10;
//            c++;
//        }
//        return c;
//    }
//    public static int armStrongN(int n , int length){
//        if(n == 0) return 0;
//        int rem = n%10;
//        return (int) Math.pow(rem,length) + armStrongN(n/10,length);
//    }

}

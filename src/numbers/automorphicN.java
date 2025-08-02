package numbers;

import java.util.Scanner;

public class automorphicN {

    public static boolean isAutomorphic(int n){
        int length = String.valueOf(n).length();
        int sqrt = n*n;
        int lastDigit = sqrt % (int)Math.pow(10,length);
        return lastDigit == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end ; i++) {
            if(isAutomorphic(i)){
                System.out.print(i+" ");
            }
        }


    }
}

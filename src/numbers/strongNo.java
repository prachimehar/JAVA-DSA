package numbers;

import java.util.Scanner;

public class strongNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum += fact(rem);
            n/=10;
        }
        if(sum == temp) System.out.println("Strong No.");
        else System.out.println("Not Strong No.");


    }
    public static int fact(int n){
        if (n == 0 || n == 1)
            return 1;
        else
            return n * fact(n - 1);

    }
}

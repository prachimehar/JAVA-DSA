package numbers;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));

        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        System.out.println(fact);


    }
    public static int fact(int n){
        if(n == 0 || n == 1) return 1;
        return n * fact(n-1);

    }
}

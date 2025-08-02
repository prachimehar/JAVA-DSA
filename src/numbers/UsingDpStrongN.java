package numbers;

import java.util.Scanner;

public class UsingDpStrongN {

    static int[] fact = new int[10];

    public static void fact(){
        fact[0] = 1;
        for(int i=1; i<=9; i++){
            fact[i] = fact[i-1]*i;
        }
    }

    public static boolean isStrong(int n){
        int temp = n;
        int sum = 0;
        while(n != 0){
            int rem = n%10;
            sum +=fact[rem];
            n/=10;
        }
        return (sum == temp);

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact();
        if(isStrong(n)) System.out.println("Strong Number");
        else System.out.println("not Strong Number");


    }
}


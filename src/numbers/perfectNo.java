package numbers;

import java.util.Scanner;

public class perfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i=1; i<= n/2; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(sum == n) System.out.println("Perfect Number");
        else System.out.println("Not Perfect Number");

        if (isPerfect(n))
            System.out.println("Perfect");
        else
            System.out.println("Not Perfect");
    }

    public static int sumOfDivisors(int n, int i) {
        if (i == 1)
            return 1;
        if (n % i == 0)
            return i + sumOfDivisors(n, i - 1);
        else
            return sumOfDivisors(n, i - 1);
    }

    public static boolean isPerfect(int n) {
        if (n <= 1)
            return false;
        int sum = sumOfDivisors(n, n / 2); // check only up to n/2
        return sum == n;
    }
}

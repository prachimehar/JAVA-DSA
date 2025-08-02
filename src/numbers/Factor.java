package numbers;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println(i+" ");
                if (i != n / i) {
                    System.out.println((n / i) + " ");
                }
            }
        }
        System.out.println("-------------------------");
        for(int i=1; i<= n; i++){
            if(n % i == 0){
                System.out.println(i+" ");
            }
        }
        System.out.println("-------------------------");
        for(int i=1; i<= n/2; i++){
            if(n % i == 0){
                System.out.println(i+" ");
            }
        }
        System.out.println(n);
    }
}

package numbers;

import java.util.Scanner;

public class harshadN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum += rem;
            n/=10;
        }
        if(temp % sum == 0){
            System.out.println("Harshad No.");
        }
        else{
            System.out.println("Not Harshad No.");
        }

        

    }
}

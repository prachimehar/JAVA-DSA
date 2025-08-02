package numbers;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = sc.nextInt();
        int ans = 1;
        for(int i=1; i<= power; i++){
            ans *= n;
        }
        System.out.println(ans);

        System.out.println(Power(2,4));
    }
    public static int Power(int base,int exponent){
        if(exponent == 0) return 1;
        return base * Power(base,exponent-1);
    }
}

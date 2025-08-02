package numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class usingDpFibonacci {
    public static void main(String[] args) {
        int n = 3;
        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        int i =2;
        while(true){
            fib[i] = fib[i-1] + fib[i-2];
            if(fib[i] > n) break;
            i++;
        }
        System.out.println(Arrays.toString(fib));
        for (int j = 0; j < i ; j++) {
            System.out.print(fib[j]+" ");
        }

        System.out.println();
        System.out.println("nth fibonacci: "+ fibonacci(n));

        // if want to avoid guessing the size: then use arraylist
        List<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        while(true){
            int next = fibo.get(fibo.size()-1) + fibo.get(fibo.size()-2);
            if(next > n) break;
            fibo.add(next);
        }
        System.out.println(fibo);
    }
    static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

}

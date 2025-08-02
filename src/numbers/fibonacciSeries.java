package numbers;

public class fibonacciSeries {
    public static void main(String[] args) {
        // print Nth fibonacci series no.
        int n =3;
        System.out.println(fibo(n));
        // print first 3
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i)+" ");
        }
        System.out.println();
        // printing upto limit
        int limit = 5;
        printFiboUpto(limit, 0, 1);
        System.out.println();
        // by iteration
        int m = 8;
        int a = 0, b =1;
        while(a <= m){
            System.out.print(a+" ");
            int next = a+b;
            a = b;
            b = next;
        }

    }
    public static int fibo(int n){
        if(n <= 1) return n;
        return fibo(n-1)+fibo(n-2);
    }
    public static void printFiboUpto(int limit, int a, int b) {
        if (a > limit) return;
        System.out.print(a + " ");
        printFiboUpto(limit, b, a + b);

    }
}

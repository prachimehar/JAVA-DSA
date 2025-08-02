package Patterns;

public class Pyramid {
    public static void main(String[] args) {
        int n=3;
        for (int i=0; i<n; i++) {
            for (int j=n-i; j>1; j--)
                System.out.print(" ");
            for (int j=0; j<=i; j++ )
                System.out.print(" *");
            System.out.println();
        }

        System.out.println(".....................");
        //inverted
        for (int i=n-1; i>=0; i--)
        {
            for (int j=n-i; j>1; j--)
                System.out.print(" ");
            for (int j=0; j<=i; j++ )
                System.out.print(" *");
            System.out.println();
        }
        // number 1 12 123 1234
        for (int i=0; i<n; i++) {
            for (int j=n-i; j>1; j--)
                System.out.print(" ");
            for (int j=1; j<=i; j++ )
                System.out.print(j+" ");
            System.out.println();
        }
        // 1 23 456 789
        int c=0;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                c++;
                System.out.print(c);
            }
            System.out.println();
        }
        // 3 45 678
        int m=3;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(m);
                m++;
            }
            System.out.println();
        }
        // 3 44 555 6666
        int k = 3;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++ ) {
                System.out.print(k + " ");
            }
            k++;
            System.out.println();
        }
        

    }
}

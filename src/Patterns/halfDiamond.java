package Patterns;

public class halfDiamond {
    public static void main(String[] args) {
        int row = 4;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <=i ; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = row-1; i >= 1; i--) {
            for (int j = 1; j <=i ; j++)
                System.out.print("* ");
            System.out.println();
        }
        // mirrored half diamond

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = row-1; i >= 1; i--) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 3 44 555 , 555, 44 3
        int k = 3;
        for (int i=1; i<=row; i++) {
            for (int j=1; j<=i; j++ ) {
                System.out.print(k + " ");
            }
            k++;
            System.out.println();
        }
        k = k-2;
        for (int i= row-1; i>= 1; i--) {
            for (int j=1; j<=i; j++ ) {
                System.out.print(k + " ");
            }
            k--;
            System.out.println();
        }

        // 2 34 567 891011 891011 567 34 2
        int num = 2;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        int totalNumbers = (row * (row + 1)) / 2;
        num--;
        // Now print bottom half
        for (int i = row; i >= 1; i--) {
            num -= i;
            int temp = num + 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }


}
